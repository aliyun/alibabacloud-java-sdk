// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The binding information for the external identity provider.</p>
     */
    @NameInMap("data")
    public CreateIdentityProviderResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message. An error description is returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderResponseBody self = new CreateIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateIdentityProviderResponseBody setData(CreateIdentityProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateIdentityProviderResponseBodyData getData() {
        return this.data;
    }

    public CreateIdentityProviderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateIdentityProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIdentityProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateIdentityProviderResponseBodyDataConfiguration extends TeaModel {
        /**
         * <p>The SAML binding type. Valid values: HTTP-Redirect and HTTP-POST. This parameter is required for manual input. Queries return the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>The entity identifier of the identity provider (IdP). This parameter is required for manual input, must not be empty, and cannot exceed 2,048 characters. Existing configurations do not support replacement. This is different from the entity ID of the service provider (SP) returned in queries.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>The logon URL of the IdP. This parameter is required for manual input and must be an absolute HTTPS URL without user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The actual SSO logon status of AgentIdentity. Valid values: Enabled and Disabled. This value is not equivalent to the expected loginEnabled value saved in the access configuration (AC).</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("ssoStatus")
        public String ssoStatus;

        public static CreateIdentityProviderResponseBodyDataConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderResponseBodyDataConfiguration self = new CreateIdentityProviderResponseBodyDataConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderResponseBodyDataConfiguration setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public CreateIdentityProviderResponseBodyDataConfiguration setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public CreateIdentityProviderResponseBodyDataConfiguration setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public CreateIdentityProviderResponseBodyDataConfiguration setSsoStatus(String ssoStatus) {
            this.ssoStatus = ssoStatus;
            return this;
        }
        public String getSsoStatus() {
            return this.ssoStatus;
        }

    }

    public static class CreateIdentityProviderResponseBodyDataSaml extends TeaModel {
        /**
         * <p>The SAML binding type. Valid values: HTTP-Redirect and HTTP-POST. This parameter is required for manual input. Queries return the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>The entity identifier of the identity provider (IdP). This parameter is required for manual input, must not be empty, and cannot exceed 2,048 characters. Existing configurations do not support replacement. This is different from the entity ID of the service provider (SP) returned in queries.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>The logon URL of the IdP. This parameter is required for manual input and must be an absolute HTTPS URL without user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The list of IdP signing certificates. For manual input, a non-empty array is required, and PEM X.509 certificate text must be used. The current validity period is verified. A maximum of two certificates are allowed after deduplication.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;-----BEGIN CERTIFICATE-----\\nMIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQEL\\nBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoX\\nDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjAN\\nBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8\\noGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYN\\nW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbY\\nEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Ok\\nkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0E\\nBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQAB\\nMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUW\\nld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImca\\nWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTq\\nP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjoc\\nJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdV\\njfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5\\n-----END CERTIFICATE-----&quot;]</p>
         */
        @NameInMap("x509Certificates")
        public java.util.List<String> x509Certificates;

        public static CreateIdentityProviderResponseBodyDataSaml build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderResponseBodyDataSaml self = new CreateIdentityProviderResponseBodyDataSaml();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderResponseBodyDataSaml setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public CreateIdentityProviderResponseBodyDataSaml setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public CreateIdentityProviderResponseBodyDataSaml setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public CreateIdentityProviderResponseBodyDataSaml setX509Certificates(java.util.List<String> x509Certificates) {
            this.x509Certificates = x509Certificates;
            return this;
        }
        public java.util.List<String> getX509Certificates() {
            return this.x509Certificates;
        }

    }

    public static class CreateIdentityProviderResponseBodyDataSyncScope extends TeaModel {
        /**
         * <p>When the mode is SelectedDepartments, the list must contain at least one non-empty department ID, which should be obtained from ListIdentityProviderDepartments. When the mode is AllAuthorized, pass an empty array or omit this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10001&quot;]</p>
         */
        @NameInMap("departmentIds")
        public java.util.List<String> departmentIds;

        /**
         * <p>AllAuthorized: the full authorization scope, which is limited by the application address book authorization. SelectedDepartments: the selected departments and all their sub-departments. When explicitly submitting syncScope, you must provide a valid mode, which is verified by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>SelectedDepartments</p>
         */
        @NameInMap("mode")
        public String mode;

        public static CreateIdentityProviderResponseBodyDataSyncScope build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderResponseBodyDataSyncScope self = new CreateIdentityProviderResponseBodyDataSyncScope();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderResponseBodyDataSyncScope setDepartmentIds(java.util.List<String> departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }
        public java.util.List<String> getDepartmentIds() {
            return this.departmentIds;
        }

        public CreateIdentityProviderResponseBodyDataSyncScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class CreateIdentityProviderResponseBodyData extends TeaModel {
        /**
         * <p>The actual SAML configuration is read back on demand only by the GetIdentityProvider operation. SCIM queries and preparations return the actual received status and URL.</p>
         */
        @NameInMap("configuration")
        public CreateIdentityProviderResponseBodyDataConfiguration configuration;

        /**
         * <p>The type of the external identity provider. Valid values: DingTalk and Feishu.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("identityProviderType")
        public String identityProviderType;

        /**
         * <p>Specifies whether to allow workspace users to log on through the external identity provider.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>The logon protocol. Currently, only SAML is supported. This parameter may not be returned if no valid configuration is saved. Placeholder initialization with OIDC is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The SAML logon configuration. Input supports either XML or complete manual input. Queries return the standardized configuration and do not echo the original XML. This parameter can be omitted if not configured.</p>
         */
        @NameInMap("saml")
        public CreateIdentityProviderResponseBodyDataSaml saml;

        /**
         * <p>The binding status. Valid values:</p>
         * <ul>
         * <li>CONFIGURED: The configuration is accepted and waiting for the user pool to be activated.</li>
         * <li>SYNCING: Organization members are being synchronized.</li>
         * <li>SYNCED: Organization member synchronization is complete.</li>
         * <li>READY: The binding is in effect.</li>
         * <li>SYNC_FAILED: Organization member synchronization failed.</li>
         * <li>UPDATING: The configuration is being updated.</li>
         * <li>UPDATE_FAILED: Configuration update failed.</li>
         * <li>DISCONNECTING: The binding is being disconnected.</li>
         * <li>DISCONNECT_FAILED: Disconnection failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Specifies whether to enable organization member synchronization. If enabled, the external identity provider synchronizes organization members as workspace users.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        /**
         * <p>Retains the department-based synchronization scope definition. If omitted during creation, the default value is AllAuthorized. The first vendor synchronization is determined by syncOnBind. If omitted or set to null during an update, the original value is retained. Updating and saving the scope does not automatically perform full synchronization.</p>
         */
        @NameInMap("syncScope")
        public CreateIdentityProviderResponseBodyDataSyncScope syncScope;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreateIdentityProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderResponseBodyData self = new CreateIdentityProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderResponseBodyData setConfiguration(CreateIdentityProviderResponseBodyDataConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public CreateIdentityProviderResponseBodyDataConfiguration getConfiguration() {
            return this.configuration;
        }

        public CreateIdentityProviderResponseBodyData setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public CreateIdentityProviderResponseBodyData setLoginEnabled(Boolean loginEnabled) {
            this.loginEnabled = loginEnabled;
            return this;
        }
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        public CreateIdentityProviderResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateIdentityProviderResponseBodyData setSaml(CreateIdentityProviderResponseBodyDataSaml saml) {
            this.saml = saml;
            return this;
        }
        public CreateIdentityProviderResponseBodyDataSaml getSaml() {
            return this.saml;
        }

        public CreateIdentityProviderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateIdentityProviderResponseBodyData setSyncEnabled(Boolean syncEnabled) {
            this.syncEnabled = syncEnabled;
            return this;
        }
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        public CreateIdentityProviderResponseBodyData setSyncScope(CreateIdentityProviderResponseBodyDataSyncScope syncScope) {
            this.syncScope = syncScope;
            return this;
        }
        public CreateIdentityProviderResponseBodyDataSyncScope getSyncScope() {
            return this.syncScope;
        }

        public CreateIdentityProviderResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
