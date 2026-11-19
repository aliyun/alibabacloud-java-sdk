// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderSCIMResponseBody extends TeaModel {
    /**
     * <p>The business result code. If the request fails, use this code in combination with the HTTP status code and the result message for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data object. Retains the original fields and the meaning of the status field. The new scimStatus field corresponds to the data.status field in the query API operation, and the operationStatus field retains the status of the most recent SCIM task.</p>
     */
    @NameInMap("data")
    public UpdateIdentityProviderSCIMResponseBodyData data;

    /**
     * <p>The HTTP status code. Indicates the processing status of the current request, which does not necessarily reflect the final result of the background task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The result message. Indicates whether the request is accepted or returns an error message. For an asynchronous task, check the task result by calling the corresponding query API operation.</p>
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
     * <p>Indicates whether the current request is successful. A value of true indicates that the request is processed successfully. For asynchronous write operations, you must continue to query the task result.</p>
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
         * <p>The SAML binding type. Valid values: HTTP-Redirect and HTTP-POST. This field is required when you manually enter the configuration. The query returns the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>The IdP entity ID. This field is required when you manually enter the metadata. It must be a non-empty string of up to 2,048 characters. You cannot change the entity ID after it is configured. This ID is different from the local entity ID returned by the SP query.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>The IdP SSO logon URL. This field is required when you manually enter the metadata. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The actual SSO logon status of AgentIdentity. The actual switch value is Enabled or Disabled, which is not equivalent to the expected value of loginEnabled saved in the access configuration.</p>
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
         * <p>The SAML binding URI in the historical metadata snapshot. To update CustomSSO, use the saml.bindingType field.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect</p>
         */
        @NameInMap("binding")
        public String binding;

        /**
         * <p>The certificate string in the historical metadata snapshot. To edit the configuration, use the saml.x509Certificates field instead of submitting the old metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>MIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQELBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoXDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8oGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYNW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbYEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Okkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0EBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUWld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImcaWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTqP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjocJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdVjfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5</p>
         */
        @NameInMap("certificates")
        public String certificates;

        /**
         * <p>The IdP entity ID. This field is required when you manually enter the metadata. It must be a non-empty string of up to 2,048 characters. You cannot change the entity ID after it is configured. This ID is different from the local entity ID returned by the SP query.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>The IdP SSO logon URL. This field is required when you manually enter the metadata. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
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

    public static class UpdateIdentityProviderSCIMResponseBodyDataOidc extends TeaModel {
        /**
         * <p>The authorization endpoint. This field is required in manual mode and must be an absolute HTTPS URL. Do not specify this field in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/authorize">https://idp.example.com/authorize</a></p>
         */
        @NameInMap("authorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The client authentication method. Default value: client_secret_post. If the value is none, Proof Key for Code Exchange (PKCE) must be enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>client_secret_post</p>
         */
        @NameInMap("clientAuthMethod")
        public String clientAuthMethod;

        /**
         * <p>The client ID registered in the external IdP. This ID is different from the Matrix client ID. You cannot change the client ID in place after it is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>example-client</p>
         */
        @NameInMap("clientId")
        public String clientId;

        /**
         * <p>The absolute HTTPS OIDC discovery endpoint. This field is mutually exclusive with manually entered endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/.well-known/openid-configuration">https://idp.example.com/.well-known/openid-configuration</a></p>
         */
        @NameInMap("discoveryEndpoint")
        public String discoveryEndpoint;

        /**
         * <p>The absolute HTTPS issuer of the external IdP. You cannot change the issuer in place after it is configured.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com">https://idp.example.com</a></p>
         */
        @NameInMap("issuer")
        public String issuer;

        /**
         * <p>The authorization endpoint. This field is required in manual mode and must be an absolute HTTPS URL. Do not specify this field in discovery mode.</p>
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
         * <p>The array of strings that must contain openid. Default values: openid, profile, and email.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;openid&quot;,&quot;profile&quot;,&quot;email&quot;]</p>
         */
        @NameInMap("scopes")
        public java.util.List<String> scopes;

        /**
         * <p>The name of the claim in the ID token that is used to match the SCIM externalId. If omitted during creation, the default value sub is used. If omitted during an update, the saved value is retained. For Azure, you can specify oid. The value must be non-empty and cannot contain whitespace characters. When querying oidc, the saved value is returned. When querying oidcConfiguration, the actual upstream value is returned, which may be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>oid</p>
         */
        @NameInMap("ssoMappingClaim")
        public String ssoMappingClaim;

        /**
         * <p>The authorization endpoint. This field is required in manual mode and must be an absolute HTTPS URL. Do not specify this field in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/token">https://idp.example.com/token</a></p>
         */
        @NameInMap("tokenEndpoint")
        public String tokenEndpoint;

        /**
         * <p>The optional absolute HTTPS URL for manual mode. Leave this field empty in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/userinfo">https://idp.example.com/userinfo</a></p>
         */
        @NameInMap("userinfoEndpoint")
        public String userinfoEndpoint;

        public static UpdateIdentityProviderSCIMResponseBodyDataOidc build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderSCIMResponseBodyDataOidc self = new UpdateIdentityProviderSCIMResponseBodyDataOidc();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderSCIMResponseBodyDataOidc setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataOidc setClientAuthMethod(String clientAuthMethod) {
            this.clientAuthMethod = clientAuthMethod;
            return this;
        }
        public String getClientAuthMethod() {
            return this.clientAuthMethod;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataOidc setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataOidc setDiscoveryEndpoint(String discoveryEndpoint) {
            this.discoveryEndpoint = discoveryEndpoint;
            return this;
        }
        public String getDiscoveryEndpoint() {
            return this.discoveryEndpoint;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataOidc setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataOidc setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataOidc setPkceRequired(Boolean pkceRequired) {
            this.pkceRequired = pkceRequired;
            return this;
        }
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataOidc setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataOidc setSsoMappingClaim(String ssoMappingClaim) {
            this.ssoMappingClaim = ssoMappingClaim;
            return this;
        }
        public String getSsoMappingClaim() {
            return this.ssoMappingClaim;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataOidc setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public UpdateIdentityProviderSCIMResponseBodyDataOidc setUserinfoEndpoint(String userinfoEndpoint) {
            this.userinfoEndpoint = userinfoEndpoint;
            return this;
        }
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

    }

    public static class UpdateIdentityProviderSCIMResponseBodyDataSaml extends TeaModel {
        /**
         * <p>The SAML binding type. Valid values: HTTP-Redirect and HTTP-POST. This field is required when you manually enter the configuration. The query returns the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>The IdP entity ID. This field is required when you manually enter the metadata. It must be a non-empty string of up to 2,048 characters. You cannot change the entity ID after it is configured. This ID is different from the local entity ID returned by the SP query.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>The IdP SSO logon URL. This field is required when you manually enter the metadata. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The list of IdP signing certificates. When you manually enter the configuration, this field is required and must be a non-empty array of PEM X.509 certificate texts. The system verifies the current validity period. A maximum of two certificates are retained after deduplication.</p>
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
         * <p>The actual upstream configuration. The actual SAML configuration is read back on demand only by the GetIdentityProvider API operation. The SCIM query and preparation operations return the actual receiving status and URL.</p>
         */
        @NameInMap("configuration")
        public UpdateIdentityProviderSCIMResponseBodyDataConfiguration configuration;

        /**
         * <p>The time when the record was created on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-26T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The SAML vendor event callback URL. For CustomSSO, an empty string is returned. To obtain the SCIM receiving URL, call the SCIM query or preparation API operation. The example shows a JSON empty string &quot;&quot;, but the actual value does not include double quotation marks.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("eventSubscriptionCallbackUrl")
        public String eventSubscriptionCallbackUrl;

        /**
         * <p>The identity provider type. General CRUD operations support DingTalk, Feishu, and CustomSSO. SP queries support only CustomSSO. The SCIM path uses the CustomSSO shared pool.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomSSO</p>
         */
        @NameInMap("identityProviderType")
        public String identityProviderType;

        /**
         * <p>The SAML vendor callback URL. For CustomSSO, an empty string is returned. To obtain the Assertion Consumer Service (ACS) URL for SAML, call the SP query API operation. The example shows a JSON empty string &quot;&quot;, but the actual value does not include double quotation marks.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("loginCallbackUrl")
        public String loginCallbackUrl;

        /**
         * <p>Specifies whether logon is enabled. Do not set this parameter to true during CustomSSO initialization. You must save a valid SAML configuration before enabling logon. Disabling logon does not delete the configuration. If an asynchronous task fails, this expected value does not indicate that the change has taken effect on the upstream server.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>The standard identity provider (IdP) metadata. Vendor parameters are used for DingTalk and Feishu. To update CustomSSO, use the protocol and saml fields. This field is not accepted for CustomSSO updates. The return value does not include vendor keys.</p>
         */
        @NameInMap("metadata")
        public UpdateIdentityProviderSCIMResponseBodyDataMetadata metadata;

        /**
         * <p>The security summary of the expected OIDC configuration. This summary does not include credentials. The original SAML fields and their meanings are retained.</p>
         */
        @NameInMap("oidc")
        public UpdateIdentityProviderSCIMResponseBodyDataOidc oidc;

        /**
         * <p>The original status of the most recent independent SCIM operation task. If no historical tasks exist, an empty string (&quot;&quot;) is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("operationStatus")
        public String operationStatus;

        /**
         * <p>The logon protocol. Only SAML is supported. This field may not be returned if no valid configuration is saved. You cannot use OIDC as a placeholder for initialization.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The SAML logon configuration. You can provide the input by using XML or by manually entering all fields. The query returns the standardized configuration and does not echo the original XML. This field can be omitted if it is not configured.</p>
         */
        @NameInMap("saml")
        public UpdateIdentityProviderSCIMResponseBodyDataSaml saml;

        /**
         * <p>The independent SCIM status. This field does not change the meaning of the original status field for shared resources and logon configurations. It corresponds to the data.status field in the query API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATING</p>
         */
        @NameInMap("scimStatus")
        public String scimStatus;

        /**
         * <p>The operation status of the CustomSSO user pool lifecycle and logon configuration tasks. This status does not indicate the result of SCIM operations. To query the result of the SCIM switch, use the GetIdentityProviderSCIM.operationStatus field. You cannot use this field to determine whether all protocols are configured.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Specifies whether to enable SCIM synchronization. Do not set this parameter to true during CustomSSO initialization. You can only update this parameter later by calling UpdateIdentityProviderSCIM. Determine the result based on the operationStatus field.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        /**
         * <p>The time when the record was last updated on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-26T00:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>Required. The ID of the destination workspace. The region of the request must be the same as the region of the destination workspace.</p>
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

        public UpdateIdentityProviderSCIMResponseBodyData setOidc(UpdateIdentityProviderSCIMResponseBodyDataOidc oidc) {
            this.oidc = oidc;
            return this;
        }
        public UpdateIdentityProviderSCIMResponseBodyDataOidc getOidc() {
            return this.oidc;
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
