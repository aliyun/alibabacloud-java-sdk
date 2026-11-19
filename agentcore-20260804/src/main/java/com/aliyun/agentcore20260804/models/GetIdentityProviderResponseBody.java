// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The binding details of the external identity provider.</p>
     */
    @NameInMap("data")
    public GetIdentityProviderResponseBodyData data;

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

    public static GetIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderResponseBody self = new GetIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIdentityProviderResponseBody setData(GetIdentityProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIdentityProviderResponseBodyData getData() {
        return this.data;
    }

    public GetIdentityProviderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetIdentityProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIdentityProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetIdentityProviderResponseBodyDataConfiguration extends TeaModel {
        /**
         * <p>The SAML binding type. Valid values: HTTP-Redirect and HTTP-POST. This parameter is required when manually filled in. Queries return short names.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>This parameter is required when manually filled in. It must be non-empty and contain a maximum of 2,048 characters. Existing configurations do not support replacement. It is different from the Entity ID queried by the service provider (SP).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>This parameter is required when manually filled in. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The actual switch value is Enabled or Disabled, which is not equivalent to the expected loginEnabled value saved in AC.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("ssoStatus")
        public String ssoStatus;

        public static GetIdentityProviderResponseBodyDataConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyDataConfiguration self = new GetIdentityProviderResponseBodyDataConfiguration();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyDataConfiguration setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public GetIdentityProviderResponseBodyDataConfiguration setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetIdentityProviderResponseBodyDataConfiguration setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public GetIdentityProviderResponseBodyDataConfiguration setSsoStatus(String ssoStatus) {
            this.ssoStatus = ssoStatus;
            return this;
        }
        public String getSsoStatus() {
            return this.ssoStatus;
        }

    }

    public static class GetIdentityProviderResponseBodyDataMetadata extends TeaModel {
        /**
         * <p>The App ID of the Lark application. This parameter is required when the binding type is Feishu.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_exampleappid01</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The AppKey of the DingTalk application. This parameter is required when the binding type is DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>dingexampleappkey01</p>
         */
        @NameInMap("appKey")
        public String appKey;

        /**
         * <p>The SAML Binding URI in the historical metadata snapshot. For CustomSSO updates, use saml.bindingType.</p>
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
         * <p>The CorpId of the DingTalk enterprise. This parameter is required when the binding type is DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>dingexamplecorpid01</p>
         */
        @NameInMap("corpId")
        public String corpId;

        /**
         * <p>This parameter is required when manually filled in. It must be non-empty and contain a maximum of 2,048 characters. Existing configurations do not support replacement. It is different from the Entity ID queried by the service provider (SP).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>This parameter is required when manually filled in. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        public static GetIdentityProviderResponseBodyDataMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyDataMetadata self = new GetIdentityProviderResponseBodyDataMetadata();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyDataMetadata setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetIdentityProviderResponseBodyDataMetadata setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public GetIdentityProviderResponseBodyDataMetadata setBinding(String binding) {
            this.binding = binding;
            return this;
        }
        public String getBinding() {
            return this.binding;
        }

        public GetIdentityProviderResponseBodyDataMetadata setCertificates(String certificates) {
            this.certificates = certificates;
            return this;
        }
        public String getCertificates() {
            return this.certificates;
        }

        public GetIdentityProviderResponseBodyDataMetadata setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetIdentityProviderResponseBodyDataMetadata setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetIdentityProviderResponseBodyDataMetadata setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

    }

    public static class GetIdentityProviderResponseBodyDataOidc extends TeaModel {
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
         * <p>The client identifier registered in the external IdP, which is different from the Matrix client. In-place replacement is not supported after configuration.</p>
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
         * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/jwks">https://idp.example.com/jwks</a></p>
         */
        @NameInMap("jwksUri")
        public String jwksUri;

        /**
         * <p>Specifies whether PKCE is enabled. Default value: true. It must be set to true when no client authentication is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("pkceRequired")
        public Boolean pkceRequired;

        /**
         * <p>An array of strings that must contain openid. The default values are openid, profile, and email.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;openid&quot;,&quot;profile&quot;,&quot;email&quot;]</p>
         */
        @NameInMap("scopes")
        public java.util.List<String> scopes;

        /**
         * <p>The claim name in the ID token used to match the SCIM externalId. If omitted during initial creation, the default value sub is used. If omitted during an update, the saved value is retained. For Azure, you can enter oid. The value must be non-empty and cannot contain whitespace characters. When you query oidc, the saved value is returned. When you query oidcConfiguration, the actual upstream value is returned, which may be empty.</p>
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

        public static GetIdentityProviderResponseBodyDataOidc build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyDataOidc self = new GetIdentityProviderResponseBodyDataOidc();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyDataOidc setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public GetIdentityProviderResponseBodyDataOidc setClientAuthMethod(String clientAuthMethod) {
            this.clientAuthMethod = clientAuthMethod;
            return this;
        }
        public String getClientAuthMethod() {
            return this.clientAuthMethod;
        }

        public GetIdentityProviderResponseBodyDataOidc setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetIdentityProviderResponseBodyDataOidc setDiscoveryEndpoint(String discoveryEndpoint) {
            this.discoveryEndpoint = discoveryEndpoint;
            return this;
        }
        public String getDiscoveryEndpoint() {
            return this.discoveryEndpoint;
        }

        public GetIdentityProviderResponseBodyDataOidc setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetIdentityProviderResponseBodyDataOidc setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public GetIdentityProviderResponseBodyDataOidc setPkceRequired(Boolean pkceRequired) {
            this.pkceRequired = pkceRequired;
            return this;
        }
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        public GetIdentityProviderResponseBodyDataOidc setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public GetIdentityProviderResponseBodyDataOidc setSsoMappingClaim(String ssoMappingClaim) {
            this.ssoMappingClaim = ssoMappingClaim;
            return this;
        }
        public String getSsoMappingClaim() {
            return this.ssoMappingClaim;
        }

        public GetIdentityProviderResponseBodyDataOidc setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public GetIdentityProviderResponseBodyDataOidc setUserinfoEndpoint(String userinfoEndpoint) {
            this.userinfoEndpoint = userinfoEndpoint;
            return this;
        }
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

    }

    public static class GetIdentityProviderResponseBodyDataOidcConfiguration extends TeaModel {
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
         * <p>The client identifier registered in the external IdP, which is different from the Matrix client. In-place replacement is not supported after configuration.</p>
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
         * <p>Indicates whether the client secret is saved. Only the existence status is returned, not the plaintext.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hasClientPrivateKey")
        public Boolean hasClientPrivateKey;

        /**
         * <p>Indicates whether the client secret is saved. Only the existence status is returned, not the plaintext.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hasClientSecret")
        public Boolean hasClientSecret;

        /**
         * <p>The absolute HTTPS issuer of the external IdP. In-place replacement is not supported after configuration.</p>
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
         * <p>Specifies whether PKCE is enabled. Default value: true. It must be set to true when no client authentication is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("pkceRequired")
        public Boolean pkceRequired;

        /**
         * <p>An array of strings that must contain openid. The default values are openid, profile, and email.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;openid&quot;,&quot;profile&quot;,&quot;email&quot;]</p>
         */
        @NameInMap("scopes")
        public java.util.List<String> scopes;

        /**
         * <p>The claim name in the ID token used to match the SCIM externalId. If omitted during initial creation, the default value sub is used. If omitted during an update, the saved value is retained. For Azure, you can enter oid. The value must be non-empty and cannot contain whitespace characters. When you query oidc, the saved value is returned. When you query oidcConfiguration, the actual upstream value is returned, which may be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>oid</p>
         */
        @NameInMap("ssoMappingClaim")
        public String ssoMappingClaim;

        /**
         * <p>The current upstream logon switch, which is Enabled or Disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("ssoStatus")
        public String ssoStatus;

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

        public static GetIdentityProviderResponseBodyDataOidcConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyDataOidcConfiguration self = new GetIdentityProviderResponseBodyDataOidcConfiguration();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setClientAuthMethod(String clientAuthMethod) {
            this.clientAuthMethod = clientAuthMethod;
            return this;
        }
        public String getClientAuthMethod() {
            return this.clientAuthMethod;
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setDiscoveryEndpoint(String discoveryEndpoint) {
            this.discoveryEndpoint = discoveryEndpoint;
            return this;
        }
        public String getDiscoveryEndpoint() {
            return this.discoveryEndpoint;
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setHasClientPrivateKey(Boolean hasClientPrivateKey) {
            this.hasClientPrivateKey = hasClientPrivateKey;
            return this;
        }
        public Boolean getHasClientPrivateKey() {
            return this.hasClientPrivateKey;
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setHasClientSecret(Boolean hasClientSecret) {
            this.hasClientSecret = hasClientSecret;
            return this;
        }
        public Boolean getHasClientSecret() {
            return this.hasClientSecret;
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setPkceRequired(Boolean pkceRequired) {
            this.pkceRequired = pkceRequired;
            return this;
        }
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setSsoMappingClaim(String ssoMappingClaim) {
            this.ssoMappingClaim = ssoMappingClaim;
            return this;
        }
        public String getSsoMappingClaim() {
            return this.ssoMappingClaim;
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setSsoStatus(String ssoStatus) {
            this.ssoStatus = ssoStatus;
            return this;
        }
        public String getSsoStatus() {
            return this.ssoStatus;
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public GetIdentityProviderResponseBodyDataOidcConfiguration setUserinfoEndpoint(String userinfoEndpoint) {
            this.userinfoEndpoint = userinfoEndpoint;
            return this;
        }
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

    }

    public static class GetIdentityProviderResponseBodyDataSaml extends TeaModel {
        /**
         * <p>The SAML binding type. Valid values: HTTP-Redirect and HTTP-POST. This parameter is required when manually filled in. Queries return short names.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>This parameter is required when manually filled in. It must be non-empty and contain a maximum of 2,048 characters. Existing configurations do not support replacement. It is different from the Entity ID queried by the service provider (SP).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>This parameter is required when manually filled in. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>When manually filled in, a non-empty array is required, using PEM X.509 certificate text. The current validity period is verified, and a maximum of two certificates are allowed after deduplication.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;-----BEGIN CERTIFICATE-----\\nMIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQEL\\nBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoX\\nDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjAN\\nBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8\\noGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYN\\nW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbY\\nEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Ok\\nkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0E\\nBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQAB\\nMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUW\\nld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImca\\nWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTq\\nP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjoc\\nJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdV\\njfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5\\n-----END CERTIFICATE-----&quot;]</p>
         */
        @NameInMap("x509Certificates")
        public java.util.List<String> x509Certificates;

        public static GetIdentityProviderResponseBodyDataSaml build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyDataSaml self = new GetIdentityProviderResponseBodyDataSaml();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyDataSaml setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public GetIdentityProviderResponseBodyDataSaml setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetIdentityProviderResponseBodyDataSaml setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public GetIdentityProviderResponseBodyDataSaml setX509Certificates(java.util.List<String> x509Certificates) {
            this.x509Certificates = x509Certificates;
            return this;
        }
        public java.util.List<String> getX509Certificates() {
            return this.x509Certificates;
        }

    }

    public static class GetIdentityProviderResponseBodyDataSyncScope extends TeaModel {
        /**
         * <p>When the mode is SelectedDepartments, this list must contain at least one non-empty department ID, which should be obtained from ListIdentityProviderDepartments. When the mode is AllAuthorized, pass an empty array or omit this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10001&quot;]</p>
         */
        @NameInMap("departmentIds")
        public java.util.List<String> departmentIds;

        /**
         * <p>The scope mode. Valid values: AllAuthorized (all authorized scopes, limited by application address book authorization) and SelectedDepartments (selected departments and all their sub-departments). A valid mode must be provided when explicitly submitting syncScope and is verified by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>SelectedDepartments</p>
         */
        @NameInMap("mode")
        public String mode;

        public static GetIdentityProviderResponseBodyDataSyncScope build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyDataSyncScope self = new GetIdentityProviderResponseBodyDataSyncScope();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyDataSyncScope setDepartmentIds(java.util.List<String> departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }
        public java.util.List<String> getDepartmentIds() {
            return this.departmentIds;
        }

        public GetIdentityProviderResponseBodyDataSyncScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class GetIdentityProviderResponseBodyData extends TeaModel {
        /**
         * <p>The actual SAML configuration is read back on demand only in GetIdentityProvider. SCIM queries and preparations return the actual received status and URLs.</p>
         */
        @NameInMap("configuration")
        public GetIdentityProviderResponseBodyDataConfiguration configuration;

        /**
         * <p>The creation time in UTC format based on RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The event subscription callback URL. You must configure this URL in the application of the external identity provider to receive organization change events. An empty string is returned when the user pool is not yet activated.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://auth.cn-hangzhou.agentteams.aliyuncs.com/roa/dingtalk/event/up-123456">http://auth.cn-hangzhou.agentteams.aliyuncs.com/roa/dingtalk/event/up-123456</a></p>
         */
        @NameInMap("eventSubscriptionCallbackUrl")
        public String eventSubscriptionCallbackUrl;

        /**
         * <p>The type of the external identity provider. Valid values: DingTalk and Feishu.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("identityProviderType")
        public String identityProviderType;

        /**
         * <p>The logon callback URL. You must configure this URL in the application of the external identity provider. An empty string is returned when the user pool is not yet activated.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://signin-cn-hangzhou.aliyunagentid.com/up-123456/dingtalk/callback">https://signin-cn-hangzhou.aliyunagentid.com/up-123456/dingtalk/callback</a></p>
         */
        @NameInMap("loginCallbackUrl")
        public String loginCallbackUrl;

        /**
         * <p>Indicates whether workspace users are allowed to log on through this external identity provider.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>The application configuration of the external identity provider. Application secret configurations are not returned.</p>
         */
        @NameInMap("metadata")
        public GetIdentityProviderResponseBodyDataMetadata metadata;

        /**
         * <p>The security summary of the expected configuration. It does not contain credentials. The original SAML fields and meanings are retained.</p>
         */
        @NameInMap("oidc")
        public GetIdentityProviderResponseBodyDataOidc oidc;

        /**
         * <p>The security summary queried in real time from AgentIdentity. It does not contain secrets, private keys, or JIT fields. It can be empty when it is not configured or during unbinding.</p>
         */
        @NameInMap("oidcConfiguration")
        public GetIdentityProviderResponseBodyDataOidcConfiguration oidcConfiguration;

        /**
         * <p>Currently, only SAML is supported. This parameter may not be returned when no valid configuration is saved. Placeholder initialization with OIDC is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The input supports either XML or complete manual entry. Queries return standardized configurations and do not echo the original XML. This parameter can be omitted when not configured.</p>
         */
        @NameInMap("saml")
        public GetIdentityProviderResponseBodyDataSaml saml;

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
         * <p>Indicates whether organization member synchronization is enabled. When enabled, organization members are synchronized as workspace users by this external identity provider.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        /**
         * <p>The synchronization scope defined by department. If omitted during creation, the default value is AllAuthorized, and the first vendor synchronization is determined by syncOnBind. If omitted or set to null during an update, the original value is retained. Updating and saving the scope does not automatically trigger a full synchronization.</p>
         */
        @NameInMap("syncScope")
        public GetIdentityProviderResponseBodyDataSyncScope syncScope;

        /**
         * <p>The time of the last modification in UTC format based on RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetIdentityProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyData self = new GetIdentityProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyData setConfiguration(GetIdentityProviderResponseBodyDataConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public GetIdentityProviderResponseBodyDataConfiguration getConfiguration() {
            return this.configuration;
        }

        public GetIdentityProviderResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetIdentityProviderResponseBodyData setEventSubscriptionCallbackUrl(String eventSubscriptionCallbackUrl) {
            this.eventSubscriptionCallbackUrl = eventSubscriptionCallbackUrl;
            return this;
        }
        public String getEventSubscriptionCallbackUrl() {
            return this.eventSubscriptionCallbackUrl;
        }

        public GetIdentityProviderResponseBodyData setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public GetIdentityProviderResponseBodyData setLoginCallbackUrl(String loginCallbackUrl) {
            this.loginCallbackUrl = loginCallbackUrl;
            return this;
        }
        public String getLoginCallbackUrl() {
            return this.loginCallbackUrl;
        }

        public GetIdentityProviderResponseBodyData setLoginEnabled(Boolean loginEnabled) {
            this.loginEnabled = loginEnabled;
            return this;
        }
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        public GetIdentityProviderResponseBodyData setMetadata(GetIdentityProviderResponseBodyDataMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public GetIdentityProviderResponseBodyDataMetadata getMetadata() {
            return this.metadata;
        }

        public GetIdentityProviderResponseBodyData setOidc(GetIdentityProviderResponseBodyDataOidc oidc) {
            this.oidc = oidc;
            return this;
        }
        public GetIdentityProviderResponseBodyDataOidc getOidc() {
            return this.oidc;
        }

        public GetIdentityProviderResponseBodyData setOidcConfiguration(GetIdentityProviderResponseBodyDataOidcConfiguration oidcConfiguration) {
            this.oidcConfiguration = oidcConfiguration;
            return this;
        }
        public GetIdentityProviderResponseBodyDataOidcConfiguration getOidcConfiguration() {
            return this.oidcConfiguration;
        }

        public GetIdentityProviderResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetIdentityProviderResponseBodyData setSaml(GetIdentityProviderResponseBodyDataSaml saml) {
            this.saml = saml;
            return this;
        }
        public GetIdentityProviderResponseBodyDataSaml getSaml() {
            return this.saml;
        }

        public GetIdentityProviderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetIdentityProviderResponseBodyData setSyncEnabled(Boolean syncEnabled) {
            this.syncEnabled = syncEnabled;
            return this;
        }
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        public GetIdentityProviderResponseBodyData setSyncScope(GetIdentityProviderResponseBodyDataSyncScope syncScope) {
            this.syncScope = syncScope;
            return this;
        }
        public GetIdentityProviderResponseBodyDataSyncScope getSyncScope() {
            return this.syncScope;
        }

        public GetIdentityProviderResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetIdentityProviderResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
