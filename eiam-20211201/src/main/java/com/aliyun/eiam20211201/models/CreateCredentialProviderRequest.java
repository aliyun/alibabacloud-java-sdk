// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCredentialProviderRequest extends TeaModel {
    /**
     * <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>认证令牌提供商的配置。</p>
     */
    @NameInMap("CredentialProviderConfig")
    public CreateCredentialProviderRequestCredentialProviderConfig credentialProviderConfig;

    /**
     * <p>认证令牌提供商的业务标识。是一个具备可读性的唯一标识。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_example_identifier</p>
     */
    @NameInMap("CredentialProviderIdentifier")
    public String credentialProviderIdentifier;

    /**
     * <p>认证令牌提供商名称。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_example_name</p>
     */
    @NameInMap("CredentialProviderName")
    public String credentialProviderName;

    /**
     * <p>认证令牌提供商的类型。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oauth</p>
     */
    @NameInMap("CredentialProviderType")
    public String credentialProviderType;

    /**
     * <p>描述。</p>
     * 
     * <strong>example:</strong>
     * <p>This is an example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
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
         * <p>签发出的JWT中的issuer字段的允许列表。</p>
         */
        @NameInMap("AllowedTokenIssuers")
        public java.util.List<String> allowedTokenIssuers;

        /**
         * <p>是否开启JWT派生短令牌能力。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DerivedShortTokenEnabled")
        public Boolean derivedShortTokenEnabled;

        /**
         * <p>JWT的有效时长，单位秒。</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("Expiration")
        public Integer expiration;

        /**
         * <p>是否开启JWT过期清理。</p>
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
         * <p>OAuth协议中的client_id，客户端ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client_id_example_xxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>OAuth协议中的client_secret，客户端密钥。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client_secret_example_xxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>OAuth协议中的scope，权限范围。</p>
         * 
         * <strong>example:</strong>
         * <p>example:test_01 example:test_02</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>OAuth协议的Token端点。</p>
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
         * <p>JWT身份提供商配置。</p>
         */
        @NameInMap("JwtProviderConfig")
        public CreateCredentialProviderRequestCredentialProviderConfigJwtProviderConfig jwtProviderConfig;

        /**
         * <p>OAuth 2LO机用类型的提供商的配置。</p>
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
