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
     * <p>The binding information of the external identity provider.</p>
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
     * <p>The response message. Returns an error description when the request fails.</p>
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
         * <p>HTTP-Redirect or HTTP-POST. Required for manual entry. Queries return the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>Required for manual entry. It must be non-empty and contain a maximum of 2,048 characters. It cannot be changed after configuration. It is different from the local entity ID queried by the service provider (SP).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>Required for manual entry. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The actual switch value, which is Enabled or Disabled. It is not equivalent to the expected loginEnabled value saved in the access configuration.</p>
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

    public static class CreateIdentityProviderResponseBodyDataOidc extends TeaModel {
        /**
         * <p>The absolute HTTPS URL required in manual entry mode. Do not specify this field in discovery mode.</p>
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
         * <p>The client ID registered in the external IdP, which is different from the Matrix client. It cannot be replaced in place after configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>example-client</p>
         */
        @NameInMap("clientId")
        public String clientId;

        /**
         * <p>The absolute HTTPS discovery endpoint. It is mutually exclusive with manually entered endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/.well-known/openid-configuration">https://idp.example.com/.well-known/openid-configuration</a></p>
         */
        @NameInMap("discoveryEndpoint")
        public String discoveryEndpoint;

        /**
         * <p>The absolute HTTPS issuer of the external IdP. It cannot be replaced in place after configuration.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com">https://idp.example.com</a></p>
         */
        @NameInMap("issuer")
        public String issuer;

        /**
         * <p>The absolute HTTPS URL required in manual entry mode. Do not specify this field in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/jwks">https://idp.example.com/jwks</a></p>
         */
        @NameInMap("jwksUri")
        public String jwksUri;

        /**
         * <p>Specifies whether PKCE is enabled. Default value: true. This parameter must be set to true when client authentication is not used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("pkceRequired")
        public Boolean pkceRequired;

        /**
         * <p>An array of strings that must include openid. Default values: openid, profile, and email.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;openid&quot;,&quot;profile&quot;,&quot;email&quot;]</p>
         */
        @NameInMap("scopes")
        public java.util.List<String> scopes;

        /**
         * <p>The name of the claim in the ID token that is used to match the SCIM externalId. If omitted during creation, the default value sub is used. If omitted during an update, the saved value is retained. For Azure, you can specify oid. The value must be non-empty and contain no whitespace characters. When you query oidc, the saved value is returned. When you query oidcConfiguration, the actual upstream value is returned, which may be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>oid</p>
         */
        @NameInMap("ssoMappingClaim")
        public String ssoMappingClaim;

        /**
         * <p>The absolute HTTPS URL required in manual entry mode. Do not specify this field in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/token">https://idp.example.com/token</a></p>
         */
        @NameInMap("tokenEndpoint")
        public String tokenEndpoint;

        /**
         * <p>The optional absolute HTTPS URL for manual mode. Leave this field empty in Discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/userinfo">https://idp.example.com/userinfo</a></p>
         */
        @NameInMap("userinfoEndpoint")
        public String userinfoEndpoint;

        public static CreateIdentityProviderResponseBodyDataOidc build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderResponseBodyDataOidc self = new CreateIdentityProviderResponseBodyDataOidc();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderResponseBodyDataOidc setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public CreateIdentityProviderResponseBodyDataOidc setClientAuthMethod(String clientAuthMethod) {
            this.clientAuthMethod = clientAuthMethod;
            return this;
        }
        public String getClientAuthMethod() {
            return this.clientAuthMethod;
        }

        public CreateIdentityProviderResponseBodyDataOidc setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public CreateIdentityProviderResponseBodyDataOidc setDiscoveryEndpoint(String discoveryEndpoint) {
            this.discoveryEndpoint = discoveryEndpoint;
            return this;
        }
        public String getDiscoveryEndpoint() {
            return this.discoveryEndpoint;
        }

        public CreateIdentityProviderResponseBodyDataOidc setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public CreateIdentityProviderResponseBodyDataOidc setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public CreateIdentityProviderResponseBodyDataOidc setPkceRequired(Boolean pkceRequired) {
            this.pkceRequired = pkceRequired;
            return this;
        }
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        public CreateIdentityProviderResponseBodyDataOidc setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public CreateIdentityProviderResponseBodyDataOidc setSsoMappingClaim(String ssoMappingClaim) {
            this.ssoMappingClaim = ssoMappingClaim;
            return this;
        }
        public String getSsoMappingClaim() {
            return this.ssoMappingClaim;
        }

        public CreateIdentityProviderResponseBodyDataOidc setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public CreateIdentityProviderResponseBodyDataOidc setUserinfoEndpoint(String userinfoEndpoint) {
            this.userinfoEndpoint = userinfoEndpoint;
            return this;
        }
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

    }

    public static class CreateIdentityProviderResponseBodyDataSaml extends TeaModel {
        /**
         * <p>HTTP-Redirect or HTTP-POST. Required for manual entry. Queries return the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>Required for manual entry. It must be non-empty and contain a maximum of 2,048 characters. It cannot be changed after configuration. It is different from the local entity ID queried by the service provider (SP).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>Required for manual entry. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>Required for manual entry. It must be a non-empty array that uses PEM X.509 certificate text. The current validity period is verified. A maximum of two certificates are allowed after deduplication.</p>
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
         * <p>When the mode is SelectedDepartments, this parameter must contain at least one non-empty department ID, which should be obtained from ListIdentityProviderDepartments. When the mode is AllAuthorized, pass an empty array or omit this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10001&quot;]</p>
         */
        @NameInMap("departmentIds")
        public java.util.List<String> departmentIds;

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>AllAuthorized: the entire authorized scope, which is limited by the application address book authorization.</li>
         * <li>SelectedDepartments: the selected departments and all their sub-departments.
         * When explicitly submitting syncScope, you must provide a valid mode, which is verified by the backend.</li>
         * </ul>
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
         * <p>The actual SAML configuration is read back on demand only in GetIdentityProvider. SCIM queries and preparations return the actual receiving status and URL.</p>
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
         * <p>The security summary of the expected configuration. It does not contain credentials. The original SAML fields and meanings are retained.</p>
         */
        @NameInMap("oidc")
        public CreateIdentityProviderResponseBodyDataOidc oidc;

        /**
         * <p>Currently, only SAML is supported. This field may not be returned if no valid configuration is saved. Initialization with an OIDC placeholder is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The input supports either XML or full manual entry. Queries return the standardized configuration and do not echo the original XML. This field can be omitted if it is not configured.</p>
         */
        @NameInMap("saml")
        public CreateIdentityProviderResponseBodyDataSaml saml;

        /**
         * <p>The binding status. Valid values:</p>
         * <ul>
         * <li>CONFIGURED: configuration accepted and waiting for user pool activation</li>
         * <li>SYNCING: synchronizing organization members</li>
         * <li>SYNCED: organization member synchronization completed</li>
         * <li>READY: binding in effect</li>
         * <li>SYNC_FAILED: organization member synchronization failed</li>
         * <li>UPDATING: updating configuration</li>
         * <li>UPDATE_FAILED: configuration update failed</li>
         * <li>DISCONNECTING: disconnecting the binding</li>
         * <li>DISCONNECT_FAILED: disconnection failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Specifies whether to enable organization member synchronization. When enabled, organization members are synchronized as workspace users by the external identity provider.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        /**
         * <p>Uses the department-based synchronization scope definition. If omitted during creation, the default value is AllAuthorized, and the initial vendor synchronization is determined by syncOnBind. If omitted or set to null during an update, the original value is retained. Updating and saving the scope does not automatically trigger full synchronization.</p>
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

        public CreateIdentityProviderResponseBodyData setOidc(CreateIdentityProviderResponseBodyDataOidc oidc) {
            this.oidc = oidc;
            return this;
        }
        public CreateIdentityProviderResponseBodyDataOidc getOidc() {
            return this.oidc;
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
