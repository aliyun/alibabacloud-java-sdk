// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderRequest extends TeaModel {
    /**
     * <p>The request body for binding an external identity provider.</p>
     */
    @NameInMap("body")
    public CreateIdentityProviderRequestBody body;

    public static CreateIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderRequest self = new CreateIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderRequest setBody(CreateIdentityProviderRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateIdentityProviderRequestBody getBody() {
        return this.body;
    }

    public static class CreateIdentityProviderRequestBodyMetadata extends TeaModel {
        /**
         * <p>The App ID of the Lark application. This parameter is required when the binding type is Feishu.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_exampleappid01</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The AppKey of the DingTalk application. This parameter is required when the binding type is DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>dingexampleappkey01</p>
         */
        @NameInMap("appKey")
        public String appKey;

        /**
         * <p>Required. The secret of the external identity provider application. This parameter is used only for write operations. The query API does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>example-app-secret</p>
         */
        @NameInMap("appSecret")
        public String appSecret;

        /**
         * <p>The CorpId of the DingTalk enterprise. This parameter is required when the binding type is DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>dingexamplecorpid01</p>
         */
        @NameInMap("corpId")
        public String corpId;

        /**
         * <p>The data encryption key for event subscription. The value must be the same as the one configured in the external identity provider application. This parameter is used only for write operations. The query API does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>example-encrypt-key</p>
         */
        @NameInMap("encryptKey")
        public String encryptKey;

        /**
         * <p>The verification token for event subscription. The value must be the same as the one configured in the external identity provider application. This parameter is used only for write operations. The query API does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>example-verification-token</p>
         */
        @NameInMap("verificationToken")
        public String verificationToken;

        public static CreateIdentityProviderRequestBodyMetadata build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestBodyMetadata self = new CreateIdentityProviderRequestBodyMetadata();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestBodyMetadata setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateIdentityProviderRequestBodyMetadata setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public CreateIdentityProviderRequestBodyMetadata setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public CreateIdentityProviderRequestBodyMetadata setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public CreateIdentityProviderRequestBodyMetadata setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public CreateIdentityProviderRequestBodyMetadata setVerificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public String getVerificationToken() {
            return this.verificationToken;
        }

    }

    public static class CreateIdentityProviderRequestBody extends TeaModel {
        /**
         * <p>The type of the external identity provider. Valid values: DingTalk, Feishu.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("identityProviderType")
        public String identityProviderType;

        /**
         * <p>Specifies whether workspace users are allowed to log on through this external identity provider.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>The application configuration of the external identity provider. When binding DingTalk, you must provide appKey, appSecret, and corpId. When binding Lark, you must provide appId and appSecret.</p>
         */
        @NameInMap("metadata")
        public CreateIdentityProviderRequestBodyMetadata metadata;

        /**
         * <p>Specifies whether to enable organization member synchronization. After this feature is enabled, the external identity provider synchronizes organization members as workspace users.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        public static CreateIdentityProviderRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestBody self = new CreateIdentityProviderRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestBody setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public CreateIdentityProviderRequestBody setLoginEnabled(Boolean loginEnabled) {
            this.loginEnabled = loginEnabled;
            return this;
        }
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        public CreateIdentityProviderRequestBody setMetadata(CreateIdentityProviderRequestBodyMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public CreateIdentityProviderRequestBodyMetadata getMetadata() {
            return this.metadata;
        }

        public CreateIdentityProviderRequestBody setSyncEnabled(Boolean syncEnabled) {
            this.syncEnabled = syncEnabled;
            return this;
        }
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

    }

}
