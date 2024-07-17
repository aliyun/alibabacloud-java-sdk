// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GrantRolesToUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleNames")
    public java.util.List<String> roleNames;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("User")
    public Principal user;

    public static GrantRolesToUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantRolesToUserRequest self = new GrantRolesToUserRequest();
        return TeaModel.build(map, self);
    }

    public GrantRolesToUserRequest setRoleNames(java.util.List<String> roleNames) {
        this.roleNames = roleNames;
        return this;
    }
    public java.util.List<String> getRoleNames() {
        return this.roleNames;
    }

    public GrantRolesToUserRequest setUser(Principal user) {
        this.user = user;
        return this;
    }
    public Principal getUser() {
        return this.user;
    }

}
