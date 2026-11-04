// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderSCIMResponseBody extends TeaModel {
    /**
     * <p>The business result code. If a failure occurs, handle the error based on the HTTP status code and the message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The original fields and the meaning of status are retained. The new scimStatus parameter corresponds to data.status in the query API, and operationStatus retains the status of the most recent SCIM task.</p>
     */
    @NameInMap("data")
    public UpdateIdentityProviderSCIMResponseBodyData data;

    /**
     * <p>The processing status of the current request. This status is not equivalent to the final result of the background node.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message indicating that the request is accepted or a fault occurs. Check the result of the asynchronous task by calling the corresponding query API.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request. You can use the ID to associate the call with troubleshooting. Retain the ID when a failure occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>request-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the current request is processed successfully. A value of true indicates that the request is processed successfully. For asynchronous write operations, you must continue to query the task results.</p>
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
         * <p>HTTP-Redirect or HTTP-POST. Required when manually filled in. The query returns the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>Required when manually filled in. The value must be non-empty and cannot exceed 2,048 characters. Existing configurations cannot be replaced. This ID is different from the local entity ID queried by the SP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>Required when manually filled in. The value must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The actual switch value, which is Enabled or Disabled. This value is not equivalent to the expected value of loginEnabled saved in AC.</p>
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
         * <p>The SAML binding URI in the historical metadata snapshot. For CustomSSO updates, use saml.bindingType.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect</p>
         */
        @NameInMap("binding")
        public String binding;

        /**
         * <p>The certificate string in the historical metadata snapshot. To edit the configuration, use saml.x509Certificates and do not submit the old metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>MIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQELBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoXDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8oGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYNW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbYEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Okkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0EBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUWld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImcaWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTqP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjocJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdVjfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5</p>
         */
        @NameInMap("certificates")
        public String certificates;

        /**
         * <p>Required when manually filled in. The value must be non-empty and cannot exceed 2,048 characters. Existing configurations cannot be replaced. This ID is different from the local entity ID queried by the SP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>Required when manually filled in. The value must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
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
         * <p>HTTP-Redirect or HTTP-POST. Required when manually filled in. The query returns the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>Required when manually filled in. The value must be non-empty and cannot exceed 2,048 characters. Existing configurations cannot be replaced. This ID is different from the local entity ID queried by the SP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>Required when manually filled in. The value must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>Required when manually filled in. The value must be a non-empty array and use PEM X.509 certificate text. The current validity period is verified. A maximum of two certificates are allowed after deduplication.</p>
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
         * <p>The actual SAML configuration is read back on demand only by GetIdentityProvider. The SCIM query and prepare operations return the actual receiving status and URL.</p>
         */
        @NameInMap("configuration")
        public UpdateIdentityProviderSCIMResponseBodyDataConfiguration configuration;

        /**
         * <p>The creation time recorded on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-26T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>CustomSSO returns an empty string. The SCIM receiving URL must be obtained by using the SCIM query or prepare API. The example shows a JSON empty string &quot;&quot;. The actual value does not contain double quotation marks.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("eventSubscriptionCallbackUrl")
        public String eventSubscriptionCallbackUrl;

        /**
         * <p>General CRUD operations support DingTalk, Feishu, and CustomSSO. SP queries support only CustomSSO. The SCIM path uses the CustomSSO shared pool.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomSSO</p>
         */
        @NameInMap("identityProviderType")
        public String identityProviderType;

        /**
         * <p>CustomSSO returns an empty string. The ACS URL for SAML must be obtained by using the SP query API. The example shows a JSON empty string &quot;&quot;. The actual value does not contain double quotation marks.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("loginCallbackUrl")
        public String loginCallbackUrl;

        /**
         * <p>Do not set this parameter to true during CustomSSO initialization. A valid SAML configuration must be saved before enabling. Disabling the feature does not delete the configuration. If an asynchronous failure occurs, this expected value does not indicate that the upstream configuration has taken effect.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>Vendor parameters are used for DingTalk and Feishu. CustomSSO updates use protocol and saml, and do not accept this field. The return value does not contain vendor keys.</p>
         */
        @NameInMap("metadata")
        public UpdateIdentityProviderSCIMResponseBodyDataMetadata metadata;

        /**
         * <p>When the status is PENDING or RUNNING, poll GetIdentityProviderSCIM. The facts of failure, pause, and cancellation are retained. This status does not indicate the SAML status.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("operationStatus")
        public String operationStatus;

        /**
         * <p>Only SAML is supported. If no valid configuration is saved, this parameter may not be returned. OIDC placeholder initialization is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The input supports either XML or complete manual entry. The query returns the standardized configuration and does not echo the original XML. This parameter can be omitted if it is not configured.</p>
         */
        @NameInMap("saml")
        public UpdateIdentityProviderSCIMResponseBodyDataSaml saml;

        /**
         * <p>The independent SCIM status. This status does not change the meaning of the original status for shared resources and logon configurations. This parameter corresponds to data.status in the query API.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATING</p>
         */
        @NameInMap("scimStatus")
        public String scimStatus;

        /**
         * <p>The user pool lifecycle and logon configuration task status of CustomSSO. This status does not indicate the SCIM operation result. You can query the SCIM switch result by using GetIdentityProviderSCIM.operationStatus. You cannot use this status to determine whether all protocols are configured.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Do not set this parameter to true during CustomSSO initialization. You can only update this parameter by calling UpdateIdentityProviderSCIM later. Determine the result based on operationStatus.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        /**
         * <p>The most recent update time recorded on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-26T00:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>Required. The ID of the target workspace. The request region must be the same as the region of the target workspace.</p>
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
