// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationFederatedCredentialsForProviderResponseBody extends TeaModel {
    /**
     * <p>The list of application federated credentials.</p>
     */
    @NameInMap("ApplicationFederatedCredentials")
    public java.util.List<ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials> applicationFederatedCredentials;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The query token returned by this call.</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <p>The request ID.</p>
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
    public Integer totalCount;

    public static ListApplicationFederatedCredentialsForProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationFederatedCredentialsForProviderResponseBody self = new ListApplicationFederatedCredentialsForProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationFederatedCredentialsForProviderResponseBody setApplicationFederatedCredentials(java.util.List<ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials> applicationFederatedCredentials) {
        this.applicationFederatedCredentials = applicationFederatedCredentials;
        return this;
    }
    public java.util.List<ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials> getApplicationFederatedCredentials() {
        return this.applicationFederatedCredentials;
    }

    public ListApplicationFederatedCredentialsForProviderResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationFederatedCredentialsForProviderResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationFederatedCredentialsForProviderResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListApplicationFederatedCredentialsForProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationFederatedCredentialsForProviderResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials extends TeaModel {
        /**
         * <p>The application federated credential ID.</p>
         * 
         * <strong>example:</strong>
         * <p>afc_dads12sadxxxxx</p>
         */
        @NameInMap("ApplicationFederatedCredentialId")
        public String applicationFederatedCredentialId;

        /**
         * <p>The name of the application federated credential.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApplicationFederatedCredentialName")
        public String applicationFederatedCredentialName;

        /**
         * <p>The type of the application federated credential.</p>
         * 
         * <strong>example:</strong>
         * <p>oidc</p>
         */
        @NameInMap("ApplicationFederatedCredentialType")
        public String applicationFederatedCredentialType;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app_asda1dsadxxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The time when the credential was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the application federated credential.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The federated credential provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fcp_adasd12dxxxxx</p>
         */
        @NameInMap("FederatedCredentialProviderId")
        public String federatedCredentialProviderId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the credential was last used.</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>The status of the application federated credential.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the credential was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials self = new ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setApplicationFederatedCredentialId(String applicationFederatedCredentialId) {
            this.applicationFederatedCredentialId = applicationFederatedCredentialId;
            return this;
        }
        public String getApplicationFederatedCredentialId() {
            return this.applicationFederatedCredentialId;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setApplicationFederatedCredentialName(String applicationFederatedCredentialName) {
            this.applicationFederatedCredentialName = applicationFederatedCredentialName;
            return this;
        }
        public String getApplicationFederatedCredentialName() {
            return this.applicationFederatedCredentialName;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setApplicationFederatedCredentialType(String applicationFederatedCredentialType) {
            this.applicationFederatedCredentialType = applicationFederatedCredentialType;
            return this;
        }
        public String getApplicationFederatedCredentialType() {
            return this.applicationFederatedCredentialType;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setFederatedCredentialProviderId(String federatedCredentialProviderId) {
            this.federatedCredentialProviderId = federatedCredentialProviderId;
            return this;
        }
        public String getFederatedCredentialProviderId() {
            return this.federatedCredentialProviderId;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
