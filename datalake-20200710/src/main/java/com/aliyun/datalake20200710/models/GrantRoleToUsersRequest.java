// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GrantRoleToUsersRequest extends TeaModel {
    /**
     * <p>RoleName</p>
     * 
     * <strong>example:</strong>
     * <p>test_role_8</p>
     */
    @NameInMap("RoleName")
    public String roleName;

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
