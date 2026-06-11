// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records to retrieve at one time.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Next page token.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    /**
     * <p>Workspace list.</p>
     */
    @NameInMap("workspaces")
    public java.util.List<ListWorkspacesResponseBodyWorkspaces> workspaces;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListWorkspacesResponseBody setWorkspaces(java.util.List<ListWorkspacesResponseBodyWorkspaces> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<ListWorkspacesResponseBodyWorkspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static class ListWorkspacesResponseBodyWorkspacesPrePaidQuota extends TeaModel {
        /**
         * <p>The amount of resources that are currently allocated.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;cpu\&quot;:\&quot;1\&quot;,\&quot;memory\&quot;:\&quot;4Gi\&quot;,\&quot;cu\&quot;:\&quot;1\&quot;}</p>
         */
        @NameInMap("allocatedResource")
        public String allocatedResource;

        /**
         * <p>Whether auto-renewal is enabled for the resource.</p>
         * <ul>
         * <li><p>true: Enables auto-renewal. The resource is automatically renewed after it expires.</p>
         * </li>
         * <li><p>false: Auto-renewal is disabled. The resource is stopped upon expiration.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoRenewal")
        public Boolean autoRenewal;

        /**
         * <p>The creation time of the resource quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1745683200000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The expiration time of the resource quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1740537153000</p>
         */
        @NameInMap("expireTime")
        public Long expireTime;

        /**
         * <p>The resource instance ID that is associated with the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>i-abc12345</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The maximum amount of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;cpu\&quot;:\&quot;1\&quot;,\&quot;memory\&quot;:\&quot;4Gi\&quot;,\&quot;cu\&quot;:\&quot;1\&quot;}</p>
         */
        @NameInMap("maxResource")
        public String maxResource;

        /**
         * <p>The order ID.</p>
         */
        @NameInMap("orderId")
        public String orderId;

        /**
         * <p>The payment status of the current resource. The possible values are as follows:</p>
         * <ul>
         * <li><p>NORMAL: Active.</p>
         * </li>
         * <li><p>WAIT_FOR_EXPIRE: Will expire.</p>
         * </li>
         * <li><p>EXPIRED: The item has expired.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("paymentStatus")
        public String paymentStatus;

        /**
         * <p>The amount of resources currently in use.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;cpu\&quot;:\&quot;0\&quot;,\&quot;memory\&quot;:\&quot;0Gi\&quot;,\&quot;cu\&quot;:\&quot;0\&quot;}</p>
         */
        @NameInMap("usedResource")
        public String usedResource;

        public static ListWorkspacesResponseBodyWorkspacesPrePaidQuota build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyWorkspacesPrePaidQuota self = new ListWorkspacesResponseBodyWorkspacesPrePaidQuota();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyWorkspacesPrePaidQuota setAllocatedResource(String allocatedResource) {
            this.allocatedResource = allocatedResource;
            return this;
        }
        public String getAllocatedResource() {
            return this.allocatedResource;
        }

        public ListWorkspacesResponseBodyWorkspacesPrePaidQuota setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public ListWorkspacesResponseBodyWorkspacesPrePaidQuota setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListWorkspacesResponseBodyWorkspacesPrePaidQuota setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListWorkspacesResponseBodyWorkspacesPrePaidQuota setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListWorkspacesResponseBodyWorkspacesPrePaidQuota setMaxResource(String maxResource) {
            this.maxResource = maxResource;
            return this;
        }
        public String getMaxResource() {
            return this.maxResource;
        }

        public ListWorkspacesResponseBodyWorkspacesPrePaidQuota setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListWorkspacesResponseBodyWorkspacesPrePaidQuota setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

        public ListWorkspacesResponseBodyWorkspacesPrePaidQuota setUsedResource(String usedResource) {
            this.usedResource = usedResource;
            return this;
        }
        public String getUsedResource() {
            return this.usedResource;
        }

    }

    public static class ListWorkspacesResponseBodyWorkspacesStateChangeReason extends TeaModel {
        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("message")
        public String message;

        public static ListWorkspacesResponseBodyWorkspacesStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyWorkspacesStateChangeReason self = new ListWorkspacesResponseBodyWorkspacesStateChangeReason();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyWorkspacesStateChangeReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListWorkspacesResponseBodyWorkspacesStateChangeReason setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListWorkspacesResponseBodyWorkspacesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static ListWorkspacesResponseBodyWorkspacesTags build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyWorkspacesTags self = new ListWorkspacesResponseBodyWorkspacesTags();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyWorkspacesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListWorkspacesResponseBodyWorkspacesTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListWorkspacesResponseBodyWorkspaces extends TeaModel {
        /**
         * <p>Specifies whether to enable auto-renewal (required for the prepaid billing method).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoRenew")
        public Boolean autoRenew;

        /**
         * <p>Auto-renewal duration (Required for the prepaid billing method).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("autoRenewPeriod")
        public Integer autoRenewPeriod;

        /**
         * <p>Auto-renewal period (Required for the prepaid billing method).</p>
         * 
         * <strong>example:</strong>
         * <p>YEAR, MONTH, WEEK, DAY, HOUR, MINUTE</p>
         */
        @NameInMap("autoRenewPeriodUnit")
        public String autoRenewPeriodUnit;

        /**
         * <p>Workspace creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1684115879955</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>DLF Catalog information.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("dlfCatalogId")
        public String dlfCatalogId;

        /**
         * <p>Bind a dlf type.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("dlfType")
        public String dlfType;

        /**
         * <p>The subscription period quantity is required for the prepaid billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("duration")
        public Integer duration;

        /**
         * <p>Workspace release time.</p>
         * 
         * <strong>example:</strong>
         * <p>1687103999999</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>Failure reason.</p>
         * 
         * <strong>example:</strong>
         * <p>out of stock</p>
         */
        @NameInMap("failReason")
        public String failReason;

        /**
         * <p>The GPU specifications.</p>
         */
        @NameInMap("gpuSpec")
        public java.util.List<String> gpuSpec;

        @NameInMap("ipWhiteList")
        public java.util.List<String> ipWhiteList;

        /**
         * <p>Subscription period (Required for the prepaid billing method).</p>
         * 
         * <strong>example:</strong>
         * <p>YEAR, MONTH, WEEK, DAY, HOUR, MINUTE</p>
         */
        @NameInMap("paymentDurationUnit")
        public String paymentDurationUnit;

        /**
         * <p>Payment status.</p>
         * 
         * <strong>example:</strong>
         * <p>PAID/UNPAID</p>
         */
        @NameInMap("paymentStatus")
        public String paymentStatus;

        /**
         * <p>Billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo or Subscription</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>Information about prepaid resource quotas.</p>
         */
        @NameInMap("prePaidQuota")
        public ListWorkspacesResponseBodyWorkspacesPrePaidQuota prePaidQuota;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Workspace release reason.</p>
         * 
         * <strong>example:</strong>
         * <p>SERVICE_RELEASE</p>
         */
        @NameInMap("releaseType")
        public String releaseType;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxxxxxxxx</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Resource specification.</p>
         * 
         * <strong>example:</strong>
         * <p>100cu</p>
         */
        @NameInMap("resourceSpec")
        public String resourceSpec;

        /**
         * <p>Information about changes to the workspace status.</p>
         */
        @NameInMap("stateChangeReason")
        public ListWorkspacesResponseBodyWorkspacesStateChangeReason stateChangeReason;

        /**
         * <p>OSS path.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-result</p>
         */
        @NameInMap("storage")
        public String storage;

        /**
         * <p>The tags of the workspace.</p>
         */
        @NameInMap("tags")
        public java.util.List<ListWorkspacesResponseBodyWorkspacesTags> tags;

        /**
         * <p>Workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-******</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        /**
         * <p>Workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>Spark batch workspace-1</p>
         */
        @NameInMap("workspaceName")
        public String workspaceName;

        /**
         * <p>Workspace status.</p>
         * 
         * <strong>example:</strong>
         * <p>STARTING,RUNNING,TERMINATED</p>
         */
        @NameInMap("workspaceStatus")
        public String workspaceStatus;

        public static ListWorkspacesResponseBodyWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyWorkspaces self = new ListWorkspacesResponseBodyWorkspaces();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyWorkspaces setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public ListWorkspacesResponseBodyWorkspaces setAutoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public ListWorkspacesResponseBodyWorkspaces setAutoRenewPeriodUnit(String autoRenewPeriodUnit) {
            this.autoRenewPeriodUnit = autoRenewPeriodUnit;
            return this;
        }
        public String getAutoRenewPeriodUnit() {
            return this.autoRenewPeriodUnit;
        }

        public ListWorkspacesResponseBodyWorkspaces setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListWorkspacesResponseBodyWorkspaces setDlfCatalogId(String dlfCatalogId) {
            this.dlfCatalogId = dlfCatalogId;
            return this;
        }
        public String getDlfCatalogId() {
            return this.dlfCatalogId;
        }

        public ListWorkspacesResponseBodyWorkspaces setDlfType(String dlfType) {
            this.dlfType = dlfType;
            return this;
        }
        public String getDlfType() {
            return this.dlfType;
        }

        public ListWorkspacesResponseBodyWorkspaces setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListWorkspacesResponseBodyWorkspaces setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListWorkspacesResponseBodyWorkspaces setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public ListWorkspacesResponseBodyWorkspaces setGpuSpec(java.util.List<String> gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public java.util.List<String> getGpuSpec() {
            return this.gpuSpec;
        }

        public ListWorkspacesResponseBodyWorkspaces setIpWhiteList(java.util.List<String> ipWhiteList) {
            this.ipWhiteList = ipWhiteList;
            return this;
        }
        public java.util.List<String> getIpWhiteList() {
            return this.ipWhiteList;
        }

        public ListWorkspacesResponseBodyWorkspaces setPaymentDurationUnit(String paymentDurationUnit) {
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }
        public String getPaymentDurationUnit() {
            return this.paymentDurationUnit;
        }

        public ListWorkspacesResponseBodyWorkspaces setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

        public ListWorkspacesResponseBodyWorkspaces setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListWorkspacesResponseBodyWorkspaces setPrePaidQuota(ListWorkspacesResponseBodyWorkspacesPrePaidQuota prePaidQuota) {
            this.prePaidQuota = prePaidQuota;
            return this;
        }
        public ListWorkspacesResponseBodyWorkspacesPrePaidQuota getPrePaidQuota() {
            return this.prePaidQuota;
        }

        public ListWorkspacesResponseBodyWorkspaces setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListWorkspacesResponseBodyWorkspaces setReleaseType(String releaseType) {
            this.releaseType = releaseType;
            return this;
        }
        public String getReleaseType() {
            return this.releaseType;
        }

        public ListWorkspacesResponseBodyWorkspaces setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListWorkspacesResponseBodyWorkspaces setResourceSpec(String resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public String getResourceSpec() {
            return this.resourceSpec;
        }

        public ListWorkspacesResponseBodyWorkspaces setStateChangeReason(ListWorkspacesResponseBodyWorkspacesStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }
        public ListWorkspacesResponseBodyWorkspacesStateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        public ListWorkspacesResponseBodyWorkspaces setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public String getStorage() {
            return this.storage;
        }

        public ListWorkspacesResponseBodyWorkspaces setTags(java.util.List<ListWorkspacesResponseBodyWorkspacesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListWorkspacesResponseBodyWorkspacesTags> getTags() {
            return this.tags;
        }

        public ListWorkspacesResponseBodyWorkspaces setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListWorkspacesResponseBodyWorkspaces setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public ListWorkspacesResponseBodyWorkspaces setWorkspaceStatus(String workspaceStatus) {
            this.workspaceStatus = workspaceStatus;
            return this;
        }
        public String getWorkspaceStatus() {
            return this.workspaceStatus;
        }

    }

}
