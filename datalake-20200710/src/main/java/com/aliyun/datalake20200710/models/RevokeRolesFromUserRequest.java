// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RevokeRolesFromUserRequest extends TeaModel {
    // 待删除的角色列表
    @NameInMap("RoleNames")
    public java.util.List<String> roleNames;

    // 针对该用户进行revoke
    @NameInMap("User")
    public Principal user;

    public static RevokeRolesFromUserRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeRolesFromUserRequest self = new RevokeRolesFromUserRequest();
        return TeaModel.build(map, self);
    }

    public RevokeRolesFromUserRequest setRoleNames(java.util.List<String> roleNames) {
        this.roleNames = roleNames;
        return this;
    }
    public java.util.List<String> getRoleNames() {
        return this.roleNames;
    }

    public RevokeRolesFromUserRequest setUser(Principal user) {
        this.user = user;
        return this;
    }
    public Principal getUser() {
        return this.user;
    }

}
