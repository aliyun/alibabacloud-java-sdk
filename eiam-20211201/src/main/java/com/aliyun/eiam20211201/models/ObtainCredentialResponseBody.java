// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ObtainCredentialResponseBody extends TeaModel {
    @NameInMap("Credential")
    public ObtainCredentialResponseBodyCredential credential;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ObtainCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ObtainCredentialResponseBody self = new ObtainCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public ObtainCredentialResponseBody setCredential(ObtainCredentialResponseBodyCredential credential) {
        this.credential = credential;
        return this;
    }
    public ObtainCredentialResponseBodyCredential getCredential() {
        return this.credential;
    }

    public ObtainCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ObtainCredentialResponseBodyCredentialCredentialContentApiKeyContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>nsklncmwizncxxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        public static ObtainCredentialResponseBodyCredentialCredentialContentApiKeyContent build(java.util.Map<String, ?> map) throws Exception {
            ObtainCredentialResponseBodyCredentialCredentialContentApiKeyContent self = new ObtainCredentialResponseBodyCredentialCredentialContentApiKeyContent();
            return TeaModel.build(map, self);
        }

        public ObtainCredentialResponseBodyCredentialCredentialContentApiKeyContent setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

    }

    public static class ObtainCredentialResponseBodyCredentialCredentialContentOAuthClientContent extends TeaModel {
        /**
         * <p>OAuth协议的client_id</p>
         * 
         * <strong>example:</strong>
         * <p>dmvncmxersdxxxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <strong>example:</strong>
         * <p>nsklnertyt5ddwizncxxxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        public static ObtainCredentialResponseBodyCredentialCredentialContentOAuthClientContent build(java.util.Map<String, ?> map) throws Exception {
            ObtainCredentialResponseBodyCredentialCredentialContentOAuthClientContent self = new ObtainCredentialResponseBodyCredentialCredentialContentOAuthClientContent();
            return TeaModel.build(map, self);
        }

        public ObtainCredentialResponseBodyCredentialCredentialContentOAuthClientContent setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ObtainCredentialResponseBodyCredentialCredentialContentOAuthClientContent setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class ObtainCredentialResponseBodyCredentialCredentialContent extends TeaModel {
        @NameInMap("ApiKeyContent")
        public ObtainCredentialResponseBodyCredentialCredentialContentApiKeyContent apiKeyContent;

        /**
         * <p>OAuth客户端认证凭证类型的凭据内容。</p>
         */
        @NameInMap("OAuthClientContent")
        public ObtainCredentialResponseBodyCredentialCredentialContentOAuthClientContent OAuthClientContent;

        public static ObtainCredentialResponseBodyCredentialCredentialContent build(java.util.Map<String, ?> map) throws Exception {
            ObtainCredentialResponseBodyCredentialCredentialContent self = new ObtainCredentialResponseBodyCredentialCredentialContent();
            return TeaModel.build(map, self);
        }

        public ObtainCredentialResponseBodyCredentialCredentialContent setApiKeyContent(ObtainCredentialResponseBodyCredentialCredentialContentApiKeyContent apiKeyContent) {
            this.apiKeyContent = apiKeyContent;
            return this;
        }
        public ObtainCredentialResponseBodyCredentialCredentialContentApiKeyContent getApiKeyContent() {
            return this.apiKeyContent;
        }

        public ObtainCredentialResponseBodyCredentialCredentialContent setOAuthClientContent(ObtainCredentialResponseBodyCredentialCredentialContentOAuthClientContent OAuthClientContent) {
            this.OAuthClientContent = OAuthClientContent;
            return this;
        }
        public ObtainCredentialResponseBodyCredentialCredentialContentOAuthClientContent getOAuthClientContent() {
            return this.OAuthClientContent;
        }

    }

    public static class ObtainCredentialResponseBodyCredential extends TeaModel {
        /**
         * <p>云角色创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>凭据的内容。</p>
         */
        @NameInMap("CredentialContent")
        public ObtainCredentialResponseBodyCredentialCredentialContent credentialContent;

        /**
         * <p>凭据的创建类型。</p>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        @NameInMap("CredentialCreationType")
        public String credentialCreationType;

        /**
         * <p>凭据ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cred_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("CredentialId")
        public String credentialId;

        /**
         * <p>凭据标识</p>
         * 
         * <strong>example:</strong>
         * <p>credential_identifier_test</p>
         */
        @NameInMap("CredentialIdentifier")
        public String credentialIdentifier;

        /**
         * <p>凭据名称</p>
         * 
         * <strong>example:</strong>
         * <p>credential_name</p>
         */
        @NameInMap("CredentialName")
        public String credentialName;

        /**
         * <p>凭据的使用场景标签。</p>
         * 
         * <strong>example:</strong>
         * <p>llm</p>
         */
        @NameInMap("CredentialScenarioLabel")
        public String credentialScenarioLabel;

        @NameInMap("CredentialSharingScope")
        public String credentialSharingScope;

        /**
         * <p>凭据所属的主体ID。</p>
         * 
         * <strong>example:</strong>
         * <p>apt_werthgfdsasffxxxxx</p>
         */
        @NameInMap("CredentialSubjectId")
        public String credentialSubjectId;

        /**
         * <p>凭据所属的主体类型。</p>
         * 
         * <strong>example:</strong>
         * <p>authentication_token_provider</p>
         */
        @NameInMap("CredentialSubjectType")
        public String credentialSubjectType;

        /**
         * <p>凭据类型。</p>
         * 
         * <strong>example:</strong>
         * <p>api_key</p>
         */
        @NameInMap("CredentialType")
        public String credentialType;

        /**
         * <p>描述</p>
         * 
         * <strong>example:</strong>
         * <p>credential_description</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("ExclusiveUserId")
        public String exclusiveUserId;

        /**
         * <p>EIAM实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>凭据状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>云角色更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>1649830227000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ObtainCredentialResponseBodyCredential build(java.util.Map<String, ?> map) throws Exception {
            ObtainCredentialResponseBodyCredential self = new ObtainCredentialResponseBodyCredential();
            return TeaModel.build(map, self);
        }

        public ObtainCredentialResponseBodyCredential setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ObtainCredentialResponseBodyCredential setCredentialContent(ObtainCredentialResponseBodyCredentialCredentialContent credentialContent) {
            this.credentialContent = credentialContent;
            return this;
        }
        public ObtainCredentialResponseBodyCredentialCredentialContent getCredentialContent() {
            return this.credentialContent;
        }

        public ObtainCredentialResponseBodyCredential setCredentialCreationType(String credentialCreationType) {
            this.credentialCreationType = credentialCreationType;
            return this;
        }
        public String getCredentialCreationType() {
            return this.credentialCreationType;
        }

        public ObtainCredentialResponseBodyCredential setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public ObtainCredentialResponseBodyCredential setCredentialIdentifier(String credentialIdentifier) {
            this.credentialIdentifier = credentialIdentifier;
            return this;
        }
        public String getCredentialIdentifier() {
            return this.credentialIdentifier;
        }

        public ObtainCredentialResponseBodyCredential setCredentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }
        public String getCredentialName() {
            return this.credentialName;
        }

        public ObtainCredentialResponseBodyCredential setCredentialScenarioLabel(String credentialScenarioLabel) {
            this.credentialScenarioLabel = credentialScenarioLabel;
            return this;
        }
        public String getCredentialScenarioLabel() {
            return this.credentialScenarioLabel;
        }

        public ObtainCredentialResponseBodyCredential setCredentialSharingScope(String credentialSharingScope) {
            this.credentialSharingScope = credentialSharingScope;
            return this;
        }
        public String getCredentialSharingScope() {
            return this.credentialSharingScope;
        }

        public ObtainCredentialResponseBodyCredential setCredentialSubjectId(String credentialSubjectId) {
            this.credentialSubjectId = credentialSubjectId;
            return this;
        }
        public String getCredentialSubjectId() {
            return this.credentialSubjectId;
        }

        public ObtainCredentialResponseBodyCredential setCredentialSubjectType(String credentialSubjectType) {
            this.credentialSubjectType = credentialSubjectType;
            return this;
        }
        public String getCredentialSubjectType() {
            return this.credentialSubjectType;
        }

        public ObtainCredentialResponseBodyCredential setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public ObtainCredentialResponseBodyCredential setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ObtainCredentialResponseBodyCredential setExclusiveUserId(String exclusiveUserId) {
            this.exclusiveUserId = exclusiveUserId;
            return this;
        }
        public String getExclusiveUserId() {
            return this.exclusiveUserId;
        }

        public ObtainCredentialResponseBodyCredential setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ObtainCredentialResponseBodyCredential setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ObtainCredentialResponseBodyCredential setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
