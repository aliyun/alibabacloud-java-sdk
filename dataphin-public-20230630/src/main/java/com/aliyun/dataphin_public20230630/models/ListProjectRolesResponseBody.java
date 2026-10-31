// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListProjectRolesResponseBody extends TeaModel {
    /**
     * <p>The error code. OK indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of roles.</p>
     */
    @NameInMap("RoleList")
    public java.util.List<ListProjectRolesResponseBodyRoleList> roleList;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListProjectRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectRolesResponseBody self = new ListProjectRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectRolesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProjectRolesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListProjectRolesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectRolesResponseBody setRoleList(java.util.List<ListProjectRolesResponseBodyRoleList> roleList) {
        this.roleList = roleList;
        return this;
    }
    public java.util.List<ListProjectRolesResponseBodyRoleList> getRoleList() {
        return this.roleList;
    }

    public ListProjectRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProjectRolesResponseBodyRoleList extends TeaModel {
        /**
         * <p>The JSON string of the permission set.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("AuthJson")
        public String authJson;

        /**
         * <p>The user ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>30112011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-30 17:38:32</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-30 17:38:32</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The user ID of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>30112011</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The project type.</p>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("ProjectType")
        public String projectType;

        /**
         * <p>The role description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RoleDesc")
        public String roleDesc;

        /**
         * <p>The role key.</p>
         * 
         * <strong>example:</strong>
         * <p>abc::01121</p>
         */
        @NameInMap("RoleKey")
        public String roleKey;

        /**
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The role type. Valid values: BUILD_IN (built-in role) and CUSTOM (custom role).</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <p>The role status. Valid values: ON (enabled), OFF (disabled), and DEL (deleted).</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30110110</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListProjectRolesResponseBodyRoleList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectRolesResponseBodyRoleList self = new ListProjectRolesResponseBodyRoleList();
            return TeaModel.build(map, self);
        }

        public ListProjectRolesResponseBodyRoleList setAuthJson(String authJson) {
            this.authJson = authJson;
            return this;
        }
        public String getAuthJson() {
            return this.authJson;
        }

        public ListProjectRolesResponseBodyRoleList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListProjectRolesResponseBodyRoleList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListProjectRolesResponseBodyRoleList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListProjectRolesResponseBodyRoleList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListProjectRolesResponseBodyRoleList setProjectType(String projectType) {
            this.projectType = projectType;
            return this;
        }
        public String getProjectType() {
            return this.projectType;
        }

        public ListProjectRolesResponseBodyRoleList setRoleDesc(String roleDesc) {
            this.roleDesc = roleDesc;
            return this;
        }
        public String getRoleDesc() {
            return this.roleDesc;
        }

        public ListProjectRolesResponseBodyRoleList setRoleKey(String roleKey) {
            this.roleKey = roleKey;
            return this;
        }
        public String getRoleKey() {
            return this.roleKey;
        }

        public ListProjectRolesResponseBodyRoleList setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListProjectRolesResponseBodyRoleList setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public ListProjectRolesResponseBodyRoleList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProjectRolesResponseBodyRoleList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
