// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteRoleRequest extends TeaModel {
    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static DeleteRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoleRequest self = new DeleteRoleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public DeleteRoleRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
