// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainCredentialResponseBody extends TeaModel {
    /**
     * <p>云角色创建时间</p>
     * 
     * <strong>example:</strong>
     * <p>1649830225000</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>凭据的内容。</p>
     */
    @NameInMap("credentialContent")
    public ObtainCredentialResponseBodyCredentialContent credentialContent;

    /**
     * <p>凭据的创建类型。</p>
     * 
     * <strong>example:</strong>
     * <p>user_custom</p>
     */
    @NameInMap("credentialCreationType")
    public String credentialCreationType;

    /**
     * <p>凭据ID。</p>
     * 
     * <strong>example:</strong>
     * <p>cred_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("credentialId")
    public String credentialId;

    /**
     * <p>凭据标识</p>
     * 
     * <strong>example:</strong>
     * <p>credential_identifier_test</p>
     */
    @NameInMap("credentialIdentifier")
    public String credentialIdentifier;

    /**
     * <p>凭据名称</p>
     * 
     * <strong>example:</strong>
     * <p>credential_name</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <p>凭据的使用场景标签。</p>
     * 
     * <strong>example:</strong>
     * <p>llm</p>
     */
    @NameInMap("credentialScenarioLabel")
    public String credentialScenarioLabel;

    /**
     * <p>凭据所属的主体ID。</p>
     * 
     * <strong>example:</strong>
     * <p>apt_werthgfdsasffxxxxx</p>
     */
    @NameInMap("credentialSubjectId")
    public String credentialSubjectId;

    /**
     * <p>凭据所属的主体类型。</p>
     * 
     * <strong>example:</strong>
     * <p>authentication_token_provider</p>
     */
    @NameInMap("credentialSubjectType")
    public String credentialSubjectType;

    /**
     * <p>凭据类型。</p>
     * 
     * <strong>example:</strong>
     * <p>api_key</p>
     */
    @NameInMap("credentialType")
    public String credentialType;

    /**
     * <p>描述</p>
     * 
     * <strong>example:</strong>
     * <p>credential_description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>EIAM实例ID。</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>凭据状态</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>云角色更新时间</p>
     * 
     * <strong>example:</strong>
     * <p>1649830227000</p>
     */
    @NameInMap("updateTime")
    public Long updateTime;

    public static ObtainCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ObtainCredentialResponseBody self = new ObtainCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public ObtainCredentialResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ObtainCredentialResponseBody setCredentialContent(ObtainCredentialResponseBodyCredentialContent credentialContent) {
        this.credentialContent = credentialContent;
        return this;
    }
    public ObtainCredentialResponseBodyCredentialContent getCredentialContent() {
        return this.credentialContent;
    }

    public ObtainCredentialResponseBody setCredentialCreationType(String credentialCreationType) {
        this.credentialCreationType = credentialCreationType;
        return this;
    }
    public String getCredentialCreationType() {
        return this.credentialCreationType;
    }

    public ObtainCredentialResponseBody setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public ObtainCredentialResponseBody setCredentialIdentifier(String credentialIdentifier) {
        this.credentialIdentifier = credentialIdentifier;
        return this;
    }
    public String getCredentialIdentifier() {
        return this.credentialIdentifier;
    }

    public ObtainCredentialResponseBody setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public ObtainCredentialResponseBody setCredentialScenarioLabel(String credentialScenarioLabel) {
        this.credentialScenarioLabel = credentialScenarioLabel;
        return this;
    }
    public String getCredentialScenarioLabel() {
        return this.credentialScenarioLabel;
    }

    public ObtainCredentialResponseBody setCredentialSubjectId(String credentialSubjectId) {
        this.credentialSubjectId = credentialSubjectId;
        return this;
    }
    public String getCredentialSubjectId() {
        return this.credentialSubjectId;
    }

    public ObtainCredentialResponseBody setCredentialSubjectType(String credentialSubjectType) {
        this.credentialSubjectType = credentialSubjectType;
        return this;
    }
    public String getCredentialSubjectType() {
        return this.credentialSubjectType;
    }

    public ObtainCredentialResponseBody setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public ObtainCredentialResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ObtainCredentialResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ObtainCredentialResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ObtainCredentialResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static class ObtainCredentialResponseBodyCredentialContentApiKeyContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>nsklncmwizncxxxx</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        public static ObtainCredentialResponseBodyCredentialContentApiKeyContent build(java.util.Map<String, ?> map) throws Exception {
            ObtainCredentialResponseBodyCredentialContentApiKeyContent self = new ObtainCredentialResponseBodyCredentialContentApiKeyContent();
            return TeaModel.build(map, self);
        }

        public ObtainCredentialResponseBodyCredentialContentApiKeyContent setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

    }

    public static class ObtainCredentialResponseBodyCredentialContentOauthClientContent extends TeaModel {
        /**
         * <p>OAuth协议的client_id</p>
         * 
         * <strong>example:</strong>
         * <p>dmvncmxersdxxxxxx</p>
         */
        @NameInMap("clientId")
        public String clientId;

        /**
         * <strong>example:</strong>
         * <p>nsklnertyt5ddwizncxxxx</p>
         */
        @NameInMap("clientSecret")
        public String clientSecret;

        public static ObtainCredentialResponseBodyCredentialContentOauthClientContent build(java.util.Map<String, ?> map) throws Exception {
            ObtainCredentialResponseBodyCredentialContentOauthClientContent self = new ObtainCredentialResponseBodyCredentialContentOauthClientContent();
            return TeaModel.build(map, self);
        }

        public ObtainCredentialResponseBodyCredentialContentOauthClientContent setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ObtainCredentialResponseBodyCredentialContentOauthClientContent setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class ObtainCredentialResponseBodyCredentialContent extends TeaModel {
        @NameInMap("apiKeyContent")
        public ObtainCredentialResponseBodyCredentialContentApiKeyContent apiKeyContent;

        /**
         * <p>OAuth客户端认证凭证类型的凭据内容。</p>
         */
        @NameInMap("oauthClientContent")
        public ObtainCredentialResponseBodyCredentialContentOauthClientContent oauthClientContent;

        public static ObtainCredentialResponseBodyCredentialContent build(java.util.Map<String, ?> map) throws Exception {
            ObtainCredentialResponseBodyCredentialContent self = new ObtainCredentialResponseBodyCredentialContent();
            return TeaModel.build(map, self);
        }

        public ObtainCredentialResponseBodyCredentialContent setApiKeyContent(ObtainCredentialResponseBodyCredentialContentApiKeyContent apiKeyContent) {
            this.apiKeyContent = apiKeyContent;
            return this;
        }
        public ObtainCredentialResponseBodyCredentialContentApiKeyContent getApiKeyContent() {
            return this.apiKeyContent;
        }

        public ObtainCredentialResponseBodyCredentialContent setOauthClientContent(ObtainCredentialResponseBodyCredentialContentOauthClientContent oauthClientContent) {
            this.oauthClientContent = oauthClientContent;
            return this;
        }
        public ObtainCredentialResponseBodyCredentialContentOauthClientContent getOauthClientContent() {
            return this.oauthClientContent;
        }

    }

}
