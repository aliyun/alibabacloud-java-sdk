// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RevokeRoleFromUsersRequest extends TeaModel {
    /**
     * <p>The role to be removed.</p>
     * 
     * <strong>example:</strong>
     * <p>test_role_3</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The list of users or roles to be removed. The format of the name must meet the following requirements:</p>
     * <ul>
     * <li>RAM user: acs:ram::[accountId]:user/[userName].</li>
     * <li>RAM role: acs:ram::[accountId]:role/[roleName].</li>
     * </ul>
     */
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
