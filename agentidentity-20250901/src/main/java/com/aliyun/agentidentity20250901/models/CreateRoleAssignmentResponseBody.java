// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateRoleAssignmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoleAssignment")
    public CreateRoleAssignmentResponseBodyRoleAssignment roleAssignment;

    public static CreateRoleAssignmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleAssignmentResponseBody self = new CreateRoleAssignmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoleAssignmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoleAssignmentResponseBody setRoleAssignment(CreateRoleAssignmentResponseBodyRoleAssignment roleAssignment) {
        this.roleAssignment = roleAssignment;
        return this;
    }
    public CreateRoleAssignmentResponseBodyRoleAssignment getRoleAssignment() {
        return this.roleAssignment;
    }

    public static class CreateRoleAssignmentResponseBodyRoleAssignment extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PrincipalId")
        public String principalId;

        @NameInMap("PrincipalName")
        public String principalName;

        @NameInMap("PrincipalType")
        public String principalType;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("UserPoolId")
        public String userPoolId;

        public static CreateRoleAssignmentResponseBodyRoleAssignment build(java.util.Map<String, ?> map) throws Exception {
            CreateRoleAssignmentResponseBodyRoleAssignment self = new CreateRoleAssignmentResponseBodyRoleAssignment();
            return TeaModel.build(map, self);
        }

        public CreateRoleAssignmentResponseBodyRoleAssignment setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateRoleAssignmentResponseBodyRoleAssignment setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public CreateRoleAssignmentResponseBodyRoleAssignment setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public CreateRoleAssignmentResponseBodyRoleAssignment setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public CreateRoleAssignmentResponseBodyRoleAssignment setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public CreateRoleAssignmentResponseBodyRoleAssignment setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public CreateRoleAssignmentResponseBodyRoleAssignment setUserPoolId(String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public String getUserPoolId() {
            return this.userPoolId;
        }

    }

}
