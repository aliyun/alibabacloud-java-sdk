// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>The business result code. If the request fails, use this code along with the HTTP status code and message for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The business result. For the result structure, refer to the response fields of this operation. For asynchronous write operations, the response indicates that the request is accepted, but does not guarantee that the background task is completed.</p>
     */
    @NameInMap("data")
    public UpdateIdentityProviderResponseBodyData data;

    /**
     * <p>The processing status of the current request. This does not indicate the final result of the background task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request acceptance or error message. For asynchronous tasks, verify the task result by calling the corresponding query operation.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID. Retain this ID to correlate the current call and troubleshoot failures.</p>
     * 
     * <strong>example:</strong>
     * <p>request-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the current request is processed successfully. A value of true indicates success. For asynchronous write operations, you must still query the task result.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderResponseBody self = new UpdateIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateIdentityProviderResponseBody setData(UpdateIdentityProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateIdentityProviderResponseBodyData getData() {
        return this.data;
    }

    public UpdateIdentityProviderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateIdentityProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateIdentityProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateIdentityProviderResponseBodyDataConfiguration extends TeaModel {
        /**
         * <p>HTTP-Redirect or HTTP-POST. Required for manual entry. The query returns the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>Required for manual entry. It must be non-empty and contain up to 2,048 characters. The existing configuration does not support replacement. It is different from the local entity ID returned by the SP query.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>Required for manual entry. It must be an absolute HTTPS URL and must not contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The actual switch value, which is Enabled or Disabled. This is not equivalent to the expected loginEnabled value saved in AC.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("ssoStatus")
        public String ssoStatus;

        public static UpdateIdentityProviderResponseBodyDataConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderResponseBodyDataConfiguration self = new UpdateIdentityProviderResponseBodyDataConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderResponseBodyDataConfiguration setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public UpdateIdentityProviderResponseBodyDataConfiguration setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateIdentityProviderResponseBodyDataConfiguration setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public UpdateIdentityProviderResponseBodyDataConfiguration setSsoStatus(String ssoStatus) {
            this.ssoStatus = ssoStatus;
            return this;
        }
        public String getSsoStatus() {
            return this.ssoStatus;
        }

    }

    public static class UpdateIdentityProviderResponseBodyDataOidc extends TeaModel {
        /**
         * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/authorize">https://idp.example.com/authorize</a></p>
         */
        @NameInMap("authorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The default value is client_secret_post. If the value is none, PKCE must be enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>client_secret_post</p>
         */
        @NameInMap("clientAuthMethod")
        public String clientAuthMethod;

        /**
         * <p>The client identifier registered in the external IdP, which is different from the Matrix client. This value cannot be changed in place after it is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>example-client</p>
         */
        @NameInMap("clientId")
        public String clientId;

        /**
         * <p>The absolute HTTPS discovery endpoint URL. This parameter is mutually exclusive with manually specified endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/.well-known/openid-configuration">https://idp.example.com/.well-known/openid-configuration</a></p>
         */
        @NameInMap("discoveryEndpoint")
        public String discoveryEndpoint;

        /**
         * <p>The absolute HTTPS issuer URL of the external IdP. This value cannot be changed in place after it is configured.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com">https://idp.example.com</a></p>
         */
        @NameInMap("issuer")
        public String issuer;

        /**
         * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/jwks">https://idp.example.com/jwks</a></p>
         */
        @NameInMap("jwksUri")
        public String jwksUri;

        /**
         * <p>Specifies whether PKCE is enabled. Default value: true. This parameter must be set to true when no client authentication is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("pkceRequired")
        public Boolean pkceRequired;

        /**
         * <p>The array of scope strings. It must include openid. Default values: openid, profile, and email.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;openid&quot;,&quot;profile&quot;,&quot;email&quot;]</p>
         */
        @NameInMap("scopes")
        public java.util.List<String> scopes;

        /**
         * <p>The name of the claim in the ID token used to match the SCIM externalId. If omitted during the initial configuration, the default value is sub. If omitted during an update, the saved value is retained. For Azure, you can specify oid. The value must be non-empty and cannot contain whitespace characters. When queried, oidc returns the saved value, while oidcConfiguration returns the actual upstream value, which may be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>oid</p>
         */
        @NameInMap("ssoMappingClaim")
        public String ssoMappingClaim;

        /**
         * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/token">https://idp.example.com/token</a></p>
         */
        @NameInMap("tokenEndpoint")
        public String tokenEndpoint;

        /**
         * <p>The optional absolute HTTPS URL in manual mode. Do not specify this parameter in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/userinfo">https://idp.example.com/userinfo</a></p>
         */
        @NameInMap("userinfoEndpoint")
        public String userinfoEndpoint;

        public static UpdateIdentityProviderResponseBodyDataOidc build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderResponseBodyDataOidc self = new UpdateIdentityProviderResponseBodyDataOidc();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderResponseBodyDataOidc setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public UpdateIdentityProviderResponseBodyDataOidc setClientAuthMethod(String clientAuthMethod) {
            this.clientAuthMethod = clientAuthMethod;
            return this;
        }
        public String getClientAuthMethod() {
            return this.clientAuthMethod;
        }

        public UpdateIdentityProviderResponseBodyDataOidc setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public UpdateIdentityProviderResponseBodyDataOidc setDiscoveryEndpoint(String discoveryEndpoint) {
            this.discoveryEndpoint = discoveryEndpoint;
            return this;
        }
        public String getDiscoveryEndpoint() {
            return this.discoveryEndpoint;
        }

        public UpdateIdentityProviderResponseBodyDataOidc setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public UpdateIdentityProviderResponseBodyDataOidc setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public UpdateIdentityProviderResponseBodyDataOidc setPkceRequired(Boolean pkceRequired) {
            this.pkceRequired = pkceRequired;
            return this;
        }
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        public UpdateIdentityProviderResponseBodyDataOidc setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public UpdateIdentityProviderResponseBodyDataOidc setSsoMappingClaim(String ssoMappingClaim) {
            this.ssoMappingClaim = ssoMappingClaim;
            return this;
        }
        public String getSsoMappingClaim() {
            return this.ssoMappingClaim;
        }

        public UpdateIdentityProviderResponseBodyDataOidc setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public UpdateIdentityProviderResponseBodyDataOidc setUserinfoEndpoint(String userinfoEndpoint) {
            this.userinfoEndpoint = userinfoEndpoint;
            return this;
        }
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

    }

    public static class UpdateIdentityProviderResponseBodyDataSaml extends TeaModel {
        /**
         * <p>HTTP-Redirect or HTTP-POST. Required for manual entry. The query returns the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>Required for manual entry. It must be non-empty and contain up to 2,048 characters. The existing configuration does not support replacement. It is different from the local entity ID returned by the SP query.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>Required for manual entry. It must be an absolute HTTPS URL and must not contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>Required for manual entry. It must be a non-empty array using PEM X.509 certificate text. The current validity period is verified. Up to two certificates are allowed after deduplication.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;-----BEGIN CERTIFICATE-----\\nMIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQEL\\nBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoX\\nDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjAN\\nBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8\\noGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYN\\nW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbY\\nEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Ok\\nkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0E\\nBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQAB\\nMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUW\\nld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImca\\nWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTq\\nP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjoc\\nJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdV\\njfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5\\n-----END CERTIFICATE-----&quot;]</p>
         */
        @NameInMap("x509Certificates")
        public java.util.List<String> x509Certificates;

        public static UpdateIdentityProviderResponseBodyDataSaml build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderResponseBodyDataSaml self = new UpdateIdentityProviderResponseBodyDataSaml();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderResponseBodyDataSaml setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public UpdateIdentityProviderResponseBodyDataSaml setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateIdentityProviderResponseBodyDataSaml setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public UpdateIdentityProviderResponseBodyDataSaml setX509Certificates(java.util.List<String> x509Certificates) {
            this.x509Certificates = x509Certificates;
            return this;
        }
        public java.util.List<String> getX509Certificates() {
            return this.x509Certificates;
        }

    }

    public static class UpdateIdentityProviderResponseBodyDataSyncScope extends TeaModel {
        /**
         * <p>When set to SelectedDepartments, it must contain at least one non-empty department ID, which should be obtained from ListIdentityProviderDepartments. When set to AllAuthorized, pass an empty array or omit this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10001&quot;]</p>
         */
        @NameInMap("departmentIds")
        public java.util.List<String> departmentIds;

        /**
         * <p>AllAuthorized: the full authorization scope, subject to the application address book authorization limits. SelectedDepartments: the selected departments and all their sub-departments. When explicitly submitting syncScope, a valid mode must be provided and verified by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>SelectedDepartments</p>
         */
        @NameInMap("mode")
        public String mode;

        public static UpdateIdentityProviderResponseBodyDataSyncScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderResponseBodyDataSyncScope self = new UpdateIdentityProviderResponseBodyDataSyncScope();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderResponseBodyDataSyncScope setDepartmentIds(java.util.List<String> departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }
        public java.util.List<String> getDepartmentIds() {
            return this.departmentIds;
        }

        public UpdateIdentityProviderResponseBodyDataSyncScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class UpdateIdentityProviderResponseBodyData extends TeaModel {
        /**
         * <p>The actual upstream configuration. The actual SAML configuration is read on demand only in GetIdentityProvider. SCIM queries and preparations return the actual reception status and URL.</p>
         */
        @NameInMap("configuration")
        public UpdateIdentityProviderResponseBodyDataConfiguration configuration;

        /**
         * <p>General CRUD operations support DingTalk, Feishu, and CustomSSO. SP queries support only CustomSSO. The SCIM path uses the CustomSSO shared pool.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomSSO</p>
         */
        @NameInMap("identityProviderType")
        public String identityProviderType;

        /**
         * <p>Do not pass true during CustomSSO initialization. A valid SAML configuration must be saved before enabling. Disabling does not delete the configuration. If an asynchronous failure occurs, this expected value does not indicate that it has taken effect upstream.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>The expected security summary of the configuration. This does not include credentials. The original SAML fields and meanings are retained.</p>
         */
        @NameInMap("oidc")
        public UpdateIdentityProviderResponseBodyDataOidc oidc;

        /**
         * <p>The login protocol for CustomSSO. Currently, only SAML is supported. You can pass SAML when saving the SAML configuration. You can omit this parameter if you only modify loginEnabled. DingTalk and Feishu do not accept this field.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The SAML configuration for CustomSSO. Choose either metadataXml or the four manually entered fields: entityId, loginUrl, bindingType, and x509Certificates. If not submitted, the existing configuration is retained. DingTalk and Feishu do not accept this field.</p>
         */
        @NameInMap("saml")
        public UpdateIdentityProviderResponseBodyDataSaml saml;

        /**
         * <p>The status of the identity source resource and logon configuration. A READY status in the CustomSSO shared pool does not mean that SAML is configured. Query operationStatus independently for SCIM operation results.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Specifies whether synchronization is enabled. Do not set this parameter to true during CustomSSO initialization. You can only update this parameter later by calling UpdateIdentityProviderSCIM. Evaluate the result in combination with operationStatus.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        /**
         * <p>Follows the definition of the department-based synchronization scope. If omitted during creation, the default value is AllAuthorized. The initial provider synchronization is determined by syncOnBind. If omitted or set to null during an update, the original value is retained. Saving the scope during an update does not automatically trigger a full synchronization.</p>
         */
        @NameInMap("syncScope")
        public UpdateIdentityProviderResponseBodyDataSyncScope syncScope;

        /**
         * <p>Required. The ID of the destination workspace. The region of the request must be the same as the region of the destination workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-example</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static UpdateIdentityProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderResponseBodyData self = new UpdateIdentityProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderResponseBodyData setConfiguration(UpdateIdentityProviderResponseBodyDataConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public UpdateIdentityProviderResponseBodyDataConfiguration getConfiguration() {
            return this.configuration;
        }

        public UpdateIdentityProviderResponseBodyData setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public UpdateIdentityProviderResponseBodyData setLoginEnabled(Boolean loginEnabled) {
            this.loginEnabled = loginEnabled;
            return this;
        }
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        public UpdateIdentityProviderResponseBodyData setOidc(UpdateIdentityProviderResponseBodyDataOidc oidc) {
            this.oidc = oidc;
            return this;
        }
        public UpdateIdentityProviderResponseBodyDataOidc getOidc() {
            return this.oidc;
        }

        public UpdateIdentityProviderResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateIdentityProviderResponseBodyData setSaml(UpdateIdentityProviderResponseBodyDataSaml saml) {
            this.saml = saml;
            return this;
        }
        public UpdateIdentityProviderResponseBodyDataSaml getSaml() {
            return this.saml;
        }

        public UpdateIdentityProviderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateIdentityProviderResponseBodyData setSyncEnabled(Boolean syncEnabled) {
            this.syncEnabled = syncEnabled;
            return this;
        }
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        public UpdateIdentityProviderResponseBodyData setSyncScope(UpdateIdentityProviderResponseBodyDataSyncScope syncScope) {
            this.syncScope = syncScope;
            return this;
        }
        public UpdateIdentityProviderResponseBodyDataSyncScope getSyncScope() {
            return this.syncScope;
        }

        public UpdateIdentityProviderResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
