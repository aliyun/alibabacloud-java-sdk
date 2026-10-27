// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderSCIMResponseBody extends TeaModel {
    /**
     * <p>The business result code. If the request fails, handle the error based on the HTTP status code and the message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The shared binding after the request is accepted. The status indicates the status of shared resources and logon configurations, not the status of this SCIM task. Query GetIdentityProviderSCIM.operationStatus for the execution result.</p>
     */
    @NameInMap("data")
    public UpdateIdentityProviderSCIMResponseBodyData data;

    /**
     * <p>The HTTP status code. It indicates the processing status of this request and is not equivalent to the final result of the background task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Task result message. It is the request acceptance or error message. For asynchronous tasks, you must check task result by calling the corresponding query API.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID. It is used to associate this call with troubleshooting. Retain it when a failure occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>request-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of true indicates that the request is processed successfully. For asynchronous writes, you must continue to query the task result.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateIdentityProviderSCIMResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderSCIMResponseBody self = new UpdateIdentityProviderSCIMResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderSCIMResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateIdentityProviderSCIMResponseBody setData(UpdateIdentityProviderSCIMResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateIdentityProviderSCIMResponseBodyData getData() {
        return this.data;
    }

    public UpdateIdentityProviderSCIMResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateIdentityProviderSCIMResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateIdentityProviderSCIMResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateIdentityProviderSCIMResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateIdentityProviderSCIMResponseBodyDataConfiguration extends TeaModel {
        /**
         * <p>The SAML binding type. Valid values: HTTP-Redirect and HTTP-POST. This parameter is required when you manually enter the configuration. The query returns the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>The entity ID of the IdP. This parameter is required when you manually enter the configuration. It cannot be empty and cannot exceed 2,048 characters. Existing configurations cannot be replaced. This is different from the entity ID of the SP returned by the SP query.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>The logon URL of the IdP. This parameter is required when you manually enter the configuration. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The actual SSO logon status of AgentIdentity. The actual switch value is Enabled or Disabled, which is not equivalent to the expected loginEnabled value saved in AC.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("ssoStatus")
        public String ssoStatus;

        public static UpdateIdentityProviderSCIMResponseBodyDataConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderSCIMResponseBodyDataConfiguration self = new UpdateIdentityProviderSCIMResponseBodyDataConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderSCIMResponseBodyDataConfiguration setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataConfiguration setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataConfiguration setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataConfiguration setSsoStatus(String ssoStatus) {
            this.ssoStatus = ssoStatus;
            return this;
        }
        public String getSsoStatus() {
            return this.ssoStatus;
        }

    }

    public static class UpdateIdentityProviderSCIMResponseBodyDataMetadata extends TeaModel {
        /**
         * <p>The canonical SAML binding identifier. It is the SAML binding URI in the historical metadata snapshot. For CustomSSO updates, use saml.bindingType.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect</p>
         */
        @NameInMap("binding")
        public String binding;

        /**
         * <p>The canonical SAML certificate content. It is the certificate string in the historical metadata snapshot. To edit the configuration, use saml.x509Certificates and do not submit the old metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>MIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQELBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoXDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8oGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYNW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbYEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Okkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0EBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUWld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImcaWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTqP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjocJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdVjfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5</p>
         */
        @NameInMap("certificates")
        public String certificates;

        /**
         * <p>The entity ID of the IdP. This parameter is required when you manually enter the configuration. It cannot be empty and cannot exceed 2,048 characters. Existing configurations cannot be replaced. This is different from the entity ID of the SP returned by the SP query.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>The logon URL of the IdP. This parameter is required when you manually enter the configuration. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        public static UpdateIdentityProviderSCIMResponseBodyDataMetadata build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderSCIMResponseBodyDataMetadata self = new UpdateIdentityProviderSCIMResponseBodyDataMetadata();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderSCIMResponseBodyDataMetadata setBinding(String binding) {
            this.binding = binding;
            return this;
        }
        public String getBinding() {
            return this.binding;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataMetadata setCertificates(String certificates) {
            this.certificates = certificates;
            return this;
        }
        public String getCertificates() {
            return this.certificates;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataMetadata setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataMetadata setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

    }

    public static class UpdateIdentityProviderSCIMResponseBodyDataSaml extends TeaModel {
        /**
         * <p>The SAML binding type. Valid values: HTTP-Redirect and HTTP-POST. This parameter is required when you manually enter the configuration. The query returns the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>The entity ID of the IdP. This parameter is required when you manually enter the configuration. It cannot be empty and cannot exceed 2,048 characters. Existing configurations cannot be replaced. This is different from the entity ID of the SP returned by the SP query.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>The logon URL of the IdP. This parameter is required when you manually enter the configuration. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The list of IdP signing certificates. When you manually enter the configuration, this parameter is required and must be a non-empty array. Use PEM X.509 certificate text. The current validity period is verified. A maximum of two certificates are allowed after deduplication.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;-----BEGIN CERTIFICATE-----\\nMIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQEL\\nBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoX\\nDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjAN\\nBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8\\noGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYN\\nW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbY\\nEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Ok\\nkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0E\\nBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQAB\\nMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUW\\nld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImca\\nWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTq\\nP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjoc\\nJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdV\\njfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5\\n-----END CERTIFICATE-----&quot;]</p>
         */
        @NameInMap("x509Certificates")
        public java.util.List<String> x509Certificates;

        public static UpdateIdentityProviderSCIMResponseBodyDataSaml build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderSCIMResponseBodyDataSaml self = new UpdateIdentityProviderSCIMResponseBodyDataSaml();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderSCIMResponseBodyDataSaml setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataSaml setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataSaml setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataSaml setX509Certificates(java.util.List<String> x509Certificates) {
            this.x509Certificates = x509Certificates;
            return this;
        }
        public java.util.List<String> getX509Certificates() {
            return this.x509Certificates;
        }

    }

    public static class UpdateIdentityProviderSCIMResponseBodyData extends TeaModel {
        /**
         * <p>The actual upstream configuration. The actual SAML configuration is read back on demand only in GetIdentityProvider. SCIM query and prepare operations return the actual receiving status and URL.</p>
         */
        @NameInMap("configuration")
        public UpdateIdentityProviderSCIMResponseBodyDataConfiguration configuration;

        /**
         * <p>The creation time recorded by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-26T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The event subscription callback URL. CustomSSO returns an empty string. You can obtain the SCIM receiving address through the SCIM query or prepare API. The example shows a JSON empty string &quot;&quot;. The actual value does not contain double quotes.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("eventSubscriptionCallbackUrl")
        public String eventSubscriptionCallbackUrl;

        /**
         * <p>The identity provider type. General CRUD operations support DingTalk, Feishu, and CustomSSO. SP queries only support CustomSSO. The SCIM path fixedly uses the CustomSSO shared pool.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomSSO</p>
         */
        @NameInMap("identityProviderType")
        public String identityProviderType;

        /**
         * <p>The logon callback URL. CustomSSO returns an empty string. You should obtain the ACS URL for SAML through the SP query API. The example shows a JSON empty string &quot;&quot;. The actual value does not contain double quotes.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("loginCallbackUrl")
        public String loginCallbackUrl;

        /**
         * <p>The logon switch. Do not set this parameter to true during CustomSSO initialization. You must save a valid SAML configuration before enabling it. Disabling it does not delete the configuration. When an asynchronous failure occurs, this expected value does not mean that it has taken effect on the upstream.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>The standard IdP metadata. Vendor parameters are used for DingTalk and Feishu. CustomSSO updates use protocol and saml, and do not accept this field. The return value does not contain vendor keys.</p>
         */
        @NameInMap("metadata")
        public UpdateIdentityProviderSCIMResponseBodyDataMetadata metadata;

        /**
         * <p>PENDING/RUNNING 时轮询 GetIdentityProviderSCIM；保留失败、暂停和取消事实，不表示 SAML 状态。</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("operationStatus")
        public String operationStatus;

        /**
         * <p>The logon protocol. Currently, only SAML is supported. This field may not be returned if no valid configuration is saved. OIDC placeholder initialization is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The SAML logon configuration. The input supports either XML or complete manual entry. The query returns the standardized configuration and does not echo the original XML. This field can be omitted if it is not configured.</p>
         */
        @NameInMap("saml")
        public UpdateIdentityProviderSCIMResponseBodyDataSaml saml;

        /**
         * <p>独立 SCIM 状态；不改变原 status 的共享资源及登录配置含义。与查询接口的 data.status 对应。</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATING</p>
         */
        @NameInMap("scimStatus")
        public String scimStatus;

        /**
         * <p>The operation status of shared resources and logon configurations. It indicates the user pool lifecycle and logon configuration task status of CustomSSO, and does not represent the SCIM operation result. Query GetIdentityProviderSCIM.operationStatus for the SCIM switch result. You cannot use this field to determine whether all protocols are configured.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Do not set this parameter to true during CustomSSO initialization. You can only update it later by calling UpdateIdentityProviderSCIM. Determine the result based on operationStatus.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        /**
         * <p>The last update time recorded by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-26T00:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The ID of the target workspace. This parameter is required. The request region must be the same as the region of the target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-example</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static UpdateIdentityProviderSCIMResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderSCIMResponseBodyData self = new UpdateIdentityProviderSCIMResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderSCIMResponseBodyData setConfiguration(UpdateIdentityProviderSCIMResponseBodyDataConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public UpdateIdentityProviderSCIMResponseBodyDataConfiguration getConfiguration() {
            return this.configuration;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setEventSubscriptionCallbackUrl(String eventSubscriptionCallbackUrl) {
            this.eventSubscriptionCallbackUrl = eventSubscriptionCallbackUrl;
            return this;
        }
        public String getEventSubscriptionCallbackUrl() {
            return this.eventSubscriptionCallbackUrl;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setLoginCallbackUrl(String loginCallbackUrl) {
            this.loginCallbackUrl = loginCallbackUrl;
            return this;
        }
        public String getLoginCallbackUrl() {
            return this.loginCallbackUrl;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setLoginEnabled(Boolean loginEnabled) {
            this.loginEnabled = loginEnabled;
            return this;
        }
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setMetadata(UpdateIdentityProviderSCIMResponseBodyDataMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public UpdateIdentityProviderSCIMResponseBodyDataMetadata getMetadata() {
            return this.metadata;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setSaml(UpdateIdentityProviderSCIMResponseBodyDataSaml saml) {
            this.saml = saml;
            return this;
        }
        public UpdateIdentityProviderSCIMResponseBodyDataSaml getSaml() {
            return this.saml;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setScimStatus(String scimStatus) {
            this.scimStatus = scimStatus;
            return this;
        }
        public String getScimStatus() {
            return this.scimStatus;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setSyncEnabled(Boolean syncEnabled) {
            this.syncEnabled = syncEnabled;
            return this;
        }
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateIdentityProviderSCIMResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
