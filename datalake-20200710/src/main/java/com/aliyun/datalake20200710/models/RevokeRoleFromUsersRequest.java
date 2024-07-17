// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RevokeRoleFromUsersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test_role_3</p>
     */
    @NameInMap("RoleName")
    public String roleName;

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
