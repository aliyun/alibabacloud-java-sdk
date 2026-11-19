// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The external identity provider binding information after the unbind operation is accepted.</p>
     */
    @NameInMap("data")
    public DeleteIdentityProviderResponseBodyData data;

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

    public static DeleteIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdentityProviderResponseBody self = new DeleteIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIdentityProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteIdentityProviderResponseBody setData(DeleteIdentityProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteIdentityProviderResponseBodyData getData() {
        return this.data;
    }

    public DeleteIdentityProviderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteIdentityProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteIdentityProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteIdentityProviderResponseBodyDataConfiguration extends TeaModel {
        /**
         * <p>HTTP-Redirect or HTTP-POST. Required for manual entry. Queries return the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>Required for manual entry. It must be non-empty and contain a maximum of 2,048 characters. Existing configurations cannot be replaced. This is different from the local entity ID queried by the service provider (SP).</p>
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
         * <p>The actual switch value is Enabled or Disabled, which differs from the expected loginEnabled value saved in the AC.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("ssoStatus")
        public String ssoStatus;

        public static DeleteIdentityProviderResponseBodyDataConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DeleteIdentityProviderResponseBodyDataConfiguration self = new DeleteIdentityProviderResponseBodyDataConfiguration();
            return TeaModel.build(map, self);
        }

        public DeleteIdentityProviderResponseBodyDataConfiguration setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public DeleteIdentityProviderResponseBodyDataConfiguration setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public DeleteIdentityProviderResponseBodyDataConfiguration setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public DeleteIdentityProviderResponseBodyDataConfiguration setSsoStatus(String ssoStatus) {
            this.ssoStatus = ssoStatus;
            return this;
        }
        public String getSsoStatus() {
            return this.ssoStatus;
        }

    }

    public static class DeleteIdentityProviderResponseBodyDataOidc extends TeaModel {
        /**
         * <p>The absolute HTTPS URL required in manual entry mode. Do not enter this in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/authorize">https://idp.example.com/authorize</a></p>
         */
        @NameInMap("authorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The default value is client_secret_post. If none is selected, PKCE must be enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>client_secret_post</p>
         */
        @NameInMap("clientAuthMethod")
        public String clientAuthMethod;

        /**
         * <p>The client ID registered in the external IdP, which is different from the Matrix client. In-place replacement is not supported after configuration.</p>
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
         * <p>The absolute HTTPS issuer of the external IdP. In-place replacement is not supported after configuration.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com">https://idp.example.com</a></p>
         */
        @NameInMap("issuer")
        public String issuer;

        /**
         * <p>The absolute HTTPS URL required in manual entry mode. Do not enter this in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/jwks">https://idp.example.com/jwks</a></p>
         */
        @NameInMap("jwksUri")
        public String jwksUri;

        /**
         * <p>Specifies whether PKCE is enabled. Default value: true. It must be true when client authentication is not used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("pkceRequired")
        public Boolean pkceRequired;

        /**
         * <p>The string array. It must contain openid. The default values are openid, profile, and email.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;openid&quot;,&quot;profile&quot;,&quot;email&quot;]</p>
         */
        @NameInMap("scopes")
        public java.util.List<String> scopes;

        /**
         * <p>The claim name in the ID token used to match the SCIM externalId. If omitted during the first creation, the default value sub is used. If omitted during an update, the saved value is retained. For Azure, you can enter oid. It must be non-empty and contain no whitespace characters. When queried, oidc returns the saved value, and oidcConfiguration returns the actual upstream value, which may be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>oid</p>
         */
        @NameInMap("ssoMappingClaim")
        public String ssoMappingClaim;

        /**
         * <p>The absolute HTTPS URL required in manual entry mode. Do not enter this in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/token">https://idp.example.com/token</a></p>
         */
        @NameInMap("tokenEndpoint")
        public String tokenEndpoint;

        /**
         * <p>The optional absolute HTTPS URL in manual entry mode. Do not enter this in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/userinfo">https://idp.example.com/userinfo</a></p>
         */
        @NameInMap("userinfoEndpoint")
        public String userinfoEndpoint;

        public static DeleteIdentityProviderResponseBodyDataOidc build(java.util.Map<String, ?> map) throws Exception {
            DeleteIdentityProviderResponseBodyDataOidc self = new DeleteIdentityProviderResponseBodyDataOidc();
            return TeaModel.build(map, self);
        }

        public DeleteIdentityProviderResponseBodyDataOidc setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public DeleteIdentityProviderResponseBodyDataOidc setClientAuthMethod(String clientAuthMethod) {
            this.clientAuthMethod = clientAuthMethod;
            return this;
        }
        public String getClientAuthMethod() {
            return this.clientAuthMethod;
        }

        public DeleteIdentityProviderResponseBodyDataOidc setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DeleteIdentityProviderResponseBodyDataOidc setDiscoveryEndpoint(String discoveryEndpoint) {
            this.discoveryEndpoint = discoveryEndpoint;
            return this;
        }
        public String getDiscoveryEndpoint() {
            return this.discoveryEndpoint;
        }

        public DeleteIdentityProviderResponseBodyDataOidc setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DeleteIdentityProviderResponseBodyDataOidc setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public DeleteIdentityProviderResponseBodyDataOidc setPkceRequired(Boolean pkceRequired) {
            this.pkceRequired = pkceRequired;
            return this;
        }
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        public DeleteIdentityProviderResponseBodyDataOidc setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public DeleteIdentityProviderResponseBodyDataOidc setSsoMappingClaim(String ssoMappingClaim) {
            this.ssoMappingClaim = ssoMappingClaim;
            return this;
        }
        public String getSsoMappingClaim() {
            return this.ssoMappingClaim;
        }

        public DeleteIdentityProviderResponseBodyDataOidc setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public DeleteIdentityProviderResponseBodyDataOidc setUserinfoEndpoint(String userinfoEndpoint) {
            this.userinfoEndpoint = userinfoEndpoint;
            return this;
        }
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

    }

    public static class DeleteIdentityProviderResponseBodyDataSaml extends TeaModel {
        /**
         * <p>HTTP-Redirect or HTTP-POST. Required for manual entry. Queries return the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>Required for manual entry. It must be non-empty and contain a maximum of 2,048 characters. Existing configurations cannot be replaced. This is different from the local entity ID queried by the service provider (SP).</p>
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
         * <p>Required for manual entry as a non-empty array. Use PEM X.509 certificate text. The current validity period is verified. A maximum of two certificates are allowed after deduplication.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;-----BEGIN CERTIFICATE-----\\nMIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQEL\\nBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoX\\nDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjAN\\nBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8\\noGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYN\\nW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbY\\nEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Ok\\nkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0E\\nBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQAB\\nMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUW\\nld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImca\\nWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTq\\nP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjoc\\nJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdV\\njfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5\\n-----END CERTIFICATE-----&quot;]</p>
         */
        @NameInMap("x509Certificates")
        public java.util.List<String> x509Certificates;

        public static DeleteIdentityProviderResponseBodyDataSaml build(java.util.Map<String, ?> map) throws Exception {
            DeleteIdentityProviderResponseBodyDataSaml self = new DeleteIdentityProviderResponseBodyDataSaml();
            return TeaModel.build(map, self);
        }

        public DeleteIdentityProviderResponseBodyDataSaml setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public DeleteIdentityProviderResponseBodyDataSaml setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public DeleteIdentityProviderResponseBodyDataSaml setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public DeleteIdentityProviderResponseBodyDataSaml setX509Certificates(java.util.List<String> x509Certificates) {
            this.x509Certificates = x509Certificates;
            return this;
        }
        public java.util.List<String> getX509Certificates() {
            return this.x509Certificates;
        }

    }

    public static class DeleteIdentityProviderResponseBodyData extends TeaModel {
        /**
         * <p>The actual SAML configuration is read back on demand only in GetIdentityProvider. SCIM queries and preparations return the actual receiving status and URL.</p>
         */
        @NameInMap("configuration")
        public DeleteIdentityProviderResponseBodyDataConfiguration configuration;

        /**
         * <p>The type of the external identity provider. Valid values: DingTalk and Feishu.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("identityProviderType")
        public String identityProviderType;

        /**
         * <p>The security summary of the expected configuration. It does not contain credentials. The original SAML fields and meanings are retained.</p>
         */
        @NameInMap("oidc")
        public DeleteIdentityProviderResponseBodyDataOidc oidc;

        /**
         * <p>Currently, only SAML is supported. This field is not returned when no valid configuration is saved. Initialization with an OIDC placeholder is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The input supports either XML or complete manual entry. Queries return the standardized configuration and do not echo the original XML. This field can be omitted when not configured.</p>
         */
        @NameInMap("saml")
        public DeleteIdentityProviderResponseBodyDataSaml saml;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>CONFIGURED: The configuration is accepted and waiting for the user pool to be activated.</li>
         * <li>SYNCING: Organization members are being synchronized.</li>
         * <li>SYNCED: The synchronization of organization members is complete.</li>
         * <li>READY: The binding is in effect.</li>
         * <li>SYNC_FAILED: The synchronization of organization members failed.</li>
         * <li>UPDATING: The configuration is being updated.</li>
         * <li>UPDATE_FAILED: The configuration update failed.</li>
         * <li>DISCONNECTING: The binding is being disconnected.</li>
         * <li>DISCONNECT_FAILED: The disconnection failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static DeleteIdentityProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteIdentityProviderResponseBodyData self = new DeleteIdentityProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteIdentityProviderResponseBodyData setConfiguration(DeleteIdentityProviderResponseBodyDataConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public DeleteIdentityProviderResponseBodyDataConfiguration getConfiguration() {
            return this.configuration;
        }

        public DeleteIdentityProviderResponseBodyData setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public DeleteIdentityProviderResponseBodyData setOidc(DeleteIdentityProviderResponseBodyDataOidc oidc) {
            this.oidc = oidc;
            return this;
        }
        public DeleteIdentityProviderResponseBodyDataOidc getOidc() {
            return this.oidc;
        }

        public DeleteIdentityProviderResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DeleteIdentityProviderResponseBodyData setSaml(DeleteIdentityProviderResponseBodyDataSaml saml) {
            this.saml = saml;
            return this;
        }
        public DeleteIdentityProviderResponseBodyDataSaml getSaml() {
            return this.saml;
        }

        public DeleteIdentityProviderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteIdentityProviderResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
