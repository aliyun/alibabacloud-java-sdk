// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCredentialProviderRequest extends TeaModel {
    /**
     * <p>An idempotency token that ensures request idempotence.</p>
     * <p>Generate a unique value on your client for each request. ClientToken supports only ASCII characters and must be no longer than 64 characters. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
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
     * <p>The ID of the credential provider.</p>
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
     * <p>The name must be no longer than 64 characters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test_example_name</p>
     */
    @NameInMap("CredentialProviderName")
    public String credentialProviderName;

    /**
     * <p>The ID of the instance.</p>
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
         * <p>A list of allowed JWT issuers.</p>
         * <blockquote>
         * <p>The list must contain no more than 200 items.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>To clear the issuer list, pass an empty array or an empty string.</p>
         */
        @NameInMap("AllowedTokenIssuers")
        public java.util.List<String> allowedTokenIssuers;

        /**
         * <p>Whether to enable derived short tokens for JWTs.</p>
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
         * <p>Whether to enable JWT expiration cleanup.</p>
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
         * <p>The client secret defined in the OAuth protocol.</p>
         * <blockquote>
         * <p>The value must be no longer than 1024 characters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>client_secret_example_xxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>The scope defined in the OAuth protocol.</p>
         * <blockquote>
         * <p>If you do not specify the scope parameter when calling the DeveloperAPI to get an OAuth access token, the scope configured for the credential provider is used as the default.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>Separate multiple scope values with spaces. To clear the scope configuration, pass an empty string.</p>
         * <p>Rules for a single scope value:</p>
         * <ol>
         * <li><p>Allowed characters: lowercase letters, digits, and special characters <code>|/:_-.</code></p>
         * </li>
         * <li><p>Must contain at least one lowercase letter or digit.</p>
         * </li>
         * <li><p>Must start with a special character <code>.</code>, a lowercase letter, or a digit.</p>
         * </li>
         * <li><p>Must be no longer than 1024 characters.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>example:test_01 example:test_02</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The token endpoint defined in the OAuth protocol.</p>
         * <blockquote>
         * <p>The value must start with <code>http://</code> or <code>https://</code>. It must be no longer than 1024 characters.</p>
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

        public UpdateCredentialProviderRequestCredentialProviderConfigOAuthProviderConfig setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
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
         * <p>The configuration for a JWT credential provider.</p>
         */
        @NameInMap("JwtProviderConfig")
        public UpdateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig jwtProviderConfig;

        /**
         * <p>The configuration for an OAuth credential provider.</p>
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
