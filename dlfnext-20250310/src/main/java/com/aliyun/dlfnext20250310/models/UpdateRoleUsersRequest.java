// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class UpdateRoleUsersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acs:dlf::[accountId]:role/role_name</p>
     */
    @NameInMap("rolePrincipal")
    public String rolePrincipal;

    @NameInMap("userPrincipals")
    public java.util.List<String> userPrincipals;

    public static UpdateRoleUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleUsersRequest self = new UpdateRoleUsersRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoleUsersRequest setRolePrincipal(String rolePrincipal) {
        this.rolePrincipal = rolePrincipal;
        return this;
    }
    public String getRolePrincipal() {
        return this.rolePrincipal;
    }

    public UpdateRoleUsersRequest setUserPrincipals(java.util.List<String> userPrincipals) {
        this.userPrincipals = userPrincipals;
        return this;
    }
    public java.util.List<String> getUserPrincipals() {
        return this.userPrincipals;
    }

}
