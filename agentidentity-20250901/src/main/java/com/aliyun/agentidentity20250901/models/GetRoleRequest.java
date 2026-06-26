// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetRoleRequest extends TeaModel {
    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static GetRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoleRequest self = new GetRoleRequest();
        return TeaModel.build(map, self);
    }

    public GetRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public GetRoleRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
