// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCredentialProviderRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the parameter value on your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length. For more information, see References: <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configuration of the credential provider.</p>
     */
    @NameInMap("CredentialProviderConfig")
    public UpdateCredentialProviderRequestCredentialProviderConfig credentialProviderConfig;

    /**
     * <p>The credential provider ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
     */
    @NameInMap("CredentialProviderId")
    public String credentialProviderId;

    /**
     * <p>The name of the credential provider.</p>
     * <blockquote>
     * <p>The name can be up to 64 characters in length.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test_example_name</p>
     */
    @NameInMap("CredentialProviderName")
    public String credentialProviderName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateCredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialProviderRequest self = new UpdateCredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialProviderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCredentialProviderRequest setCredentialProviderConfig(UpdateCredentialProviderRequestCredentialProviderConfig credentialProviderConfig) {
        this.credentialProviderConfig = credentialProviderConfig;
        return this;
    }
    public UpdateCredentialProviderRequestCredentialProviderConfig getCredentialProviderConfig() {
        return this.credentialProviderConfig;
    }

    public UpdateCredentialProviderRequest setCredentialProviderId(String credentialProviderId) {
        this.credentialProviderId = credentialProviderId;
        return this;
    }
    public String getCredentialProviderId() {
        return this.credentialProviderId;
    }

    public UpdateCredentialProviderRequest setCredentialProviderName(String credentialProviderName) {
        this.credentialProviderName = credentialProviderName;
        return this;
    }
    public String getCredentialProviderName() {
        return this.credentialProviderName;
    }

    public UpdateCredentialProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class UpdateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig extends TeaModel {
        /**
         * <p>The list of allowed JWT issuers.</p>
         * <blockquote>
         * <p>The list can contain up to 200 issuers.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: To clear the issuer list, pass an empty list or an empty string when you call the operation.</notice></p>
         * </blockquote>
         */
        @NameInMap("AllowedTokenIssuers")
        public java.util.List<String> allowedTokenIssuers;

        /**
         * <p>Specifies whether to enable the JWT derived short token capability.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DerivedShortTokenEnabled")
        public Boolean derivedShortTokenEnabled;

        /**
         * <p>The validity period of the JWT. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("Expiration")
        public Integer expiration;

        /**
         * <p>Specifies whether to enable JWT expiration cleanup.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExpirationCleanupEnabled")
        public Boolean expirationCleanupEnabled;

        public static UpdateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig self = new UpdateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig setAllowedTokenIssuers(java.util.List<String> allowedTokenIssuers) {
            this.allowedTokenIssuers = allowedTokenIssuers;
            return this;
        }
        public java.util.List<String> getAllowedTokenIssuers() {
            return this.allowedTokenIssuers;
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig setDerivedShortTokenEnabled(Boolean derivedShortTokenEnabled) {
            this.derivedShortTokenEnabled = derivedShortTokenEnabled;
            return this;
        }
        public Boolean getDerivedShortTokenEnabled() {
            return this.derivedShortTokenEnabled;
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig setExpiration(Integer expiration) {
            this.expiration = expiration;
            return this;
        }
        public Integer getExpiration() {
            return this.expiration;
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig setExpirationCleanupEnabled(Boolean expirationCleanupEnabled) {
            this.expirationCleanupEnabled = expirationCleanupEnabled;
            return this;
        }
        public Boolean getExpirationCleanupEnabled() {
            return this.expirationCleanupEnabled;
        }

    }

    public static class UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig extends TeaModel {
        /**
         * <p>The authorization endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/authorize">https://example.com/authorize</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The OAuth authorization flow type. Valid values:</p>
         * <ul>
         * <li>m2m: machine-to-machine.</li>
         * <li>user_federation: user federation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m2m</p>
         */
        @NameInMap("AuthorizationFlow")
        public String authorizationFlow;

        /**
         * <p>The client secret in the OAuth protocol.</p>
         * <blockquote>
         * <p>The client secret can be up to 1,024 characters in length.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>client_secret_example_xxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>The URL of the discovery document.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/.well-known/openid-configuration">https://example.com/.well-known/openid-configuration</a></p>
         */
        @NameInMap("DiscoveryUrl")
        public String discoveryUrl;

        /**
         * <p>The URL of the authorization server identifier.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/issuer">https://example.com/issuer</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The PKCE challenge method. Valid values:</p>
         * <ul>
         * <li>S256.</li>
         * <li>plain.</li>
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
         * <p>The vendor type. Valid values:</p>
         * <ul>
         * <li>custom: custom.</li>
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
         * <p>The scope in the OAuth protocol.</p>
         * <blockquote>
         * <p>The scope configuration of the OAuth credential provider serves as a fallback value. If the scope parameter is not specified when you call the Developer API to obtain an OAuth access token, the access token is issued based on the scope configuration of the credential provider.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: Separate multiple scope values with spaces. To clear the scope configuration, enter an empty string.</notice></p>
         * </blockquote>
         * <p>The limits on a single scope value are as follows:</p>
         * <ol>
         * <li>Allowed characters: lowercase letters, digits, and the following special characters: <code>|/:_-.</code></li>
         * <li>The value must contain at least one lowercase letter or digit.</li>
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
         * <p>The token endpoint of the OAuth protocol.</p>
         * <blockquote>
         * <p>The endpoint must start with <code>http://</code> or <code>https://</code> and can be up to 1,024 characters in length.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/token">https://example.com/token</a></p>
         */
        @NameInMap("TokenEndpoint")
        public String tokenEndpoint;

        public static UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig self = new UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setAuthorizationFlow(String authorizationFlow) {
            this.authorizationFlow = authorizationFlow;
            return this;
        }
        public String getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setDiscoveryUrl(String discoveryUrl) {
            this.discoveryUrl = discoveryUrl;
            return this;
        }
        public String getDiscoveryUrl() {
            return this.discoveryUrl;
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setPkceChallengeMethod(String pkceChallengeMethod) {
            this.pkceChallengeMethod = pkceChallengeMethod;
            return this;
        }
        public String getPkceChallengeMethod() {
            return this.pkceChallengeMethod;
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setPkceEnabled(Boolean pkceEnabled) {
            this.pkceEnabled = pkceEnabled;
            return this;
        }
        public Boolean getPkceEnabled() {
            return this.pkceEnabled;
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setProviderVendor(String providerVendor) {
            this.providerVendor = providerVendor;
            return this;
        }
        public String getProviderVendor() {
            return this.providerVendor;
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

    }

    public static class UpdateCredentialProviderRequestCredentialProviderConfig extends TeaModel {
        /**
         * <p>The configuration of the JSON Web Token (JWT) credential provider.</p>
         */
        @NameInMap("JwtProviderConfig")
        public UpdateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig jwtProviderConfig;

        /**
         * <p>The configuration of the OAuth credential provider.</p>
         */
        @NameInMap("OAuthProviderConfig")
        public UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig OAuthProviderConfig;

        public static UpdateCredentialProviderRequestCredentialProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateCredentialProviderRequestCredentialProviderConfig self = new UpdateCredentialProviderRequestCredentialProviderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateCredentialProviderRequestCredentialProviderConfig setJwtProviderConfig(UpdateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig jwtProviderConfig) {
            this.jwtProviderConfig = jwtProviderConfig;
            return this;
        }
        public UpdateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig getJwtProviderConfig() {
            return this.jwtProviderConfig;
        }

        public UpdateCredentialProviderRequestCredentialProviderConfig setOAuthProviderConfig(UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig OAuthProviderConfig) {
            this.OAuthProviderConfig = OAuthProviderConfig;
            return this;
        }
        public UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig getOAuthProviderConfig() {
            return this.OAuthProviderConfig;
        }

    }

}
