// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCredentialProviderResponseBody extends TeaModel {
    @NameInMap("CredentialProvider")
    public GetCredentialProviderResponseBodyCredentialProvider credentialProvider;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCredentialProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialProviderResponseBody self = new GetCredentialProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCredentialProviderResponseBody setCredentialProvider(GetCredentialProviderResponseBodyCredentialProvider credentialProvider) {
        this.credentialProvider = credentialProvider;
        return this;
    }
    public GetCredentialProviderResponseBodyCredentialProvider getCredentialProvider() {
        return this.credentialProvider;
    }

    public GetCredentialProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig extends TeaModel {
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

        /**
         * <p>JWT issuer。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.issuer.com">https://test.issuer.com</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>JWKs端点地址。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example123456.aliyunidaas.com/api/v2/auths_ngz2wj35ixxxdyat55nexxxxxx/oauth2/jwks">https://example123456.aliyunidaas.com/api/v2/auths_ngz2wj35ixxxdyat55nexxxxxx/oauth2/jwks</a></p>
         */
        @NameInMap("JwksEndpoint")
        public String jwksEndpoint;

        public static GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig self = new GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig();
            return TeaModel.build(map, self);
        }

        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig setAllowedTokenIssuers(java.util.List<String> allowedTokenIssuers) {
            this.allowedTokenIssuers = allowedTokenIssuers;
            return this;
        }
        public java.util.List<String> getAllowedTokenIssuers() {
            return this.allowedTokenIssuers;
        }

        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig setDerivedShortTokenEnabled(Boolean derivedShortTokenEnabled) {
            this.derivedShortTokenEnabled = derivedShortTokenEnabled;
            return this;
        }
        public Boolean getDerivedShortTokenEnabled() {
            return this.derivedShortTokenEnabled;
        }

        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig setExpiration(Integer expiration) {
            this.expiration = expiration;
            return this;
        }
        public Integer getExpiration() {
            return this.expiration;
        }

        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig setExpirationCleanupEnabled(Boolean expirationCleanupEnabled) {
            this.expirationCleanupEnabled = expirationCleanupEnabled;
            return this;
        }
        public Boolean getExpirationCleanupEnabled() {
            return this.expirationCleanupEnabled;
        }

        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig setJwksEndpoint(String jwksEndpoint) {
            this.jwksEndpoint = jwksEndpoint;
            return this;
        }
        public String getJwksEndpoint() {
            return this.jwksEndpoint;
        }

    }

    public static class GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigOAuthProviderConfig extends TeaModel {
        /**
         * <p>OAuth协议中的client_id，客户端ID。</p>
         * 
         * <strong>example:</strong>
         * <p>client_id_example_xxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

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
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/token">https://example.com/token</a></p>
         */
        @NameInMap("TokenEndpoint")
        public String tokenEndpoint;

        public static GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigOAuthProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigOAuthProviderConfig self = new GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigOAuthProviderConfig();
            return TeaModel.build(map, self);
        }

        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigOAuthProviderConfig setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigOAuthProviderConfig setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigOAuthProviderConfig setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

    }

    public static class GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfig extends TeaModel {
        /**
         * <p>JWT身份提供商配置。</p>
         */
        @NameInMap("JwtProviderConfig")
        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig jwtProviderConfig;

        /**
         * <p>OAuth 2LO机用类型的提供商的配置。</p>
         */
        @NameInMap("OAuthProviderConfig")
        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigOAuthProviderConfig OAuthProviderConfig;

        /**
         * <p>认证令牌提供商的敏感配置对应的凭据ID列表。</p>
         */
        @NameInMap("ProviderCredentialIds")
        public java.util.List<String> providerCredentialIds;

        public static GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfig self = new GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfig();
            return TeaModel.build(map, self);
        }

        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfig setJwtProviderConfig(GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig jwtProviderConfig) {
            this.jwtProviderConfig = jwtProviderConfig;
            return this;
        }
        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig getJwtProviderConfig() {
            return this.jwtProviderConfig;
        }

        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfig setOAuthProviderConfig(GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigOAuthProviderConfig OAuthProviderConfig) {
            this.OAuthProviderConfig = OAuthProviderConfig;
            return this;
        }
        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigOAuthProviderConfig getOAuthProviderConfig() {
            return this.OAuthProviderConfig;
        }

        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfig setProviderCredentialIds(java.util.List<String> providerCredentialIds) {
            this.providerCredentialIds = providerCredentialIds;
            return this;
        }
        public java.util.List<String> getProviderCredentialIds() {
            return this.providerCredentialIds;
        }

    }

    public static class GetCredentialProviderResponseBodyCredentialProvider extends TeaModel {
        /**
         * <p>认证令牌提供商的创建时间，Unix时间戳。</p>
         * 
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>认证令牌提供商的配置。</p>
         */
        @NameInMap("CredentialProviderConfig")
        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfig credentialProviderConfig;

        /**
         * <p>认证令牌提供商的创建类型。</p>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        @NameInMap("CredentialProviderCreationType")
        public String credentialProviderCreationType;

        /**
         * <p>认证令牌提供商ID。</p>
         * 
         * <strong>example:</strong>
         * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
         */
        @NameInMap("CredentialProviderId")
        public String credentialProviderId;

        /**
         * <p>认证令牌提供商的业务标识。</p>
         * 
         * <strong>example:</strong>
         * <p>test_example_identifier</p>
         */
        @NameInMap("CredentialProviderIdentifier")
        public String credentialProviderIdentifier;

        /**
         * <p>认证令牌提供商名称。</p>
         * 
         * <strong>example:</strong>
         * <p>test_example_name</p>
         */
        @NameInMap("CredentialProviderName")
        public String credentialProviderName;

        /**
         * <p>认证令牌提供商的类型。</p>
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
         * <p>EIAM实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>认证令牌提供商的状态。</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>认证令牌提供商的更新时间，Unix时间戳。</p>
         * 
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetCredentialProviderResponseBodyCredentialProvider build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialProviderResponseBodyCredentialProvider self = new GetCredentialProviderResponseBodyCredentialProvider();
            return TeaModel.build(map, self);
        }

        public GetCredentialProviderResponseBodyCredentialProvider setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetCredentialProviderResponseBodyCredentialProvider setCredentialProviderConfig(GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfig credentialProviderConfig) {
            this.credentialProviderConfig = credentialProviderConfig;
            return this;
        }
        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfig getCredentialProviderConfig() {
            return this.credentialProviderConfig;
        }

        public GetCredentialProviderResponseBodyCredentialProvider setCredentialProviderCreationType(String credentialProviderCreationType) {
            this.credentialProviderCreationType = credentialProviderCreationType;
            return this;
        }
        public String getCredentialProviderCreationType() {
            return this.credentialProviderCreationType;
        }

        public GetCredentialProviderResponseBodyCredentialProvider setCredentialProviderId(String credentialProviderId) {
            this.credentialProviderId = credentialProviderId;
            return this;
        }
        public String getCredentialProviderId() {
            return this.credentialProviderId;
        }

        public GetCredentialProviderResponseBodyCredentialProvider setCredentialProviderIdentifier(String credentialProviderIdentifier) {
            this.credentialProviderIdentifier = credentialProviderIdentifier;
            return this;
        }
        public String getCredentialProviderIdentifier() {
            return this.credentialProviderIdentifier;
        }

        public GetCredentialProviderResponseBodyCredentialProvider setCredentialProviderName(String credentialProviderName) {
            this.credentialProviderName = credentialProviderName;
            return this;
        }
        public String getCredentialProviderName() {
            return this.credentialProviderName;
        }

        public GetCredentialProviderResponseBodyCredentialProvider setCredentialProviderType(String credentialProviderType) {
            this.credentialProviderType = credentialProviderType;
            return this;
        }
        public String getCredentialProviderType() {
            return this.credentialProviderType;
        }

        public GetCredentialProviderResponseBodyCredentialProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCredentialProviderResponseBodyCredentialProvider setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCredentialProviderResponseBodyCredentialProvider setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCredentialProviderResponseBodyCredentialProvider setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
