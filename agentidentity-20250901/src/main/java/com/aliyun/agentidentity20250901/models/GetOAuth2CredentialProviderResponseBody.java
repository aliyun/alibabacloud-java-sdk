// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetOAuth2CredentialProviderResponseBody extends TeaModel {
    /**
     * <p>The credential provider.</p>
     */
    @NameInMap("OAuth2CredentialProvider")
    public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider OAuth2CredentialProvider;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D9A9DC39-61BB-53FD-9ADC-B14884F21038</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOAuth2CredentialProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOAuth2CredentialProviderResponseBody self = new GetOAuth2CredentialProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOAuth2CredentialProviderResponseBody setOAuth2CredentialProvider(GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider OAuth2CredentialProvider) {
        this.OAuth2CredentialProvider = OAuth2CredentialProvider;
        return this;
    }
    public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider getOAuth2CredentialProvider() {
        return this.OAuth2CredentialProvider;
    }

    public GetOAuth2CredentialProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider extends TeaModel {
        /**
         * <p>The unique callback URL assigned to the provider, which must be configured in the list of allowed callback URLs of the identity provider.
         * Format: <a href="https://agentidentitydata.%7B%7Bregion%7D%7D.aliyuncs.com/oauth2/callback/%7B%7BUUID%7D%7D">https://agentidentitydata.{{region}}.aliyuncs.com/oauth2/callback/{{UUID}}</a>
         * If a value is specified, the specified value is used.
         * If no value is specified, the server automatically generates one.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb">https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb</a></p>
         */
        @NameInMap("CallbackURL")
        public String callbackURL;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ARN of the credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:tokenvault/default/oauth2credentialprovider/oauth-provider-aliyun</p>
         */
        @NameInMap("CredentialProviderArn")
        public String credentialProviderArn;

        /**
         * <p>The vendor of the provider, such as AliyunOAuth2, AlibabaCloudOAuth2, DingTalkOAuth2, FeiShuOAuth2, or CustomOAuth2.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunOAuth2</p>
         */
        @NameInMap("CredentialProviderVendor")
        public String credentialProviderVendor;

        /**
         * <p>The description of the OAuth 2.0 credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>example provider</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The IDaaS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_xxxx</p>
         */
        @NameInMap("IDaaSInstanceId")
        public String IDaaSInstanceId;

        /**
         * <p>The name of the credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>oauth2-provider-aliyun</p>
         */
        @NameInMap("OAuth2CredentialProviderName")
        public String OAuth2CredentialProviderName;

        /**
         * <p>The object that contains provider-specific configurations, such as clientId and clientSecret.</p>
         */
        @NameInMap("OAuth2ProviderConfig")
        public OAuth2ProviderConfig OAuth2ProviderConfig;

        @NameInMap("OAuthType")
        public String OAuthType;

        /**
         * <p>The ID of the outbound application.</p>
         * 
         * <strong>example:</strong>
         * <p>app_xxxxx</p>
         */
        @NameInMap("OutboundApplicationId")
        public String outboundApplicationId;

        /**
         * <p>The outbound audience.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-xxxx</p>
         */
        @NameInMap("OutboundAudience")
        public String outboundAudience;

        /**
         * <p>The client ID of the outbound application.</p>
         * 
         * <strong>example:</strong>
         * <p>client_xxxx</p>
         */
        @NameInMap("OutboundClientId")
        public String outboundClientId;

        @NameInMap("SourcePlatform")
        public String sourcePlatform;

        /**
         * <p>The name of the TokenVault.</p>
         */
        @NameInMap("TokenVaultName")
        public String tokenVaultName;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider build(java.util.Map<String, ?> map) throws Exception {
            GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider self = new GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider();
            return TeaModel.build(map, self);
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setCallbackURL(String callbackURL) {
            this.callbackURL = callbackURL;
            return this;
        }
        public String getCallbackURL() {
            return this.callbackURL;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setCredentialProviderVendor(String credentialProviderVendor) {
            this.credentialProviderVendor = credentialProviderVendor;
            return this;
        }
        public String getCredentialProviderVendor() {
            return this.credentialProviderVendor;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setIDaaSInstanceId(String IDaaSInstanceId) {
            this.IDaaSInstanceId = IDaaSInstanceId;
            return this;
        }
        public String getIDaaSInstanceId() {
            return this.IDaaSInstanceId;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setOAuth2CredentialProviderName(String OAuth2CredentialProviderName) {
            this.OAuth2CredentialProviderName = OAuth2CredentialProviderName;
            return this;
        }
        public String getOAuth2CredentialProviderName() {
            return this.OAuth2CredentialProviderName;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setOAuth2ProviderConfig(OAuth2ProviderConfig OAuth2ProviderConfig) {
            this.OAuth2ProviderConfig = OAuth2ProviderConfig;
            return this;
        }
        public OAuth2ProviderConfig getOAuth2ProviderConfig() {
            return this.OAuth2ProviderConfig;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setOAuthType(String OAuthType) {
            this.OAuthType = OAuthType;
            return this;
        }
        public String getOAuthType() {
            return this.OAuthType;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setOutboundApplicationId(String outboundApplicationId) {
            this.outboundApplicationId = outboundApplicationId;
            return this;
        }
        public String getOutboundApplicationId() {
            return this.outboundApplicationId;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setOutboundAudience(String outboundAudience) {
            this.outboundAudience = outboundAudience;
            return this;
        }
        public String getOutboundAudience() {
            return this.outboundAudience;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setOutboundClientId(String outboundClientId) {
            this.outboundClientId = outboundClientId;
            return this;
        }
        public String getOutboundClientId() {
            return this.outboundClientId;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setSourcePlatform(String sourcePlatform) {
            this.sourcePlatform = sourcePlatform;
            return this;
        }
        public String getSourcePlatform() {
            return this.sourcePlatform;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setTokenVaultName(String tokenVaultName) {
            this.tokenVaultName = tokenVaultName;
            return this;
        }
        public String getTokenVaultName() {
            return this.tokenVaultName;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
