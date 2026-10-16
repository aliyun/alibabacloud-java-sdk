// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetRoleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The role information.</p>
     */
    @NameInMap("Role")
    public GetRoleResponseBodyRole role;

    public static GetRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoleResponseBody self = new GetRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoleResponseBody setRole(GetRoleResponseBodyRole role) {
        this.role = role;
        return this;
    }
    public GetRoleResponseBodyRole getRole() {
        return this.role;
    }

    public static class GetRoleResponseBodyRole extends TeaModel {
        /**
         * <p>The creation time in ISO 8601 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>Data analyst role</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>role_xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The name of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyst</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The type of the role. Default indicates a default role, and Manual indicates a custom role.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The update time in ISO 8601 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetRoleResponseBodyRole build(java.util.Map<String, ?> map) throws Exception {
            GetRoleResponseBodyRole self = new GetRoleResponseBodyRole();
            return TeaModel.build(map, self);
        }

        public GetRoleResponseBodyRole setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRoleResponseBodyRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRoleResponseBodyRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public GetRoleResponseBodyRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetRoleResponseBodyRole setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetRoleResponseBodyRole setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
