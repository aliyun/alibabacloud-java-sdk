// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCredentialsResponseBody extends TeaModel {
    /**
     * <p>A list of credentials.</p>
     */
    @NameInMap("Credentials")
    public java.util.List<ListCredentialsResponseBodyCredentials> credentials;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. If this parameter is not returned, it indicates all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsResponseBody self = new ListCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCredentialsResponseBody setCredentials(java.util.List<ListCredentialsResponseBodyCredentials> credentials) {
        this.credentials = credentials;
        return this;
    }
    public java.util.List<ListCredentialsResponseBodyCredentials> getCredentials() {
        return this.credentials;
    }

    public ListCredentialsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCredentialsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCredentialsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCredentialsResponseBodyCredentialsCredentialContentOAuthClientContent extends TeaModel {
        /**
         * <p>The client ID of the OAuth client.</p>
         * 
         * <strong>example:</strong>
         * <p>dmvncmxersdxxxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        public static ListCredentialsResponseBodyCredentialsCredentialContentOAuthClientContent build(java.util.Map<String, ?> map) throws Exception {
            ListCredentialsResponseBodyCredentialsCredentialContentOAuthClientContent self = new ListCredentialsResponseBodyCredentialsCredentialContentOAuthClientContent();
            return TeaModel.build(map, self);
        }

        public ListCredentialsResponseBodyCredentialsCredentialContentOAuthClientContent setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

    public static class ListCredentialsResponseBodyCredentialsCredentialContent extends TeaModel {
        /**
         * <p>The content of an OAuth client credential.</p>
         */
        @NameInMap("OAuthClientContent")
        public ListCredentialsResponseBodyCredentialsCredentialContentOAuthClientContent OAuthClientContent;

        public static ListCredentialsResponseBodyCredentialsCredentialContent build(java.util.Map<String, ?> map) throws Exception {
            ListCredentialsResponseBodyCredentialsCredentialContent self = new ListCredentialsResponseBodyCredentialsCredentialContent();
            return TeaModel.build(map, self);
        }

        public ListCredentialsResponseBodyCredentialsCredentialContent setOAuthClientContent(ListCredentialsResponseBodyCredentialsCredentialContentOAuthClientContent OAuthClientContent) {
            this.OAuthClientContent = OAuthClientContent;
            return this;
        }
        public ListCredentialsResponseBodyCredentialsCredentialContentOAuthClientContent getOAuthClientContent() {
            return this.OAuthClientContent;
        }

    }

    public static class ListCredentialsResponseBodyCredentials extends TeaModel {
        /**
         * <p>The time the credential was created, provided as a Unix timestamp in milliseconds.</p>
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
        public ListCredentialsResponseBodyCredentialsCredentialContent credentialContent;

        /**
         * <p>The creation type of the credential. Valid values:</p>
         * <ul>
         * <li><p><code>system_init</code>: Created by the system.</p>
         * </li>
         * <li><p><code>user_custom</code>: Created by a user.</p>
         * </li>
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
         * <p>The ID of the credential.</p>
         * 
         * <strong>example:</strong>
         * <p>cred_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("CredentialId")
        public String credentialId;

        /**
         * <p>The identifier of the credential.</p>
         * 
         * <strong>example:</strong>
         * <p>credential_identifier_test</p>
         */
        @NameInMap("CredentialIdentifier")
        public String credentialIdentifier;

        /**
         * <p>The name of the credential.</p>
         * 
         * <strong>example:</strong>
         * <p>credential_name</p>
         */
        @NameInMap("CredentialName")
        public String credentialName;

        /**
         * <p>The use case label for the credential. Valid values:</p>
         * <ul>
         * <li><p><code>llm</code>: A large language model.</p>
         * </li>
         * <li><p><code>saas</code>: A third-party SaaS service.</p>
         * </li>
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
         * <p>The ID of the credential\&quot;s subject.</p>
         * 
         * <strong>example:</strong>
         * <p>apt_werthgfdsasffxxxxx</p>
         */
        @NameInMap("CredentialSubjectId")
        public String credentialSubjectId;

        /**
         * <p>The type of the credential\&quot;s subject. Valid value:</p>
         * <ul>
         * <li><code>authentication_token_provider</code>: An authentication token provider.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>authentication_token_provider</p>
         */
        @NameInMap("CredentialSubjectType")
        public String credentialSubjectType;

        /**
         * <p>The type of the credential. Valid values:</p>
         * <ul>
         * <li><p><code>api_key</code>: An API key.</p>
         * </li>
         * <li><p><code>oauth_client</code>: An OAuth client.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>api_key</p>
         */
        @NameInMap("CredentialType")
        public String credentialType;

        /**
         * <p>The description of the credential.</p>
         * 
         * <strong>example:</strong>
         * <p>credential_description</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("ExclusiveUserId")
        public String exclusiveUserId;

        /**
         * <p>The ID of the EIAM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the credential. Valid values:</p>
         * <ul>
         * <li><p><code>enabled</code>: The credential is enabled.</p>
         * </li>
         * <li><p><code>disabled</code>: The credential is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time the credential was last updated, provided as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830227000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListCredentialsResponseBodyCredentials build(java.util.Map<String, ?> map) throws Exception {
            ListCredentialsResponseBodyCredentials self = new ListCredentialsResponseBodyCredentials();
            return TeaModel.build(map, self);
        }

        public ListCredentialsResponseBodyCredentials setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCredentialsResponseBodyCredentials setCredentialContent(ListCredentialsResponseBodyCredentialsCredentialContent credentialContent) {
            this.credentialContent = credentialContent;
            return this;
        }
        public ListCredentialsResponseBodyCredentialsCredentialContent getCredentialContent() {
            return this.credentialContent;
        }

        public ListCredentialsResponseBodyCredentials setCredentialCreationType(String credentialCreationType) {
            this.credentialCreationType = credentialCreationType;
            return this;
        }
        public String getCredentialCreationType() {
            return this.credentialCreationType;
        }

        public ListCredentialsResponseBodyCredentials setCredentialExternalId(String credentialExternalId) {
            this.credentialExternalId = credentialExternalId;
            return this;
        }
        public String getCredentialExternalId() {
            return this.credentialExternalId;
        }

        public ListCredentialsResponseBodyCredentials setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public ListCredentialsResponseBodyCredentials setCredentialIdentifier(String credentialIdentifier) {
            this.credentialIdentifier = credentialIdentifier;
            return this;
        }
        public String getCredentialIdentifier() {
            return this.credentialIdentifier;
        }

        public ListCredentialsResponseBodyCredentials setCredentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }
        public String getCredentialName() {
            return this.credentialName;
        }

        public ListCredentialsResponseBodyCredentials setCredentialScenarioLabel(String credentialScenarioLabel) {
            this.credentialScenarioLabel = credentialScenarioLabel;
            return this;
        }
        public String getCredentialScenarioLabel() {
            return this.credentialScenarioLabel;
        }

        public ListCredentialsResponseBodyCredentials setCredentialSharingScope(String credentialSharingScope) {
            this.credentialSharingScope = credentialSharingScope;
            return this;
        }
        public String getCredentialSharingScope() {
            return this.credentialSharingScope;
        }

        public ListCredentialsResponseBodyCredentials setCredentialSubjectId(String credentialSubjectId) {
            this.credentialSubjectId = credentialSubjectId;
            return this;
        }
        public String getCredentialSubjectId() {
            return this.credentialSubjectId;
        }

        public ListCredentialsResponseBodyCredentials setCredentialSubjectType(String credentialSubjectType) {
            this.credentialSubjectType = credentialSubjectType;
            return this;
        }
        public String getCredentialSubjectType() {
            return this.credentialSubjectType;
        }

        public ListCredentialsResponseBodyCredentials setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public ListCredentialsResponseBodyCredentials setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCredentialsResponseBodyCredentials setExclusiveUserId(String exclusiveUserId) {
            this.exclusiveUserId = exclusiveUserId;
            return this;
        }
        public String getExclusiveUserId() {
            return this.exclusiveUserId;
        }

        public ListCredentialsResponseBodyCredentials setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCredentialsResponseBodyCredentials setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCredentialsResponseBodyCredentials setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
