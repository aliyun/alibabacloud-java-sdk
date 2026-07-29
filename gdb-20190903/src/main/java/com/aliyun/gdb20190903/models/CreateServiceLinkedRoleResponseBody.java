// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Role")
    public CreateServiceLinkedRoleResponseBodyRole role;

    public static CreateServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleResponseBody self = new CreateServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceLinkedRoleResponseBody setRole(CreateServiceLinkedRoleResponseBodyRole role) {
        this.role = role;
        return this;
    }
    public CreateServiceLinkedRoleResponseBodyRole getRole() {
        return this.role;
    }

    public static class CreateServiceLinkedRoleResponseBodyRoleRole extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("AssumeRolePolicyDocument")
        public String assumeRolePolicyDocument;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("IsServiceLinkedRole")
        public Boolean isServiceLinkedRole;

        @NameInMap("LatestDeletionTask")
        public Boolean latestDeletionTask;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("RolePrincipalName")
        public String rolePrincipalName;

        public static CreateServiceLinkedRoleResponseBodyRoleRole build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceLinkedRoleResponseBodyRoleRole self = new CreateServiceLinkedRoleResponseBodyRoleRole();
            return TeaModel.build(map, self);
        }

        public CreateServiceLinkedRoleResponseBodyRoleRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public CreateServiceLinkedRoleResponseBodyRoleRole setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
        }
        public String getAssumeRolePolicyDocument() {
            return this.assumeRolePolicyDocument;
        }

        public CreateServiceLinkedRoleResponseBodyRoleRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateServiceLinkedRoleResponseBodyRoleRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateServiceLinkedRoleResponseBodyRoleRole setIsServiceLinkedRole(Boolean isServiceLinkedRole) {
            this.isServiceLinkedRole = isServiceLinkedRole;
            return this;
        }
        public Boolean getIsServiceLinkedRole() {
            return this.isServiceLinkedRole;
        }

        public CreateServiceLinkedRoleResponseBodyRoleRole setLatestDeletionTask(Boolean latestDeletionTask) {
            this.latestDeletionTask = latestDeletionTask;
            return this;
        }
        public Boolean getLatestDeletionTask() {
            return this.latestDeletionTask;
        }

        public CreateServiceLinkedRoleResponseBodyRoleRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public CreateServiceLinkedRoleResponseBodyRoleRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public CreateServiceLinkedRoleResponseBodyRoleRole setRolePrincipalName(String rolePrincipalName) {
            this.rolePrincipalName = rolePrincipalName;
            return this;
        }
        public String getRolePrincipalName() {
            return this.rolePrincipalName;
        }

    }

    public static class CreateServiceLinkedRoleResponseBodyRole extends TeaModel {
        @NameInMap("Role")
        public java.util.List<CreateServiceLinkedRoleResponseBodyRoleRole> role;

        public static CreateServiceLinkedRoleResponseBodyRole build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceLinkedRoleResponseBodyRole self = new CreateServiceLinkedRoleResponseBodyRole();
            return TeaModel.build(map, self);
        }

        public CreateServiceLinkedRoleResponseBodyRole setRole(java.util.List<CreateServiceLinkedRoleResponseBodyRoleRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<CreateServiceLinkedRoleResponseBodyRoleRole> getRole() {
            return this.role;
        }

    }

}
