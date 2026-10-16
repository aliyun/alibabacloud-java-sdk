// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateRoleAssignmentRequest extends TeaModel {
    /**
     * <p>The name of the principal. When PrincipalType is set to User, specify the username.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("PrincipalName")
    public String principalName;

    /**
     * <p>The type of the principal. Valid values:</p>
     * <ul>
     * <li>User: User. Only this value is currently supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The name of the role to assign.</p>
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
