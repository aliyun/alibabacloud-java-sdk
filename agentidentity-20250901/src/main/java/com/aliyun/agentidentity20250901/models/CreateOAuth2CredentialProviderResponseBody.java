// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateOAuth2CredentialProviderResponseBody extends TeaModel {
    @NameInMap("OAuth2CredentialProvider")
    public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider OAuth2CredentialProvider;

    /**
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
         * <strong>example:</strong>
         * <p><a href="https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb">https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb</a></p>
         */
        @NameInMap("CallbackURL")
        public String callbackURL;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:tokenvault/default/oauth2credentialprovider/oauth-provider-aliyun</p>
         */
        @NameInMap("CredentialProviderArn")
        public String credentialProviderArn;

        /**
         * <strong>example:</strong>
         * <p>AliyunOAuth2</p>
         */
        @NameInMap("CredentialProviderVendor")
        public String credentialProviderVendor;

        /**
         * <strong>example:</strong>
         * <p>example provider</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>oauth-provider-aliyun</p>
         */
        @NameInMap("OAuth2CredentialProviderName")
        public String OAuth2CredentialProviderName;

        @NameInMap("OAuth2ProviderConfig")
        public OAuth2ProviderConfig OAuth2ProviderConfig;

        /**
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

        public CreateOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
