// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListIdentityProvidersResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of external identity providers.</p>
     */
    @NameInMap("items")
    public java.util.List<ListIdentityProvidersResponseBodyItems> items;

    /**
     * <p>The maximum number of records per page for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message. Returns an error description when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The token for the next page. Empty if there is no next page.</p>
     * 
     * <strong>example:</strong>
     * <p>aWRlbnRpdHktcHJvdmlkZXItb2Zmc2V0OjEw</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

    /**
     * <p>The total number of external identity providers that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListIdentityProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProvidersResponseBody self = new ListIdentityProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIdentityProvidersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIdentityProvidersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIdentityProvidersResponseBody setItems(java.util.List<ListIdentityProvidersResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListIdentityProvidersResponseBodyItems> getItems() {
        return this.items;
    }

    public ListIdentityProvidersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIdentityProvidersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIdentityProvidersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIdentityProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIdentityProvidersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListIdentityProvidersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIdentityProvidersResponseBodyItemsConfiguration extends TeaModel {
        /**
         * <p>The SAML binding type, such as HTTP-Redirect or HTTP-POST. This parameter is required for manual configuration. The query returns the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>Required when manually filled in. It must be non-empty and no more than 2048 characters. Existing configurations do not support replacement. It is different from our Entity ID queried by the SP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>Required when manually filled in. It must be an absolute HTTPS URL without user credentials and fragments.</p>
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

        public static ListIdentityProvidersResponseBodyItemsConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProvidersResponseBodyItemsConfiguration self = new ListIdentityProvidersResponseBodyItemsConfiguration();
            return TeaModel.build(map, self);
        }

        public ListIdentityProvidersResponseBodyItemsConfiguration setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public ListIdentityProvidersResponseBodyItemsConfiguration setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListIdentityProvidersResponseBodyItemsConfiguration setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public ListIdentityProvidersResponseBodyItemsConfiguration setSsoStatus(String ssoStatus) {
            this.ssoStatus = ssoStatus;
            return this;
        }
        public String getSsoStatus() {
            return this.ssoStatus;
        }

    }

    public static class ListIdentityProvidersResponseBodyItemsMetadata extends TeaModel {
        /**
         * <p>The App ID of the Lark application. Required when the binding type is Feishu.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_exampleappid01</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The AppKey of the DingTalk application. Required when the binding type is DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>dingexampleappkey01</p>
         */
        @NameInMap("appKey")
        public String appKey;

        /**
         * <p>The SAML Binding URI in the historical metadata snapshot. Use saml.bindingType for CustomSSO updates.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect</p>
         */
        @NameInMap("binding")
        public String binding;

        /**
         * <p>The certificate string in the historical metadata snapshot. Use saml.x509Certificates to edit the configuration, and do not submit the old metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>MIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQELBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoXDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8oGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYNW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbYEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Okkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0EBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUWld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImcaWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTqP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjocJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdVjfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5</p>
         */
        @NameInMap("certificates")
        public String certificates;

        /**
         * <p>The CorpId of the DingTalk enterprise. Required when the binding type is DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>dingexamplecorpid01</p>
         */
        @NameInMap("corpId")
        public String corpId;

        /**
         * <p>Required when manually filled in. It must be non-empty and no more than 2048 characters. Existing configurations do not support replacement. It is different from our Entity ID queried by the SP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>Required when manually filled in. It must be an absolute HTTPS URL without user credentials and fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        public static ListIdentityProvidersResponseBodyItemsMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProvidersResponseBodyItemsMetadata self = new ListIdentityProvidersResponseBodyItemsMetadata();
            return TeaModel.build(map, self);
        }

        public ListIdentityProvidersResponseBodyItemsMetadata setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListIdentityProvidersResponseBodyItemsMetadata setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListIdentityProvidersResponseBodyItemsMetadata setBinding(String binding) {
            this.binding = binding;
            return this;
        }
        public String getBinding() {
            return this.binding;
        }

        public ListIdentityProvidersResponseBodyItemsMetadata setCertificates(String certificates) {
            this.certificates = certificates;
            return this;
        }
        public String getCertificates() {
            return this.certificates;
        }

        public ListIdentityProvidersResponseBodyItemsMetadata setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListIdentityProvidersResponseBodyItemsMetadata setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListIdentityProvidersResponseBodyItemsMetadata setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

    }

    public static class ListIdentityProvidersResponseBodyItemsOidc extends TeaModel {
        /**
         * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/authorize">https://idp.example.com/authorize</a></p>
         */
        @NameInMap("authorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The client authentication method. Default value: client_secret_post. If the value is none, PKCE must be enabled.</p>
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
         * <p>The absolute HTTPS discovery endpoint. This parameter is mutually exclusive with manually specified endpoints.</p>
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
         * <p>Specifies whether PKCE is enabled. Default value: true. This parameter must be set to true when no client authentication is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("pkceRequired")
        public Boolean pkceRequired;

        /**
         * <p>The array of scopes. The array must contain openid. Default values: openid, profile, and email.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;openid&quot;,&quot;profile&quot;,&quot;email&quot;]</p>
         */
        @NameInMap("scopes")
        public java.util.List<String> scopes;

        /**
         * <p>The claim name in the ID token used to match the SCIM externalId. If omitted during initial configuration, the default value sub is used. If omitted during an update, the saved value is retained. For Azure, you can enter oid. The value must be non-empty and cannot contain whitespace characters. In query results, oidc returns the saved value, and oidcConfiguration returns the actual upstream value, which may be empty.</p>
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

        public static ListIdentityProvidersResponseBodyItemsOidc build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProvidersResponseBodyItemsOidc self = new ListIdentityProvidersResponseBodyItemsOidc();
            return TeaModel.build(map, self);
        }

        public ListIdentityProvidersResponseBodyItemsOidc setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public ListIdentityProvidersResponseBodyItemsOidc setClientAuthMethod(String clientAuthMethod) {
            this.clientAuthMethod = clientAuthMethod;
            return this;
        }
        public String getClientAuthMethod() {
            return this.clientAuthMethod;
        }

        public ListIdentityProvidersResponseBodyItemsOidc setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListIdentityProvidersResponseBodyItemsOidc setDiscoveryEndpoint(String discoveryEndpoint) {
            this.discoveryEndpoint = discoveryEndpoint;
            return this;
        }
        public String getDiscoveryEndpoint() {
            return this.discoveryEndpoint;
        }

        public ListIdentityProvidersResponseBodyItemsOidc setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListIdentityProvidersResponseBodyItemsOidc setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public ListIdentityProvidersResponseBodyItemsOidc setPkceRequired(Boolean pkceRequired) {
            this.pkceRequired = pkceRequired;
            return this;
        }
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        public ListIdentityProvidersResponseBodyItemsOidc setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public ListIdentityProvidersResponseBodyItemsOidc setSsoMappingClaim(String ssoMappingClaim) {
            this.ssoMappingClaim = ssoMappingClaim;
            return this;
        }
        public String getSsoMappingClaim() {
            return this.ssoMappingClaim;
        }

        public ListIdentityProvidersResponseBodyItemsOidc setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public ListIdentityProvidersResponseBodyItemsOidc setUserinfoEndpoint(String userinfoEndpoint) {
            this.userinfoEndpoint = userinfoEndpoint;
            return this;
        }
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

    }

    public static class ListIdentityProvidersResponseBodyItemsSaml extends TeaModel {
        /**
         * <p>The SAML binding type, such as HTTP-Redirect or HTTP-POST. This parameter is required for manual configuration. The query returns the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>Required when manually filled in. It must be non-empty and no more than 2048 characters. Existing configurations do not support replacement. It is different from our Entity ID queried by the SP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>Required when manually filled in. It must be an absolute HTTPS URL without user credentials and fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The list of IdP signing certificates. A non-empty array is required for manual configuration. Use PEM X.509 certificate text. The system validates the current validity period. A maximum of two unique certificates are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;-----BEGIN CERTIFICATE-----\\nMIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQEL\\nBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoX\\nDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjAN\\nBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8\\noGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYN\\nW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbY\\nEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Ok\\nkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0E\\nBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQAB\\nMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUW\\nld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImca\\nWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTq\\nP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjoc\\nJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdV\\njfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5\\n-----END CERTIFICATE-----&quot;]</p>
         */
        @NameInMap("x509Certificates")
        public java.util.List<String> x509Certificates;

        public static ListIdentityProvidersResponseBodyItemsSaml build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProvidersResponseBodyItemsSaml self = new ListIdentityProvidersResponseBodyItemsSaml();
            return TeaModel.build(map, self);
        }

        public ListIdentityProvidersResponseBodyItemsSaml setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public ListIdentityProvidersResponseBodyItemsSaml setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListIdentityProvidersResponseBodyItemsSaml setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public ListIdentityProvidersResponseBodyItemsSaml setX509Certificates(java.util.List<String> x509Certificates) {
            this.x509Certificates = x509Certificates;
            return this;
        }
        public java.util.List<String> getX509Certificates() {
            return this.x509Certificates;
        }

    }

    public static class ListIdentityProvidersResponseBodyItemsSyncScope extends TeaModel {
        /**
         * <p>When set to SelectedDepartments, it must contain at least one non-empty department ID, which should be obtained from ListIdentityProviderDepartments. When set to AllAuthorized, pass an empty array or omit this field.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10001&quot;]</p>
         */
        @NameInMap("departmentIds")
        public java.util.List<String> departmentIds;

        /**
         * <p>AllAuthorized: the full authorized scope, limited by the application address book authorization. SelectedDepartments: the selected departments and all their sub-departments. A valid mode must be provided and verified by the backend when explicitly submitting syncScope.</p>
         * 
         * <strong>example:</strong>
         * <p>SelectedDepartments</p>
         */
        @NameInMap("mode")
        public String mode;

        public static ListIdentityProvidersResponseBodyItemsSyncScope build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProvidersResponseBodyItemsSyncScope self = new ListIdentityProvidersResponseBodyItemsSyncScope();
            return TeaModel.build(map, self);
        }

        public ListIdentityProvidersResponseBodyItemsSyncScope setDepartmentIds(java.util.List<String> departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }
        public java.util.List<String> getDepartmentIds() {
            return this.departmentIds;
        }

        public ListIdentityProvidersResponseBodyItemsSyncScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class ListIdentityProvidersResponseBodyItems extends TeaModel {
        /**
         * <p>The actual upstream configuration. The actual SAML configuration is read on demand only in GetIdentityProvider. SCIM queries and preparations return the actual receiving status and URL.</p>
         */
        @NameInMap("configuration")
        public ListIdentityProvidersResponseBodyItemsConfiguration configuration;

        /**
         * <p>The creation time in UTC format based on RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The event subscription callback URL. You must configure this URL in the application of the external identity provider to receive organization change events. An empty string is returned when the user pool is not activated.</p>
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
         * <p>The logon callback URL. You must configure this URL in the application of the external identity provider. An empty string is returned when the user pool is not activated.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://signin-cn-hangzhou.aliyunagentid.com/up-123456/dingtalk/callback">https://signin-cn-hangzhou.aliyunagentid.com/up-123456/dingtalk/callback</a></p>
         */
        @NameInMap("loginCallbackUrl")
        public String loginCallbackUrl;

        /**
         * <p>Specifies whether workspace users are allowed to log on through this external identity provider.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>The application configuration of the external identity provider. Application secret configurations are not returned.</p>
         */
        @NameInMap("metadata")
        public ListIdentityProvidersResponseBodyItemsMetadata metadata;

        /**
         * <p>The security summary of the expected configuration. It does not contain credentials. The original SAML fields and meanings are retained.</p>
         */
        @NameInMap("oidc")
        public ListIdentityProvidersResponseBodyItemsOidc oidc;

        /**
         * <p>Currently, only SAML is supported. It may not be returned when no valid configuration is saved. OIDC placeholder initialization is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The input supports either XML or complete manual entry. The query returns the standardized configuration and does not echo the original XML. It can be omitted when not configured.</p>
         */
        @NameInMap("saml")
        public ListIdentityProvidersResponseBodyItemsSaml saml;

        /**
         * <p>The binding status. Valid values: CONFIGURED (the configuration is accepted, waiting for the user pool to be activated), SYNCING (synchronizing organization members), SYNCED (organization member synchronization is completed), READY (the binding is in effect), SYNC_FAILED (organization member synchronization failed), UPDATING (updating the configuration), UPDATE_FAILED (configuration update failed), DISCONNECTING (disconnecting), and DISCONNECT_FAILED (disconnection failed).</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Specifies whether organization member synchronization is enabled. When enabled, organization members are synchronized as workspace users from this external identity provider.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        /**
         * <p>Follows the department-based sync scope definition. If omitted during creation, it defaults to AllAuthorized, and the first vendor sync is determined by syncOnBind. If omitted or null during an update, the original value is retained. Updating and saving the scope does not automatically trigger a full sync.</p>
         */
        @NameInMap("syncScope")
        public ListIdentityProvidersResponseBodyItemsSyncScope syncScope;

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

        public static ListIdentityProvidersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProvidersResponseBodyItems self = new ListIdentityProvidersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListIdentityProvidersResponseBodyItems setConfiguration(ListIdentityProvidersResponseBodyItemsConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public ListIdentityProvidersResponseBodyItemsConfiguration getConfiguration() {
            return this.configuration;
        }

        public ListIdentityProvidersResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListIdentityProvidersResponseBodyItems setEventSubscriptionCallbackUrl(String eventSubscriptionCallbackUrl) {
            this.eventSubscriptionCallbackUrl = eventSubscriptionCallbackUrl;
            return this;
        }
        public String getEventSubscriptionCallbackUrl() {
            return this.eventSubscriptionCallbackUrl;
        }

        public ListIdentityProvidersResponseBodyItems setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public ListIdentityProvidersResponseBodyItems setLoginCallbackUrl(String loginCallbackUrl) {
            this.loginCallbackUrl = loginCallbackUrl;
            return this;
        }
        public String getLoginCallbackUrl() {
            return this.loginCallbackUrl;
        }

        public ListIdentityProvidersResponseBodyItems setLoginEnabled(Boolean loginEnabled) {
            this.loginEnabled = loginEnabled;
            return this;
        }
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        public ListIdentityProvidersResponseBodyItems setMetadata(ListIdentityProvidersResponseBodyItemsMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public ListIdentityProvidersResponseBodyItemsMetadata getMetadata() {
            return this.metadata;
        }

        public ListIdentityProvidersResponseBodyItems setOidc(ListIdentityProvidersResponseBodyItemsOidc oidc) {
            this.oidc = oidc;
            return this;
        }
        public ListIdentityProvidersResponseBodyItemsOidc getOidc() {
            return this.oidc;
        }

        public ListIdentityProvidersResponseBodyItems setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListIdentityProvidersResponseBodyItems setSaml(ListIdentityProvidersResponseBodyItemsSaml saml) {
            this.saml = saml;
            return this;
        }
        public ListIdentityProvidersResponseBodyItemsSaml getSaml() {
            return this.saml;
        }

        public ListIdentityProvidersResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIdentityProvidersResponseBodyItems setSyncEnabled(Boolean syncEnabled) {
            this.syncEnabled = syncEnabled;
            return this;
        }
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        public ListIdentityProvidersResponseBodyItems setSyncScope(ListIdentityProvidersResponseBodyItemsSyncScope syncScope) {
            this.syncScope = syncScope;
            return this;
        }
        public ListIdentityProvidersResponseBodyItemsSyncScope getSyncScope() {
            return this.syncScope;
        }

        public ListIdentityProvidersResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListIdentityProvidersResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
