// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCredentialProviderRequest extends TeaModel {
    /**
     * <p>The idempotence token. It is used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value from your client to make sure that the value is unique among different requests. The ClientToken parameter can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
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
    public CreateCredentialProviderRequestCredentialProviderConfig credentialProviderConfig;

    /**
     * <p>The identifier of the credential provider.</p>
     * <blockquote>
     * <p>The identifier can contain uppercase letters, lowercase letters, digits, and the following special characters: <code>.-_</code>. The identifier cannot exceed 64 characters in length.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_example_identifier</p>
     */
    @NameInMap("CredentialProviderIdentifier")
    public String credentialProviderIdentifier;

    /**
     * <p>The name of the credential provider.</p>
     * <blockquote>
     * <p>The name cannot exceed 64 characters in length.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_example_name</p>
     */
    @NameInMap("CredentialProviderName")
    public String credentialProviderName;

    /**
     * <p>The type of the credential provider. Valid values:</p>
     * <ul>
     * <li><p>oauth: OAuth credential provider</p>
     * </li>
     * <li><p>jwt: JWT credential provider</p>
     * </li>
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
     * <p>The description cannot exceed 128 characters in length.</p>
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
         * <p>The list of allowed issuers for JWTs.</p>
         * <blockquote>
         * <p>The list can contain a maximum of 200 issuers.</p>
         * </blockquote>
         */
        @NameInMap("AllowedTokenIssuers")
        public java.util.List<String> allowedTokenIssuers;

        /**
         * <p>Specifies whether to enable the short-lived token derivation feature for JWTs.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DerivedShortTokenEnabled")
        public Boolean derivedShortTokenEnabled;

        /**
         * <p>The validity period of the JSON Web Token (JWT). Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("Expiration")
        public Integer expiration;

        /**
         * <p>Specifies whether to enable the cleanup of expired JWTs.</p>
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
         * <p>The client ID. This parameter corresponds to the client_id parameter in the OAuth protocol.</p>
         * <blockquote>
         * <p>The client ID cannot exceed 128 characters in length.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client_id_example_xxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The client key. This parameter corresponds to the client_secret parameter in the OAuth protocol.</p>
         * <blockquote>
         * <p>The client key cannot exceed 1024 characters in length.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client_secret_example_xxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>The scope of permissions. This parameter corresponds to the scope parameter in the OAuth protocol.</p>
         * <blockquote>
         * <p>The scope that you configure for the OAuth credential provider is used as a fallback value. If you do not specify the scope parameter when you call a DeveloperAPI operation to obtain an OAuth access token, the scope that you configure for the credential provider is used.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>Separate multiple scopes with spaces.</p>
         * <p>The following limits apply to a single scope:</p>
         * <ol>
         * <li><p>The scope can contain lowercase letters, digits, and the following special characters: <code>|/:_-.</code></p>
         * </li>
         * <li><p>The scope must contain lowercase letters or digits.</p>
         * </li>
         * <li><p>The scope must start with a special character <code>.</code>, a lowercase letter, or a digit.</p>
         * </li>
         * <li><p>The scope cannot exceed 1024 characters in length.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>example:test_01 example:test_02</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The token endpoint. This parameter corresponds to the token endpoint in the OAuth protocol.</p>
         * <blockquote>
         * <p>The value must start with <code>http://</code> or <code>https://</code> and cannot exceed 1024 characters in length.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
