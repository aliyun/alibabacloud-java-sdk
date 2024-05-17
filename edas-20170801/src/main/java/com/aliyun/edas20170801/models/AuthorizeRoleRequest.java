// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AuthorizeRoleRequest extends TeaModel {
    /**
     * <p>The ID of the role to be assigned. If you want to assign multiple roles to the specified RAM user, separate the IDs of the roles with semicolons (;). If you leave this parameter empty, the roles assigned to the specified RAM user are revoked.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleIds")
    public String roleIds;

    /**
     * <p>The ID of the RAM user to which you want to assign the roles.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetUserId")
    public String targetUserId;

    public static AuthorizeRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeRoleRequest self = new AuthorizeRoleRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeRoleRequest setRoleIds(String roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public String getRoleIds() {
        return this.roleIds;
    }

    public AuthorizeRoleRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

}
