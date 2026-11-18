// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCredentialProviderRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate a parameter value on your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length. For more information, see References: <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The credential provider configuration.</p>
     */
    @NameInMap("CredentialProviderConfig")
    public CreateCredentialProviderRequestCredentialProviderConfig credentialProviderConfig;

    /**
     * <p>The credential provider identifier.</p>
     * <blockquote>
     * <p>Valid characters: uppercase and lowercase letters, digits, and the following special characters: <code>.-_</code>. The identifier can be up to 64 characters in length.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_example_identifier</p>
     */
    @NameInMap("CredentialProviderIdentifier")
    public String credentialProviderIdentifier;

    /**
     * <p>The credential provider name.</p>
     * <blockquote>
     * <p>The name can be up to 64 characters in length.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oauth</p>
     */
    @NameInMap("CredentialProviderType")
    public String credentialProviderType;

    /**
     * <p>The description.</p>
     * <blockquote>
     * <p>The description can be up to 128 characters in length.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>This is an example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateCredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialProviderRequest self = new CreateCredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateCredentialProviderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCredentialProviderRequest setCredentialProviderConfig(CreateCredentialProviderRequestCredentialProviderConfig credentialProviderConfig) {
        this.credentialProviderConfig = credentialProviderConfig;
        return this;
    }
    public CreateCredentialProviderRequestCredentialProviderConfig getCredentialProviderConfig() {
        return this.credentialProviderConfig;
    }

    public CreateCredentialProviderRequest setCredentialProviderIdentifier(String credentialProviderIdentifier) {
        this.credentialProviderIdentifier = credentialProviderIdentifier;
        return this;
    }
    public String getCredentialProviderIdentifier() {
        return this.credentialProviderIdentifier;
    }

    public CreateCredentialProviderRequest setCredentialProviderName(String credentialProviderName) {
        this.credentialProviderName = credentialProviderName;
        return this;
    }
    public String getCredentialProviderName() {
        return this.credentialProviderName;
    }

    public CreateCredentialProviderRequest setCredentialProviderType(String credentialProviderType) {
        this.credentialProviderType = credentialProviderType;
        return this;
    }
    public String getCredentialProviderType() {
        return this.credentialProviderType;
    }

    public CreateCredentialProviderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCredentialProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class CreateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig extends TeaModel {
        /**
         * <p>The list of allowed JWT issuers.</p>
         * <blockquote>
         * <p>The list can contain up to 200 items.</p>
         * </blockquote>
         */
        @NameInMap("AllowedTokenIssuers")
        public java.util.List<String> allowedTokenIssuers;

        /**
         * <p>Specifies whether to enable the capability to derive short tokens from JWTs.</p>
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
         * <p>Specifies whether to enable cleanup of expired JWTs.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExpirationCleanupEnabled")
        public Boolean expirationCleanupEnabled;

        public static CreateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig self = new CreateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig();
            return TeaModel.build(map, self);
        }

        public CreateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig setAllowedTokenIssuers(java.util.List<String> allowedTokenIssuers) {
            this.allowedTokenIssuers = allowedTokenIssuers;
            return this;
        }
        public java.util.List<String> getAllowedTokenIssuers() {
            return this.allowedTokenIssuers;
        }

        public CreateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig setDerivedShortTokenEnabled(Boolean derivedShortTokenEnabled) {
            this.derivedShortTokenEnabled = derivedShortTokenEnabled;
            return this;
        }
        public Boolean getDerivedShortTokenEnabled() {
            return this.derivedShortTokenEnabled;
        }

        public CreateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig setExpiration(Integer expiration) {
            this.expiration = expiration;
            return this;
        }
        public Integer getExpiration() {
            return this.expiration;
        }

        public CreateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig setExpirationCleanupEnabled(Boolean expirationCleanupEnabled) {
            this.expirationCleanupEnabled = expirationCleanupEnabled;
            return this;
        }
        public Boolean getExpirationCleanupEnabled() {
            return this.expirationCleanupEnabled;
        }

    }

    public static class CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig extends TeaModel {
        /**
         * <p>The authorization endpoint in the OAuth protocol.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/authorize">https://example.com/authorize</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The OAuth authorization flow type. Valid values:</p>
         * <ul>
         * <li>m2m: Machine-to-machine</li>
         * <li>user_federation: User federation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m2m</p>
         */
        @NameInMap("AuthorizationFlow")
        public String authorizationFlow;

        /**
         * <p>The client ID in the OAuth protocol.</p>
         * <blockquote>
         * <p>The client ID can be up to 128 characters in length.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client_id_example_xxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The client secret in the OAuth protocol.</p>
         * <blockquote>
         * <p>The client secret can be up to 1,024 characters in length.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client_secret_example_xxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>The URL of the OAuth discovery document.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/.well-known/openid-configuration">https://example.com/.well-known/openid-configuration</a></p>
         */
        @NameInMap("DiscoveryUrl")
        public String discoveryUrl;

        /**
         * <p>The issuer endpoint in the OAuth protocol.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/issuer">https://example.com/issuer</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The algorithm used to calculate the code challenge in PKCE. Valid values:</p>
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
         * <p>Specifies whether to enable Proof Key for Code Exchange (PKCE).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PkceEnabled")
        public Boolean pkceEnabled;

        /**
         * <p>The OAuth provider vendor type. Valid values:</p>
         * <ul>
         * <li>custom: Custom</li>
         * <li>dingtalk: DingTalk</li>
         * <li>feishu: Lark</li>
         * <li>github: GitHub</li>
         * <li>microsoft: Microsoft</li>
         * <li>google: Google</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("ProviderVendor")
        public String providerVendor;

        /**
         * <p>The scope in the OAuth protocol.</p>
         * <blockquote>
         * <p>The scope configuration of the OAuth credential provider serves as a fallback value. If the scope parameter is not specified when you call the Developer API to obtain an OAuth access token, the scope configuration of the credential provider is used to issue the token.
         * Notice: Separate multiple scope values with spaces.</notice>
         * Limits on a single scope value:</p>
         * </blockquote>
         * <ol>
         * <li>Valid characters: lowercase letters, digits, and the following special characters: <code>|/:_-.</code>.</li>
         * <li>The value must contain lowercase letters or digits.</li>
         * <li>The value must start with a period (<code>.</code>), a lowercase letter, or a digit.</li>
         * <li>The value can be up to 1,024 characters in length.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>example:test_01 example:test_02</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The token endpoint in the OAuth protocol.</p>
         * <blockquote>
         * <p>The endpoint must start with <code>http://</code> or <code>https://</code> and can be up to 1,024 characters in length.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/token">https://example.com/token</a></p>
         */
        @NameInMap("TokenEndpoint")
        public String tokenEndpoint;

        public static CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig self = new CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig();
            return TeaModel.build(map, self);
        }

        public CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setAuthorizationFlow(String authorizationFlow) {
            this.authorizationFlow = authorizationFlow;
            return this;
        }
        public String getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        public CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setDiscoveryUrl(String discoveryUrl) {
            this.discoveryUrl = discoveryUrl;
            return this;
        }
        public String getDiscoveryUrl() {
            return this.discoveryUrl;
        }

        public CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setPkceChallengeMethod(String pkceChallengeMethod) {
            this.pkceChallengeMethod = pkceChallengeMethod;
            return this;
        }
        public String getPkceChallengeMethod() {
            return this.pkceChallengeMethod;
        }

        public CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setPkceEnabled(Boolean pkceEnabled) {
            this.pkceEnabled = pkceEnabled;
            return this;
        }
        public Boolean getPkceEnabled() {
            return this.pkceEnabled;
        }

        public CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setProviderVendor(String providerVendor) {
            this.providerVendor = providerVendor;
            return this;
        }
        public String getProviderVendor() {
            return this.providerVendor;
        }

        public CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

    }

    public static class CreateCredentialProviderRequestCredentialProviderConfig extends TeaModel {
        /**
         * <p>The configuration of the JWT credential provider.</p>
         */
        @NameInMap("JwtProviderConfig")
        public CreateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig jwtProviderConfig;

        /**
         * <p>The configuration of the OAuth credential provider.</p>
         */
        @NameInMap("OAuthProviderConfig")
        public CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig OAuthProviderConfig;

        public static CreateCredentialProviderRequestCredentialProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateCredentialProviderRequestCredentialProviderConfig self = new CreateCredentialProviderRequestCredentialProviderConfig();
            return TeaModel.build(map, self);
        }

        public CreateCredentialProviderRequestCredentialProviderConfig setJwtProviderConfig(CreateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig jwtProviderConfig) {
            this.jwtProviderConfig = jwtProviderConfig;
            return this;
        }
        public CreateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig getJwtProviderConfig() {
            return this.jwtProviderConfig;
        }

        public CreateCredentialProviderRequestCredentialProviderConfig setOAuthProviderConfig(CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig OAuthProviderConfig) {
            this.OAuthProviderConfig = OAuthProviderConfig;
            return this;
        }
        public CreateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig getOAuthProviderConfig() {
            return this.OAuthProviderConfig;
        }

    }

}
