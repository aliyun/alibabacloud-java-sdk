// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCredentialProviderResponseBody extends TeaModel {
    /**
     * <p>The credential provider.</p>
     */
    @NameInMap("CredentialProvider")
    public GetCredentialProviderResponseBodyCredentialProvider credentialProvider;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The list of allowed JWT issuers.</p>
         */
        @NameInMap("AllowedTokenIssuers")
        public java.util.List<String> allowedTokenIssuers;

        /**
         * <p>Indicates whether the JWT derived short token feature is enabled.</p>
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
         * <p>The JWKs endpoint URL.</p>
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
         * <p>The client_id in the OAuth protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>client_id_example_xxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The scope in the OAuth protocol.</p>
         * <blockquote>
         * <p>The scope configuration of the OAuth credential provider serves as the default value. If the scope parameter is not specified when calling the DeveloperAPI to obtain an OAuth access token, the scope configuration of the credential provider is used for issuance.</p>
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
         * <p>The token endpoint of the OAuth protocol.</p>
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
         * <p>The configuration of the JWT credential provider.</p>
         */
        @NameInMap("JwtProviderConfig")
        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigJwtProviderConfig jwtProviderConfig;

        /**
         * <p>The configuration of the OAuth credential provider.</p>
         */
        @NameInMap("OAuthProviderConfig")
        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfigOAuthProviderConfig OAuthProviderConfig;

        /**
         * <p>The list of credential IDs corresponding to the sensitive configurations of the credential provider.</p>
         * <blockquote>
         * <p>The system securely stores the sensitive configuration information of the credential provider in the form of credentials.</p>
         * </blockquote>
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
         * <p>The creation time of the credential provider. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The credential provider configuration.</p>
         */
        @NameInMap("CredentialProviderConfig")
        public GetCredentialProviderResponseBodyCredentialProviderCredentialProviderConfig credentialProviderConfig;

        /**
         * <p>The credential provider creation type. Valid values:</p>
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
         * <p>The credential provider identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>test_example_identifier</p>
         */
        @NameInMap("CredentialProviderIdentifier")
        public String credentialProviderIdentifier;

        /**
         * <p>The credential provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_example_name</p>
         */
        @NameInMap("CredentialProviderName")
        public String credentialProviderName;

        /**
         * <p>The credential provider type. Valid values:</p>
         * <ul>
         * <li>oauth: OAuth credential provider.</li>
         * <li>jwt: JWT credential provider.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oauth</p>
         */
        @NameInMap("CredentialProviderType")
        public String credentialProviderType;

        /**
         * <p>The description.</p>
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
         * <p>The update time of the credential provider. The value is a UNIX timestamp in milliseconds.</p>
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
