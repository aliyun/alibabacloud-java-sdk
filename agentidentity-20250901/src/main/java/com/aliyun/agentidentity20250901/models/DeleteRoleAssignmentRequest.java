// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteRoleAssignmentRequest extends TeaModel {
    /**
     * <p>The name of the identity. If PrincipalType is set to User, specify the username.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("PrincipalName")
    public String principalName;

    /**
     * <p>The identity type. Currently, only User is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The name of the role to be removed.</p>
     * 
     * <strong>example:</strong>
     * <p>Analyst</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The name of the user pool.</p>
     * 
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
