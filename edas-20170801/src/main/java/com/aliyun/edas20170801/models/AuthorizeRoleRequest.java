// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AuthorizeRoleRequest extends TeaModel {
    @NameInMap("TargetUserId")
    public String targetUserId;

    @NameInMap("RoleIds")
    public String roleIds;

    public static AuthorizeRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeRoleRequest self = new AuthorizeRoleRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeRoleRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public AuthorizeRoleRequest setRoleIds(String roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public String getRoleIds() {
        return this.roleIds;
    }

}
