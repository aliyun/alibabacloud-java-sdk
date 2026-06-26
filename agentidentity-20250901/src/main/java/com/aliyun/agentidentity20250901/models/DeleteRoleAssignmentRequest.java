// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteRoleAssignmentRequest extends TeaModel {
    @NameInMap("PrincipalName")
    public String principalName;

    @NameInMap("PrincipalType")
    public String principalType;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static DeleteRoleAssignmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoleAssignmentRequest self = new DeleteRoleAssignmentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoleAssignmentRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public DeleteRoleAssignmentRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public DeleteRoleAssignmentRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public DeleteRoleAssignmentRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
