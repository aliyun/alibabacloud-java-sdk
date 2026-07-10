// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class UpdateCustomRoleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("role_id")
    public String roleId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("role_name")
    public String roleName;

    public static UpdateCustomRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRoleRequest self = new UpdateCustomRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRoleRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public UpdateCustomRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
