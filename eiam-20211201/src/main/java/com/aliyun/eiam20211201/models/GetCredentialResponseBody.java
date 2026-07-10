// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCredentialResponseBody extends TeaModel {
    /**
     * <p>The credential information.</p>
     */
    @NameInMap("Credential")
    public GetCredentialResponseBodyCredential credential;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialResponseBody self = new GetCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCredentialResponseBody setCredential(GetCredentialResponseBodyCredential credential) {
        this.credential = credential;
        return this;
    }
    public GetCredentialResponseBodyCredential getCredential() {
        return this.credential;
    }

    public GetCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCredentialResponseBodyCredentialCredentialContentOAuthClientContent extends TeaModel {
        /**
         * <p>The client_id of the OAuth protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>dmvncmxersdxxxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        public static GetCredentialResponseBodyCredentialCredentialContentOAuthClientContent build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialResponseBodyCredentialCredentialContentOAuthClientContent self = new GetCredentialResponseBodyCredentialCredentialContentOAuthClientContent();
            return TeaModel.build(map, self);
        }

        public GetCredentialResponseBodyCredentialCredentialContentOAuthClientContent setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

    public static class GetCredentialResponseBodyCredentialCredentialContent extends TeaModel {
        /**
         * <p>The content of the OAuth client credential.</p>
         */
        @NameInMap("OAuthClientContent")
        public GetCredentialResponseBodyCredentialCredentialContentOAuthClientContent OAuthClientContent;

        public static GetCredentialResponseBodyCredentialCredentialContent build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialResponseBodyCredentialCredentialContent self = new GetCredentialResponseBodyCredentialCredentialContent();
            return TeaModel.build(map, self);
        }

        public GetCredentialResponseBodyCredentialCredentialContent setOAuthClientContent(GetCredentialResponseBodyCredentialCredentialContentOAuthClientContent OAuthClientContent) {
            this.OAuthClientContent = OAuthClientContent;
            return this;
        }
        public GetCredentialResponseBodyCredentialCredentialContentOAuthClientContent getOAuthClientContent() {
            return this.OAuthClientContent;
        }

    }

    public static class GetCredentialResponseBodyCredential extends TeaModel {
        /**
         * <p>The creation time, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The content of the credential.</p>
         */
        @NameInMap("CredentialContent")
        public GetCredentialResponseBodyCredentialCredentialContent credentialContent;

        /**
         * <p>The creation type of the credential. Valid values:</p>
         * <ul>
         * <li>system_init: Created by the system.</li>
         * <li>user_custom: Created by the user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        @NameInMap("CredentialCreationType")
        public String credentialCreationType;

        @NameInMap("CredentialExternalId")
        public String credentialExternalId;

        /**
         * <p>The credential ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cred_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("CredentialId")
        public String credentialId;

        /**
         * <p>The credential identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>credential_identifier_test</p>
         */
        @NameInMap("CredentialIdentifier")
        public String credentialIdentifier;

        /**
         * <p>The credential name.</p>
         * 
         * <strong>example:</strong>
         * <p>credential_name</p>
         */
        @NameInMap("CredentialName")
        public String credentialName;

        /**
         * <p>The scenarios label of the credential. Valid values:</p>
         * <ul>
         * <li>llm: Large language model.</li>
         * <li>saas: Third-party SaaS service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>llm</p>
         */
        @NameInMap("CredentialScenarioLabel")
        public String credentialScenarioLabel;

        @NameInMap("CredentialSharingScope")
        public String credentialSharingScope;

        /**
         * <p>The ID of the subject to which the credential belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>apt_werthgfdsasffxxxxx</p>
         */
        @NameInMap("CredentialSubjectId")
        public String credentialSubjectId;

        /**
         * <p>The type of the subject to which the credential belongs. Valid values:</p>
         * <ul>
         * <li>authentication_token_provider: Authentication token provider.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>authentication_token_provider</p>
         */
        @NameInMap("CredentialSubjectType")
        public String credentialSubjectType;

        /**
         * <p>The credential type. Valid values:</p>
         * <ul>
         * <li>api_key: API key credential.</li>
         * <li>oauth_client: OAuth client credential.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>api_key</p>
         */
        @NameInMap("CredentialType")
        public String credentialType;

        /**
         * <p>The credential description.</p>
         * 
         * <strong>example:</strong>
         * <p>credential_description</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("ExclusiveUserId")
        public String exclusiveUserId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The credential status. Valid values:</p>
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
         * <p>The update time, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830227000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetCredentialResponseBodyCredential build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialResponseBodyCredential self = new GetCredentialResponseBodyCredential();
            return TeaModel.build(map, self);
        }

        public GetCredentialResponseBodyCredential setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetCredentialResponseBodyCredential setCredentialContent(GetCredentialResponseBodyCredentialCredentialContent credentialContent) {
            this.credentialContent = credentialContent;
            return this;
        }
        public GetCredentialResponseBodyCredentialCredentialContent getCredentialContent() {
            return this.credentialContent;
        }

        public GetCredentialResponseBodyCredential setCredentialCreationType(String credentialCreationType) {
            this.credentialCreationType = credentialCreationType;
            return this;
        }
        public String getCredentialCreationType() {
            return this.credentialCreationType;
        }

        public GetCredentialResponseBodyCredential setCredentialExternalId(String credentialExternalId) {
            this.credentialExternalId = credentialExternalId;
            return this;
        }
        public String getCredentialExternalId() {
            return this.credentialExternalId;
        }

        public GetCredentialResponseBodyCredential setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public GetCredentialResponseBodyCredential setCredentialIdentifier(String credentialIdentifier) {
            this.credentialIdentifier = credentialIdentifier;
            return this;
        }
        public String getCredentialIdentifier() {
            return this.credentialIdentifier;
        }

        public GetCredentialResponseBodyCredential setCredentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }
        public String getCredentialName() {
            return this.credentialName;
        }

        public GetCredentialResponseBodyCredential setCredentialScenarioLabel(String credentialScenarioLabel) {
            this.credentialScenarioLabel = credentialScenarioLabel;
            return this;
        }
        public String getCredentialScenarioLabel() {
            return this.credentialScenarioLabel;
        }

        public GetCredentialResponseBodyCredential setCredentialSharingScope(String credentialSharingScope) {
            this.credentialSharingScope = credentialSharingScope;
            return this;
        }
        public String getCredentialSharingScope() {
            return this.credentialSharingScope;
        }

        public GetCredentialResponseBodyCredential setCredentialSubjectId(String credentialSubjectId) {
            this.credentialSubjectId = credentialSubjectId;
            return this;
        }
        public String getCredentialSubjectId() {
            return this.credentialSubjectId;
        }

        public GetCredentialResponseBodyCredential setCredentialSubjectType(String credentialSubjectType) {
            this.credentialSubjectType = credentialSubjectType;
            return this;
        }
        public String getCredentialSubjectType() {
            return this.credentialSubjectType;
        }

        public GetCredentialResponseBodyCredential setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public GetCredentialResponseBodyCredential setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCredentialResponseBodyCredential setExclusiveUserId(String exclusiveUserId) {
            this.exclusiveUserId = exclusiveUserId;
            return this;
        }
        public String getExclusiveUserId() {
            return this.exclusiveUserId;
        }

        public GetCredentialResponseBodyCredential setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCredentialResponseBodyCredential setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCredentialResponseBodyCredential setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
