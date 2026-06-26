// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateRoleAssignmentRequest extends TeaModel {
    @NameInMap("PrincipalName")
    public String principalName;

    @NameInMap("PrincipalType")
    public String principalType;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static CreateRoleAssignmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleAssignmentRequest self = new CreateRoleAssignmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoleAssignmentRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public CreateRoleAssignmentRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public CreateRoleAssignmentRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public CreateRoleAssignmentRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
