// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderRequest extends TeaModel {
    /**
     * <p>The request content for binding an external identity provider.</p>
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
         * <p>The app ID of the Lark application. This parameter is required when the binding type is Feishu.</p>
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
         * <p>Required. The secret of the external identity provider application. This parameter is used only for writing and is not returned by query API operations.</p>
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
         * <p>The data encryption key for event subscription. The value must be the same as the one configured in the external identity provider application. This parameter is used only for writing and is not returned by query API operations.</p>
         * 
         * <strong>example:</strong>
         * <p>example-encrypt-key</p>
         */
        @NameInMap("encryptKey")
        public String encryptKey;

        /**
         * <p>The verification token for event subscription. The value must be the same as the one configured in the external identity provider application. This parameter is used only for writing and is not returned by query API operations.</p>
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

    public static class CreateIdentityProviderRequestBodySyncScope extends TeaModel {
        /**
         * <p>When the mode is SelectedDepartments, the list must contain at least one non-empty department ID, which should be obtained from ListIdentityProviderDepartments. When the mode is AllAuthorized, pass an empty array or omit this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10001&quot;]</p>
         */
        @NameInMap("departmentIds")
        public java.util.List<String> departmentIds;

        /**
         * <p>AllAuthorized: the full authorization scope, which is limited by the application address book authorization. SelectedDepartments: the selected departments and all their sub-departments. When explicitly submitting syncScope, you must provide a valid mode, which is verified by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>SelectedDepartments</p>
         */
        @NameInMap("mode")
        public String mode;

        public static CreateIdentityProviderRequestBodySyncScope build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestBodySyncScope self = new CreateIdentityProviderRequestBodySyncScope();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestBodySyncScope setDepartmentIds(java.util.List<String> departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }
        public java.util.List<String> getDepartmentIds() {
            return this.departmentIds;
        }

        public CreateIdentityProviderRequestBodySyncScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class CreateIdentityProviderRequestBody extends TeaModel {
        /**
         * <p>The type of the external identity provider. Valid values: DingTalk and Feishu.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("identityProviderType")
        public String identityProviderType;

        /**
         * <p>Specifies whether to allow workspace users to log on through the external identity provider.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>The application configuration of the external identity provider. When you bind DingTalk, you must provide appKey, appSecret, and corpId. When you bind Lark, you must provide appId and appSecret.</p>
         */
        @NameInMap("metadata")
        public CreateIdentityProviderRequestBodyMetadata metadata;

        /**
         * <p>Specifies whether to enable organization member synchronization. If enabled, the external identity provider synchronizes organization members as workspace users.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        /**
         * <p>Controls the first synchronization when DingTalk or Lark is bound. If omitted or set to null, the default value is true. If set to false, only the configuration is saved, and synchronization is explicitly triggered later. CustomSSO does not use the vendor pull link.</p>
         */
        @NameInMap("syncOnBind")
        public Boolean syncOnBind;

        /**
         * <p>Retains the department-based synchronization scope definition. If omitted during creation, the default value is AllAuthorized. The first vendor synchronization is determined by syncOnBind. If omitted or set to null during an update, the original value is retained. Updating and saving the scope does not automatically perform full synchronization.</p>
         */
        @NameInMap("syncScope")
        public CreateIdentityProviderRequestBodySyncScope syncScope;

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

        public CreateIdentityProviderRequestBody setSyncOnBind(Boolean syncOnBind) {
            this.syncOnBind = syncOnBind;
            return this;
        }
        public Boolean getSyncOnBind() {
            return this.syncOnBind;
        }

        public CreateIdentityProviderRequestBody setSyncScope(CreateIdentityProviderRequestBodySyncScope syncScope) {
            this.syncScope = syncScope;
            return this;
        }
        public CreateIdentityProviderRequestBodySyncScope getSyncScope() {
            return this.syncScope;
        }

    }

}
