// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RevokeRolesFromUserRequest extends TeaModel {
    /**
     * <p>The list of roles to be deleted.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleNames")
    public java.util.List<String> roleNames;

    /**
     * <p>Remove the user /role. The format of the name must meet the following requirements:</p>
     * <ul>
     * <li>RAM user: acs:ram::[accountId]:user/[userName].</li>
     * <li>RAM role: acs:ram::[accountId]:role/[roleName].</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
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
