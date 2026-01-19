// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountsResponseBody extends TeaModel {
    @NameInMap("CloudAccounts")
    public java.util.List<ListCloudAccountsResponseBodyCloudAccounts> cloudAccounts;

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
    public Integer totalCount;

    public static ListCloudAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccountsResponseBody self = new ListCloudAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudAccountsResponseBody setCloudAccounts(java.util.List<ListCloudAccountsResponseBodyCloudAccounts> cloudAccounts) {
        this.cloudAccounts = cloudAccounts;
        return this;
    }
    public java.util.List<ListCloudAccountsResponseBodyCloudAccounts> getCloudAccounts() {
        return this.cloudAccounts;
    }

    public ListCloudAccountsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCloudAccountsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCloudAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudAccountsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResultErrorReason extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AuthenticationFail.NoPermission</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>There is no permission.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResultErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResultErrorReason self = new ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResultErrorReason();
            return TeaModel.build(map, self);
        }

        public ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResultErrorReason setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResultErrorReason setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResult extends TeaModel {
        @NameInMap("ErrorReason")
        public ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResultErrorReason errorReason;

        /**
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("LastCheckTime")
        public Long lastCheckTime;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Result")
        public String result;

        public static ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResult build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResult self = new ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResult();
            return TeaModel.build(map, self);
        }

        public ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResult setErrorReason(ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResultErrorReason errorReason) {
            this.errorReason = errorReason;
            return this;
        }
        public ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResultErrorReason getErrorReason() {
            return this.errorReason;
        }

        public ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResult setLastCheckTime(Long lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public Long getLastCheckTime() {
            return this.lastCheckTime;
        }

        public ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class ListCloudAccountsResponseBodyCloudAccounts extends TeaModel {
        /**
         * <p>云账号外部唯一ID</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("CloudAccountExternalId")
        public String cloudAccountExternalId;

        /**
         * <p>云账号可用性</p>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("CloudAccountHealth")
        public String cloudAccountHealth;

        @NameInMap("CloudAccountHealthCheckResult")
        public ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResult cloudAccountHealthCheckResult;

        /**
         * <p>云账号ID</p>
         * 
         * <strong>example:</strong>
         * <p>ca_01kmegjc11qa1txxxxx</p>
         */
        @NameInMap("CloudAccountId")
        public String cloudAccountId;

        /**
         * <p>云账号名称</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_accout_xxxx</p>
         */
        @NameInMap("CloudAccountName")
        public String cloudAccountName;

        /**
         * <p>云账号提供商名称</p>
         * 
         * <strong>example:</strong>
         * <p>idaas-eiam-oidc-provider</p>
         */
        @NameInMap("CloudAccountProviderName")
        public String cloudAccountProviderName;

        /**
         * <p>云账号类别</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("CloudAccountVendorType")
        public String cloudAccountVendorType;

        /**
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>云账号描述</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_accout_description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1649830227000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListCloudAccountsResponseBodyCloudAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccountsResponseBodyCloudAccounts self = new ListCloudAccountsResponseBodyCloudAccounts();
            return TeaModel.build(map, self);
        }

        public ListCloudAccountsResponseBodyCloudAccounts setCloudAccountExternalId(String cloudAccountExternalId) {
            this.cloudAccountExternalId = cloudAccountExternalId;
            return this;
        }
        public String getCloudAccountExternalId() {
            return this.cloudAccountExternalId;
        }

        public ListCloudAccountsResponseBodyCloudAccounts setCloudAccountHealth(String cloudAccountHealth) {
            this.cloudAccountHealth = cloudAccountHealth;
            return this;
        }
        public String getCloudAccountHealth() {
            return this.cloudAccountHealth;
        }

        public ListCloudAccountsResponseBodyCloudAccounts setCloudAccountHealthCheckResult(ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResult cloudAccountHealthCheckResult) {
            this.cloudAccountHealthCheckResult = cloudAccountHealthCheckResult;
            return this;
        }
        public ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResult getCloudAccountHealthCheckResult() {
            return this.cloudAccountHealthCheckResult;
        }

        public ListCloudAccountsResponseBodyCloudAccounts setCloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        public ListCloudAccountsResponseBodyCloudAccounts setCloudAccountName(String cloudAccountName) {
            this.cloudAccountName = cloudAccountName;
            return this;
        }
        public String getCloudAccountName() {
            return this.cloudAccountName;
        }

        public ListCloudAccountsResponseBodyCloudAccounts setCloudAccountProviderName(String cloudAccountProviderName) {
            this.cloudAccountProviderName = cloudAccountProviderName;
            return this;
        }
        public String getCloudAccountProviderName() {
            return this.cloudAccountProviderName;
        }

        public ListCloudAccountsResponseBodyCloudAccounts setCloudAccountVendorType(String cloudAccountVendorType) {
            this.cloudAccountVendorType = cloudAccountVendorType;
            return this;
        }
        public String getCloudAccountVendorType() {
            return this.cloudAccountVendorType;
        }

        public ListCloudAccountsResponseBodyCloudAccounts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCloudAccountsResponseBodyCloudAccounts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCloudAccountsResponseBodyCloudAccounts setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCloudAccountsResponseBodyCloudAccounts setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
