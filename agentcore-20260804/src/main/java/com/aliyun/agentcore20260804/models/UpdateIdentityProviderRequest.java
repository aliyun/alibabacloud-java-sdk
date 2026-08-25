// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderRequest extends TeaModel {
    /**
     * <p>The request body for updating the external identity provider.</p>
     */
    @NameInMap("body")
    public UpdateIdentityProviderRequestBody body;

    public static UpdateIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderRequest self = new UpdateIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderRequest setBody(UpdateIdentityProviderRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateIdentityProviderRequestBody getBody() {
        return this.body;
    }

    public static class UpdateIdentityProviderRequestBodyMetadata extends TeaModel {
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
         * <p>Required. The secret of the external identity provider application. This parameter is write-only and is not returned by query operations.</p>
         * 
         * <strong>example:</strong>
         * <p>example-app-secret</p>
         */
        @NameInMap("appSecret")
        public String appSecret;

        /**
         * <p>The CorpId of the DingTalk organization. This parameter is required when the binding type is DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>dingexamplecorpid01</p>
         */
        @NameInMap("corpId")
        public String corpId;

        /**
         * <p>The data encryption key for event subscriptions. The value must be consistent with the one configured in the external identity provider application. This parameter is write-only and is not returned by query operations.</p>
         * 
         * <strong>example:</strong>
         * <p>example-encrypt-key</p>
         */
        @NameInMap("encryptKey")
        public String encryptKey;

        /**
         * <p>The verification token for event subscriptions. The value must be consistent with the one configured in the external identity provider application. This parameter is write-only and is not returned by query operations.</p>
         * 
         * <strong>example:</strong>
         * <p>example-verification-token</p>
         */
        @NameInMap("verificationToken")
        public String verificationToken;

        public static UpdateIdentityProviderRequestBodyMetadata build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestBodyMetadata self = new UpdateIdentityProviderRequestBodyMetadata();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestBodyMetadata setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateIdentityProviderRequestBodyMetadata setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public UpdateIdentityProviderRequestBodyMetadata setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public UpdateIdentityProviderRequestBodyMetadata setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public UpdateIdentityProviderRequestBodyMetadata setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public UpdateIdentityProviderRequestBodyMetadata setVerificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public String getVerificationToken() {
            return this.verificationToken;
        }

    }

    public static class UpdateIdentityProviderRequestBody extends TeaModel {
        /**
         * <p>Specifies whether workspace users are allowed to log on through this external identity provider.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>The new application configuration of the external identity provider. If not specified, the existing configuration remains unchanged.</p>
         */
        @NameInMap("metadata")
        public UpdateIdentityProviderRequestBodyMetadata metadata;

        /**
         * <p>Specifies whether to enable organization member synchronization. After this feature is enabled, the external identity provider synchronizes organization members as workspace users.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        public static UpdateIdentityProviderRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestBody self = new UpdateIdentityProviderRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestBody setLoginEnabled(Boolean loginEnabled) {
            this.loginEnabled = loginEnabled;
            return this;
        }
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        public UpdateIdentityProviderRequestBody setMetadata(UpdateIdentityProviderRequestBodyMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public UpdateIdentityProviderRequestBodyMetadata getMetadata() {
            return this.metadata;
        }

        public UpdateIdentityProviderRequestBody setSyncEnabled(Boolean syncEnabled) {
            this.syncEnabled = syncEnabled;
            return this;
        }
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

    }

}
