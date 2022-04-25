// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateRoleRequest extends TeaModel {
    @NameInMap("RoleInput")
    public RoleInput roleInput;

    // RoleName
    @NameInMap("RoleName")
    public String roleName;

    public static UpdateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleRequest self = new UpdateRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoleRequest setRoleInput(RoleInput roleInput) {
        this.roleInput = roleInput;
        return this;
    }
    public RoleInput getRoleInput() {
        return this.roleInput;
    }

    public UpdateRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
