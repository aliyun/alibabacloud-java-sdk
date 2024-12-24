// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GrantRoleToUsersRequest extends TeaModel {
    /**
     * <p>The name of the role.</p>
     * 
     * <strong>example:</strong>
     * <p>test_role_8</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>Specify the authorized users or roles. The format of the name must meet the following requirements:</p>
     * <ul>
     * <li>RAM user: acs:ram::[accountId]:user/[userName].</li>
     * <li>RAM role: acs:ram::[accountId]:role/[roleName].</li>
     * </ul>
     */
    @NameInMap("Users")
    public java.util.List<Principal> users;

    public static GrantRoleToUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantRoleToUsersRequest self = new GrantRoleToUsersRequest();
        return TeaModel.build(map, self);
    }

    public GrantRoleToUsersRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public GrantRoleToUsersRequest setUsers(java.util.List<Principal> users) {
        this.users = users;
        return this;
    }
    public java.util.List<Principal> getUsers() {
        return this.users;
    }

}
