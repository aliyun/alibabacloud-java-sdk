// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetUserByAccessKeyResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request is successful.</p>
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
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The user information.</p>
     */
    @NameInMap("UserInfo")
    public GetUserByAccessKeyResponseBodyUserInfo userInfo;

    public static GetUserByAccessKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserByAccessKeyResponseBody self = new GetUserByAccessKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserByAccessKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserByAccessKeyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserByAccessKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserByAccessKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserByAccessKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserByAccessKeyResponseBody setUserInfo(GetUserByAccessKeyResponseBodyUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetUserByAccessKeyResponseBodyUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetUserByAccessKeyResponseBodyUserInfoTenantRoles extends TeaModel {
        /**
         * <p>The role key, such as SUPER_ADMIN or COMMON_USER.</p>
         * 
         * <strong>example:</strong>
         * <p>SUPER_ADMIN</p>
         */
        @NameInMap("RoleKey")
        public String roleKey;

        /**
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>Tenant administrator</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static GetUserByAccessKeyResponseBodyUserInfoTenantRoles build(java.util.Map<String, ?> map) throws Exception {
            GetUserByAccessKeyResponseBodyUserInfoTenantRoles self = new GetUserByAccessKeyResponseBodyUserInfoTenantRoles();
            return TeaModel.build(map, self);
        }

        public GetUserByAccessKeyResponseBodyUserInfoTenantRoles setRoleKey(String roleKey) {
            this.roleKey = roleKey;
            return this;
        }
        public String getRoleKey() {
            return this.roleKey;
        }

        public GetUserByAccessKeyResponseBodyUserInfoTenantRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class GetUserByAccessKeyResponseBodyUserInfo extends TeaModel {
        /**
         * <p>The display name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The Dataphin user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30011210</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xx@aliyun.com">xx@aliyun.com</a></p>
         */
        @NameInMap("Mail")
        public String mail;

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The source type of the account, such as ALIYUN_OAUTH2, PUBLICCLOUD_OAUTH2, BUC, or APSARA.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN_OAUTH2</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The source account ID of the user when SSO is integrated.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("SourceUserId")
        public String sourceUserId;

        /**
         * <p>The status of the tenant member. Valid values: NORMAL, DEACTIVATE, and DELETE.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tenant-level roles. These are the roles of the user to whom the AccessKey ID and AccessKey secret belong in the current tenant.</p>
         */
        @NameInMap("TenantRoles")
        public java.util.List<GetUserByAccessKeyResponseBodyUserInfoTenantRoles> tenantRoles;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetUserByAccessKeyResponseBodyUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetUserByAccessKeyResponseBodyUserInfo self = new GetUserByAccessKeyResponseBodyUserInfo();
            return TeaModel.build(map, self);
        }

        public GetUserByAccessKeyResponseBodyUserInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUserByAccessKeyResponseBodyUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUserByAccessKeyResponseBodyUserInfo setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
        }

        public GetUserByAccessKeyResponseBodyUserInfo setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetUserByAccessKeyResponseBodyUserInfo setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetUserByAccessKeyResponseBodyUserInfo setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public GetUserByAccessKeyResponseBodyUserInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUserByAccessKeyResponseBodyUserInfo setTenantRoles(java.util.List<GetUserByAccessKeyResponseBodyUserInfoTenantRoles> tenantRoles) {
            this.tenantRoles = tenantRoles;
            return this;
        }
        public java.util.List<GetUserByAccessKeyResponseBodyUserInfoTenantRoles> getTenantRoles() {
            return this.tenantRoles;
        }

        public GetUserByAccessKeyResponseBodyUserInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
