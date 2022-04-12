// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateRoleRequest extends TeaModel {
    @NameInMap("ActionData")
    public String actionData;

    @NameInMap("RoleId")
    public Integer roleId;

    public static UpdateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleRequest self = new UpdateRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoleRequest setActionData(String actionData) {
        this.actionData = actionData;
        return this;
    }
    public String getActionData() {
        return this.actionData;
    }

    public UpdateRoleRequest setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }
    public Integer getRoleId() {
        return this.roleId;
    }

}
