// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCredentialProvidersResponseBody extends TeaModel {
    /**
     * <p>The list of credential providers.</p>
     */
    @NameInMap("CredentialProviders")
    public java.util.List<ListCredentialProvidersResponseBodyCredentialProviders> credentialProviders;

    /**
     * <p>The number of entries per page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token returned by this call.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCredentialProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialProvidersResponseBody self = new ListCredentialProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCredentialProvidersResponseBody setCredentialProviders(java.util.List<ListCredentialProvidersResponseBodyCredentialProviders> credentialProviders) {
        this.credentialProviders = credentialProviders;
        return this;
    }
    public java.util.List<ListCredentialProvidersResponseBodyCredentialProviders> getCredentialProviders() {
        return this.credentialProviders;
    }

    public ListCredentialProvidersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCredentialProvidersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCredentialProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCredentialProvidersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigJwtProviderConfig extends TeaModel {
        /**
         * <p>The list of allowed JWT issuers.</p>
         */
        @NameInMap("AllowedTokenIssuers")
        public java.util.List<String> allowedTokenIssuers;

        /**
         * <p>Indicates whether the JWT-derived short token feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DerivedShortTokenEnabled")
        public Boolean derivedShortTokenEnabled;

        /**
         * <p>The validity period of the JWT, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("Expiration")
        public Integer expiration;

        /**
         * <p>Indicates whether JWT expiration cleanup is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExpirationCleanupEnabled")
        public Boolean expirationCleanupEnabled;

        /**
         * <p>JWT issuer。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.issuer.com">https://test.issuer.com</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The JWKS endpoint URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example123456.aliyunidaas.com/api/v2/auths_ngz2wj35ixxxdyat55nexxxxxx/oauth2/jwks">https://example123456.aliyunidaas.com/api/v2/auths_ngz2wj35ixxxdyat55nexxxxxx/oauth2/jwks</a></p>
         */
        @NameInMap("JwksEndpoint")
        public String jwksEndpoint;

        public static ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigJwtProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigJwtProviderConfig self = new ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigJwtProviderConfig();
            return TeaModel.build(map, self);
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigJwtProviderConfig setAllowedTokenIssuers(java.util.List<String> allowedTokenIssuers) {
            this.allowedTokenIssuers = allowedTokenIssuers;
            return this;
        }
        public java.util.List<String> getAllowedTokenIssuers() {
            return this.allowedTokenIssuers;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigJwtProviderConfig setDerivedShortTokenEnabled(Boolean derivedShortTokenEnabled) {
            this.derivedShortTokenEnabled = derivedShortTokenEnabled;
            return this;
        }
        public Boolean getDerivedShortTokenEnabled() {
            return this.derivedShortTokenEnabled;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigJwtProviderConfig setExpiration(Integer expiration) {
            this.expiration = expiration;
            return this;
        }
        public Integer getExpiration() {
            return this.expiration;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigJwtProviderConfig setExpirationCleanupEnabled(Boolean expirationCleanupEnabled) {
            this.expirationCleanupEnabled = expirationCleanupEnabled;
            return this;
        }
        public Boolean getExpirationCleanupEnabled() {
            return this.expirationCleanupEnabled;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigJwtProviderConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigJwtProviderConfig setJwksEndpoint(String jwksEndpoint) {
            this.jwksEndpoint = jwksEndpoint;
            return this;
        }
        public String getJwksEndpoint() {
            return this.jwksEndpoint;
        }

    }

    public static class ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig extends TeaModel {
        /**
         * <p>The authorization endpoint of the OAuth protocol.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/authorize">https://example.com/authorize</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The OAuth authorization flow type. Valid values:</p>
         * <ul>
         * <li>m2m: Machine-to-machine.</li>
         * <li>user_federation: User federation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m2m</p>
         */
        @NameInMap("AuthorizationFlow")
        public String authorizationFlow;

        /**
         * <p>The client_id in the OAuth protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>client_id_example_xxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The URL of the OAuth discovery document.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/.well-known/openid-configuration">https://example.com/.well-known/openid-configuration</a></p>
         */
        @NameInMap("DiscoveryUrl")
        public String discoveryUrl;

        /**
         * <p>The issuer endpoint of the OAuth protocol.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/issuer">https://example.com/issuer</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The algorithm used to compute the code challenge in PKCE. Valid values:</p>
         * <ul>
         * <li>S256</li>
         * <li>plain</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S256</p>
         */
        @NameInMap("PkceChallengeMethod")
        public String pkceChallengeMethod;

        /**
         * <p>Indicates whether PKCE is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PkceEnabled")
        public Boolean pkceEnabled;

        /**
         * <p>The OAuth provider vendor type. Valid values:</p>
         * <ul>
         * <li>custom: Custom.</li>
         * <li>dingtalk: DingTalk.</li>
         * <li>feishu: Lark.</li>
         * <li>github: GitHub.</li>
         * <li>microsoft: Microsoft.</li>
         * <li>google: Google.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("ProviderVendor")
        public String providerVendor;

        /**
         * <p>The scope in the OAuth protocol, which specifies the permission scope.</p>
         * <blockquote>
         * <p>The scope configured on the credential provider serves as the default value. If the scope parameter is not specified when calling the DeveloperAPI to obtain an OAuth access token, the scope configured on the credential provider is used for token issuance.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: Multiple scope values are separated by spaces.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example:test_01 example:test_02</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The system-generated redirect URI.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/callback">https://example.com/callback</a></p>
         */
        @NameInMap("SystemRedirectUri")
        public String systemRedirectUri;

        /**
         * <p>The token endpoint of the OAuth protocol.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/token">https://example.com/token</a></p>
         */
        @NameInMap("TokenEndpoint")
        public String tokenEndpoint;

        public static ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig self = new ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig();
            return TeaModel.build(map, self);
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig setAuthorizationFlow(String authorizationFlow) {
            this.authorizationFlow = authorizationFlow;
            return this;
        }
        public String getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig setDiscoveryUrl(String discoveryUrl) {
            this.discoveryUrl = discoveryUrl;
            return this;
        }
        public String getDiscoveryUrl() {
            return this.discoveryUrl;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig setPkceChallengeMethod(String pkceChallengeMethod) {
            this.pkceChallengeMethod = pkceChallengeMethod;
            return this;
        }
        public String getPkceChallengeMethod() {
            return this.pkceChallengeMethod;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig setPkceEnabled(Boolean pkceEnabled) {
            this.pkceEnabled = pkceEnabled;
            return this;
        }
        public Boolean getPkceEnabled() {
            return this.pkceEnabled;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig setProviderVendor(String providerVendor) {
            this.providerVendor = providerVendor;
            return this;
        }
        public String getProviderVendor() {
            return this.providerVendor;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig setSystemRedirectUri(String systemRedirectUri) {
            this.systemRedirectUri = systemRedirectUri;
            return this;
        }
        public String getSystemRedirectUri() {
            return this.systemRedirectUri;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

    }

    public static class ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfig extends TeaModel {
        /**
         * <p>The configuration of the JWT-type credential provider.</p>
         */
        @NameInMap("JwtProviderConfig")
        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigJwtProviderConfig jwtProviderConfig;

        /**
         * <p>The configuration of the OAuth-type credential provider.</p>
         */
        @NameInMap("OAuthProviderConfig")
        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig OAuthProviderConfig;

        /**
         * <p>The list of credential IDs that correspond to the sensitive configuration of the credential provider.</p>
         * <blockquote>
         * <p>The system securely stores the sensitive configuration of the credential provider as credentials.</p>
         * </blockquote>
         */
        @NameInMap("ProviderCredentialIds")
        public java.util.List<String> providerCredentialIds;

        public static ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfig self = new ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfig();
            return TeaModel.build(map, self);
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfig setJwtProviderConfig(ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigJwtProviderConfig jwtProviderConfig) {
            this.jwtProviderConfig = jwtProviderConfig;
            return this;
        }
        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigJwtProviderConfig getJwtProviderConfig() {
            return this.jwtProviderConfig;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfig setOAuthProviderConfig(ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig OAuthProviderConfig) {
            this.OAuthProviderConfig = OAuthProviderConfig;
            return this;
        }
        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfigOAuthProviderConfig getOAuthProviderConfig() {
            return this.OAuthProviderConfig;
        }

        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfig setProviderCredentialIds(java.util.List<String> providerCredentialIds) {
            this.providerCredentialIds = providerCredentialIds;
            return this;
        }
        public java.util.List<String> getProviderCredentialIds() {
            return this.providerCredentialIds;
        }

    }

    public static class ListCredentialProvidersResponseBodyCredentialProviders extends TeaModel {
        /**
         * <p>The time when the credential provider was created. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The configuration of the credential provider.</p>
         */
        @NameInMap("CredentialProviderConfig")
        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfig credentialProviderConfig;

        /**
         * <p>The creation type of the credential provider. Valid values:</p>
         * <ul>
         * <li>system_init: Created by the system.</li>
         * <li>user_custom: Created by the user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        @NameInMap("CredentialProviderCreationType")
        public String credentialProviderCreationType;

        /**
         * <p>The credential provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
         */
        @NameInMap("CredentialProviderId")
        public String credentialProviderId;

        /**
         * <p>The business identifier of the credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>test_example_identifier</p>
         */
        @NameInMap("CredentialProviderIdentifier")
        public String credentialProviderIdentifier;

        /**
         * <p>The name of the credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>test_example_name</p>
         */
        @NameInMap("CredentialProviderName")
        public String credentialProviderName;

        /**
         * <p>The credential provider type. Valid values:</p>
         * <ul>
         * <li>oauth: OAuth credential provider</li>
         * <li>jwt: JWT credential provider</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oauth</p>
         */
        @NameInMap("CredentialProviderType")
        public String credentialProviderType;

        /**
         * <p>The description of the credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>This is an example description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The credential provider status. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the credential provider was last updated. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListCredentialProvidersResponseBodyCredentialProviders build(java.util.Map<String, ?> map) throws Exception {
            ListCredentialProvidersResponseBodyCredentialProviders self = new ListCredentialProvidersResponseBodyCredentialProviders();
            return TeaModel.build(map, self);
        }

        public ListCredentialProvidersResponseBodyCredentialProviders setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCredentialProvidersResponseBodyCredentialProviders setCredentialProviderConfig(ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfig credentialProviderConfig) {
            this.credentialProviderConfig = credentialProviderConfig;
            return this;
        }
        public ListCredentialProvidersResponseBodyCredentialProvidersCredentialProviderConfig getCredentialProviderConfig() {
            return this.credentialProviderConfig;
        }

        public ListCredentialProvidersResponseBodyCredentialProviders setCredentialProviderCreationType(String credentialProviderCreationType) {
            this.credentialProviderCreationType = credentialProviderCreationType;
            return this;
        }
        public String getCredentialProviderCreationType() {
            return this.credentialProviderCreationType;
        }

        public ListCredentialProvidersResponseBodyCredentialProviders setCredentialProviderId(String credentialProviderId) {
            this.credentialProviderId = credentialProviderId;
            return this;
        }
        public String getCredentialProviderId() {
            return this.credentialProviderId;
        }

        public ListCredentialProvidersResponseBodyCredentialProviders setCredentialProviderIdentifier(String credentialProviderIdentifier) {
            this.credentialProviderIdentifier = credentialProviderIdentifier;
            return this;
        }
        public String getCredentialProviderIdentifier() {
            return this.credentialProviderIdentifier;
        }

        public ListCredentialProvidersResponseBodyCredentialProviders setCredentialProviderName(String credentialProviderName) {
            this.credentialProviderName = credentialProviderName;
            return this;
        }
        public String getCredentialProviderName() {
            return this.credentialProviderName;
        }

        public ListCredentialProvidersResponseBodyCredentialProviders setCredentialProviderType(String credentialProviderType) {
            this.credentialProviderType = credentialProviderType;
            return this;
        }
        public String getCredentialProviderType() {
            return this.credentialProviderType;
        }

        public ListCredentialProvidersResponseBodyCredentialProviders setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCredentialProvidersResponseBodyCredentialProviders setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCredentialProvidersResponseBodyCredentialProviders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCredentialProvidersResponseBodyCredentialProviders setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
