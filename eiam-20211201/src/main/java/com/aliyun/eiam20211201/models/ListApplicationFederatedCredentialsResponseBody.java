// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationFederatedCredentialsResponseBody extends TeaModel {
    @NameInMap("ApplicationFederatedCredentials")
    public java.util.List<ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials> applicationFederatedCredentials;

    /**
     * <p>分页查询时每页行数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于上一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApplicationFederatedCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationFederatedCredentialsResponseBody self = new ListApplicationFederatedCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationFederatedCredentialsResponseBody setApplicationFederatedCredentials(java.util.List<ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials> applicationFederatedCredentials) {
        this.applicationFederatedCredentials = applicationFederatedCredentials;
        return this;
    }
    public java.util.List<ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials> getApplicationFederatedCredentials() {
        return this.applicationFederatedCredentials;
    }

    public ListApplicationFederatedCredentialsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationFederatedCredentialsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationFederatedCredentialsResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListApplicationFederatedCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationFederatedCredentialsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials extends TeaModel {
        /**
         * <p>应用联邦凭证ID</p>
         * 
         * <strong>example:</strong>
         * <p>afc_adsa1sdaxxxxx</p>
         */
        @NameInMap("ApplicationFederatedCredentialId")
        public String applicationFederatedCredentialId;

        /**
         * <p>应用联邦凭证名称</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApplicationFederatedCredentialName")
        public String applicationFederatedCredentialName;

        /**
         * <p>应用联邦凭证类型</p>
         * 
         * <strong>example:</strong>
         * <p>oidc</p>
         */
        @NameInMap("ApplicationFederatedCredentialType")
        public String applicationFederatedCredentialType;

        /**
         * <p>应用ID</p>
         * 
         * <strong>example:</strong>
         * <p>app_xxxasda1</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>应用联邦凭证描述</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>应用联邦凭证提供者ID</p>
         * 
         * <strong>example:</strong>
         * <p>fcp_das1asda1xxxx</p>
         */
        @NameInMap("FederatedCredentialProviderId")
        public String federatedCredentialProviderId;

        /**
         * <p>EAIM 实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>最近使用时间</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>应用联邦凭证状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials self = new ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setApplicationFederatedCredentialId(String applicationFederatedCredentialId) {
            this.applicationFederatedCredentialId = applicationFederatedCredentialId;
            return this;
        }
        public String getApplicationFederatedCredentialId() {
            return this.applicationFederatedCredentialId;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setApplicationFederatedCredentialName(String applicationFederatedCredentialName) {
            this.applicationFederatedCredentialName = applicationFederatedCredentialName;
            return this;
        }
        public String getApplicationFederatedCredentialName() {
            return this.applicationFederatedCredentialName;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setApplicationFederatedCredentialType(String applicationFederatedCredentialType) {
            this.applicationFederatedCredentialType = applicationFederatedCredentialType;
            return this;
        }
        public String getApplicationFederatedCredentialType() {
            return this.applicationFederatedCredentialType;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setFederatedCredentialProviderId(String federatedCredentialProviderId) {
            this.federatedCredentialProviderId = federatedCredentialProviderId;
            return this;
        }
        public String getFederatedCredentialProviderId() {
            return this.federatedCredentialProviderId;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
