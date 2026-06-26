// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateRoleRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static UpdateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleRequest self = new UpdateRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public UpdateRoleRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
