// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListTenantRolesResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request is normal.</p>
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
    public java.util.List<ListTenantRolesResponseBodyRoleList> roleList;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListTenantRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTenantRolesResponseBody self = new ListTenantRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTenantRolesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTenantRolesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTenantRolesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTenantRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTenantRolesResponseBody setRoleList(java.util.List<ListTenantRolesResponseBodyRoleList> roleList) {
        this.roleList = roleList;
        return this;
    }
    public java.util.List<ListTenantRolesResponseBodyRoleList> getRoleList() {
        return this.roleList;
    }

    public ListTenantRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTenantRolesResponseBodyRoleList extends TeaModel {
        /**
         * <p>The JSON string of the permission set.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("AuthJson")
        public String authJson;

        /**
         * <p>The ID of the user who created the role.</p>
         * 
         * <strong>example:</strong>
         * <p>30121201</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The time when the role was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-07 16:45:30</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the role was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-07 16:45:30</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the user who last modified the role.</p>
         * 
         * <strong>example:</strong>
         * <p>30121201</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The description of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RoleDesc")
        public String roleDesc;

        /**
         * <p>The key of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>test::1212</p>
         */
        @NameInMap("RoleKey")
        public String roleKey;

        /**
         * <p>The name of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The type of the role. Valid values:</p>
         * <ul>
         * <li>BUILD_IN: built-in role.</li>
         * <li>CUSTOM: custom role.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <p>The status of the role. Valid values:</p>
         * <ul>
         * <li>ON: enabled.</li>
         * <li>OFF: disabled.</li>
         * <li>DEL: deleted.</li>
         * </ul>
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
         * <p>30121001</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The type of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("TenantType")
        public String tenantType;

        public static ListTenantRolesResponseBodyRoleList build(java.util.Map<String, ?> map) throws Exception {
            ListTenantRolesResponseBodyRoleList self = new ListTenantRolesResponseBodyRoleList();
            return TeaModel.build(map, self);
        }

        public ListTenantRolesResponseBodyRoleList setAuthJson(String authJson) {
            this.authJson = authJson;
            return this;
        }
        public String getAuthJson() {
            return this.authJson;
        }

        public ListTenantRolesResponseBodyRoleList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListTenantRolesResponseBodyRoleList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTenantRolesResponseBodyRoleList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListTenantRolesResponseBodyRoleList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListTenantRolesResponseBodyRoleList setRoleDesc(String roleDesc) {
            this.roleDesc = roleDesc;
            return this;
        }
        public String getRoleDesc() {
            return this.roleDesc;
        }

        public ListTenantRolesResponseBodyRoleList setRoleKey(String roleKey) {
            this.roleKey = roleKey;
            return this;
        }
        public String getRoleKey() {
            return this.roleKey;
        }

        public ListTenantRolesResponseBodyRoleList setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListTenantRolesResponseBodyRoleList setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public ListTenantRolesResponseBodyRoleList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTenantRolesResponseBodyRoleList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListTenantRolesResponseBodyRoleList setTenantType(String tenantType) {
            this.tenantType = tenantType;
            return this;
        }
        public String getTenantType() {
            return this.tenantType;
        }

    }

}
