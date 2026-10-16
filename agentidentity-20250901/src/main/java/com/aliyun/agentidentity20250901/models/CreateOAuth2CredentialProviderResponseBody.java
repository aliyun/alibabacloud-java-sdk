// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateOAuth2CredentialProviderResponseBody extends TeaModel {
    /**
     * <p>The credential provider.</p>
     */
    @NameInMap("OAuth2CredentialProvider")
    public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider OAuth2CredentialProvider;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOAuth2CredentialProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOAuth2CredentialProviderResponseBody self = new CreateOAuth2CredentialProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOAuth2CredentialProviderResponseBody setOAuth2CredentialProvider(CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider OAuth2CredentialProvider) {
        this.OAuth2CredentialProvider = OAuth2CredentialProvider;
        return this;
    }
    public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider getOAuth2CredentialProvider() {
        return this.OAuth2CredentialProvider;
    }

    public CreateOAuth2CredentialProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider extends TeaModel {
        /**
         * <p>The unique callback URL assigned to the provider. You must configure this URL in the list of allowed callback URLs of the identity provider.</p>
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
         * <p>The ARN of the newly created credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:tokenvault/default/oauth2credentialprovider/oauth-provider-aliyun</p>
         */
        @NameInMap("CredentialProviderArn")
        public String credentialProviderArn;

        /**
         * <p>The vendor of the provider.</p>
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
         * <p>The name of the credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>oauth-provider-aliyun</p>
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

        @NameInMap("SourcePlatform")
        public String sourcePlatform;

        /**
         * <p>The name of the token vault.</p>
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

        public static CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider build(java.util.Map<String, ?> map) throws Exception {
            CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider self = new CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider();
            return TeaModel.build(map, self);
        }

        public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setCallbackURL(String callbackURL) {
            this.callbackURL = callbackURL;
            return this;
        }
        public String getCallbackURL() {
            return this.callbackURL;
        }

        public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setCredentialProviderVendor(String credentialProviderVendor) {
            this.credentialProviderVendor = credentialProviderVendor;
            return this;
        }
        public String getCredentialProviderVendor() {
            return this.credentialProviderVendor;
        }

        public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setOAuth2CredentialProviderName(String OAuth2CredentialProviderName) {
            this.OAuth2CredentialProviderName = OAuth2CredentialProviderName;
            return this;
        }
        public String getOAuth2CredentialProviderName() {
            return this.OAuth2CredentialProviderName;
        }

        public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setOAuth2ProviderConfig(OAuth2ProviderConfig OAuth2ProviderConfig) {
            this.OAuth2ProviderConfig = OAuth2ProviderConfig;
            return this;
        }
        public OAuth2ProviderConfig getOAuth2ProviderConfig() {
            return this.OAuth2ProviderConfig;
        }

        public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setOAuthType(String OAuthType) {
            this.OAuthType = OAuthType;
            return this;
        }
        public String getOAuthType() {
            return this.OAuthType;
        }

        public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setSourcePlatform(String sourcePlatform) {
            this.sourcePlatform = sourcePlatform;
            return this;
        }
        public String getSourcePlatform() {
            return this.sourcePlatform;
        }

        public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setTokenVaultName(String tokenVaultName) {
            this.tokenVaultName = tokenVaultName;
            return this;
        }
        public String getTokenVaultName() {
            return this.tokenVaultName;
        }

        public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
