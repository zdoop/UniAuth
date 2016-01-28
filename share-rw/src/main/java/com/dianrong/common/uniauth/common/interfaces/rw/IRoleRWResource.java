package com.dianrong.common.uniauth.common.interfaces.rw;

import com.dianrong.common.uniauth.common.bean.Response;
import com.dianrong.common.uniauth.common.bean.dto.RoleDto;
import com.dianrong.common.uniauth.common.bean.request.GroupTreeParam;
import com.dianrong.common.uniauth.common.bean.request.PrimaryKeyParam;
import com.dianrong.common.uniauth.common.bean.request.RoleParam;
import com.dianrong.common.uniauth.common.interfaces.read.IRoleResource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;


public interface IRoleRWResource extends IRoleResource {

    @POST
    @Path("addnewrole")
    //scenario: add new role
    Response<RoleDto> addNewRole(RoleParam roleParam);
    
    @POST
    @Path("updaterole")
    //scenario: update role
    Response<Void> updateRole(RoleParam roleParam);
    
    @POST
    @Path("deleterole")
    //scenario: delete role
    Response<Void> deleteRole(PrimaryKeyParam primaryKeyParam);
    
    @POST
    @Path("savepermstorole")
    //scenario: save permissions to a role
    Response<Void> savePermsToRole(RoleParam roleParam);
    
}
