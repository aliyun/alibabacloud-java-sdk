// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RevokeRoleFromUsersRequest extends TeaModel {
    // 待revoke的角色
    @NameInMap("RoleName")
    public String roleName;

    // 待revoke的用户列表
    @NameInMap("Users")
    public java.util.List<Principal> users;

    public static RevokeRoleFromUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeRoleFromUsersRequest self = new RevokeRoleFromUsersRequest();
        return TeaModel.build(map, self);
    }

    public RevokeRoleFromUsersRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public RevokeRoleFromUsersRequest setUsers(java.util.List<Principal> users) {
        this.users = users;
        return this;
    }
    public java.util.List<Principal> getUsers() {
        return this.users;
    }

}
