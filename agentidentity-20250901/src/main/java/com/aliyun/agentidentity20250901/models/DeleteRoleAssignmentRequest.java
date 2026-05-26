// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteRoleAssignmentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("PrincipalName")
    public String principalName;

    /**
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <strong>example:</strong>
     * <p>Analyst</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
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
