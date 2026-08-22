// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountsResponseBody extends TeaModel {
    /**
     * <p>The list of cloud accounts.</p>
     */
    @NameInMap("CloudAccounts")
    public java.util.List<ListCloudAccountsResponseBodyCloudAccounts> cloudAccounts;

    /**
     * <p>The maximum number of entries per page for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token returned for the current call.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>AuthenticationFail.NoPermission</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error description.</p>
         * 
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
        /**
         * <p>The error reason. This field is returned when the health check status is unhealthy.</p>
         */
        @NameInMap("ErrorReason")
        public ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResultErrorReason errorReason;

        /**
         * <p>The last check time, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("LastCheckTime")
        public Long lastCheckTime;

        /**
         * <p>The health check result of the cloud account. Valid values:</p>
         * <ul>
         * <li>success: Succeeded.</li>
         * <li>failed: Failed.</li>
         * </ul>
         * 
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

    public static class ListCloudAccountsResponseBodyCloudAccountsPrivilegeHostingError extends TeaModel {
        /**
         * <p>The failure error code.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The failure message.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static ListCloudAccountsResponseBodyCloudAccountsPrivilegeHostingError build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccountsResponseBodyCloudAccountsPrivilegeHostingError self = new ListCloudAccountsResponseBodyCloudAccountsPrivilegeHostingError();
            return TeaModel.build(map, self);
        }

        public ListCloudAccountsResponseBodyCloudAccountsPrivilegeHostingError setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListCloudAccountsResponseBodyCloudAccountsPrivilegeHostingError setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class ListCloudAccountsResponseBodyCloudAccounts extends TeaModel {
        /**
         * <p>The external unique identifier of the cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("CloudAccountExternalId")
        public String cloudAccountExternalId;

        /**
         * <p>The health status of the cloud account. Valid values:</p>
         * <ul>
         * <li>healthy: Healthy.</li>
         * <li>unhealthy: Unhealthy.</li>
         * <li>unknown: Unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("CloudAccountHealth")
        public String cloudAccountHealth;

        /**
         * <p>The health check result of the cloud account.</p>
         */
        @NameInMap("CloudAccountHealthCheckResult")
        public ListCloudAccountsResponseBodyCloudAccountsCloudAccountHealthCheckResult cloudAccountHealthCheckResult;

        /**
         * <p>The cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca_01kmegjc11qa1txxxxx</p>
         */
        @NameInMap("CloudAccountId")
        public String cloudAccountId;

        /**
         * <p>The cloud account name.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_accout_xxxx</p>
         */
        @NameInMap("CloudAccountName")
        public String cloudAccountName;

        /**
         * <p>The identity provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas-eiam-oidc-provider</p>
         */
        @NameInMap("CloudAccountProviderName")
        public String cloudAccountProviderName;

        /**
         * <p>The cloud account site.</p>
         */
        @NameInMap("CloudAccountSite")
        public String cloudAccountSite;

        /**
         * <p>The cloud account type. Valid values:</p>
         * <ul>
         * <li>alibaba_cloud: Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("CloudAccountVendorType")
        public String cloudAccountVendorType;

        /**
         * <p>The creation time, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The cloud account description.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_accout_description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The list of associated privileged access application IDs.</p>
         */
        @NameInMap("PrivilegeApplicationIds")
        public java.util.List<String> privilegeApplicationIds;

        /**
         * <p>The reason for the privilege hosting or removal failure.</p>
         */
        @NameInMap("PrivilegeHostingError")
        public ListCloudAccountsResponseBodyCloudAccountsPrivilegeHostingError privilegeHostingError;

        /**
         * <p>The privilege hosting state, which indicates whether the account has privileged access capabilities.</p>
         */
        @NameInMap("PrivilegeHostingState")
        public String privilegeHostingState;

        /**
         * <p>The privilege switch status, which indicates whether the privileged access capability is available.</p>
         */
        @NameInMap("PrivilegeStatus")
        public String privilegeStatus;

        /**
         * <p>The last update time, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
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

        public ListCloudAccountsResponseBodyCloudAccounts setCloudAccountSite(String cloudAccountSite) {
            this.cloudAccountSite = cloudAccountSite;
            return this;
        }
        public String getCloudAccountSite() {
            return this.cloudAccountSite;
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

        public ListCloudAccountsResponseBodyCloudAccounts setPrivilegeApplicationIds(java.util.List<String> privilegeApplicationIds) {
            this.privilegeApplicationIds = privilegeApplicationIds;
            return this;
        }
        public java.util.List<String> getPrivilegeApplicationIds() {
            return this.privilegeApplicationIds;
        }

        public ListCloudAccountsResponseBodyCloudAccounts setPrivilegeHostingError(ListCloudAccountsResponseBodyCloudAccountsPrivilegeHostingError privilegeHostingError) {
            this.privilegeHostingError = privilegeHostingError;
            return this;
        }
        public ListCloudAccountsResponseBodyCloudAccountsPrivilegeHostingError getPrivilegeHostingError() {
            return this.privilegeHostingError;
        }

        public ListCloudAccountsResponseBodyCloudAccounts setPrivilegeHostingState(String privilegeHostingState) {
            this.privilegeHostingState = privilegeHostingState;
            return this;
        }
        public String getPrivilegeHostingState() {
            return this.privilegeHostingState;
        }

        public ListCloudAccountsResponseBodyCloudAccounts setPrivilegeStatus(String privilegeStatus) {
            this.privilegeStatus = privilegeStatus;
            return this;
        }
        public String getPrivilegeStatus() {
            return this.privilegeStatus;
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
