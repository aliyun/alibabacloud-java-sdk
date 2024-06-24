// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CreateCustomRoleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123abc</p>
     */
    @NameInMap("role_id")
    public String roleId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("role_name")
    public String roleName;

    public static CreateCustomRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomRoleRequest self = new CreateCustomRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomRoleRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public CreateCustomRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
