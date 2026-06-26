// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Role")
    public CreateRoleResponseBodyRole role;

    public static CreateRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleResponseBody self = new CreateRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoleResponseBody setRole(CreateRoleResponseBodyRole role) {
        this.role = role;
        return this;
    }
    public CreateRoleResponseBodyRole getRole() {
        return this.role;
    }

    public static class CreateRoleResponseBodyRole extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static CreateRoleResponseBodyRole build(java.util.Map<String, ?> map) throws Exception {
            CreateRoleResponseBodyRole self = new CreateRoleResponseBodyRole();
            return TeaModel.build(map, self);
        }

        public CreateRoleResponseBodyRole setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateRoleResponseBodyRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRoleResponseBodyRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public CreateRoleResponseBodyRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public CreateRoleResponseBodyRole setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateRoleResponseBodyRole setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
