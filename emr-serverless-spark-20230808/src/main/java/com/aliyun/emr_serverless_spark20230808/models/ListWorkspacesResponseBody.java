// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    /**
     * <p>The queried workspaces.</p>
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
         * <p>The amount of resources that are allocated by a subscription quota.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;cpu\&quot;:\&quot;1\&quot;,\&quot;memory\&quot;:\&quot;4Gi\&quot;,\&quot;cu\&quot;:\&quot;1\&quot;}</p>
         */
        @NameInMap("allocatedResource")
        public String allocatedResource;

        /**
         * <p>Indicates whether auto-renewal is enabled for the subscription quota.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoRenewal")
        public Boolean autoRenewal;

        /**
         * <p>The creation time of the subscription quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1745683200000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The expiration time of the subscription quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1740537153000</p>
         */
        @NameInMap("expireTime")
        public Long expireTime;

        /**
         * <p>The ID of the instance that is generated when you purchase the subscription quota.</p>
         * 
         * <strong>example:</strong>
         * <p>i-abc12345</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The maximum amount of resources that can be used in a subscription quota.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;cpu\&quot;:\&quot;1\&quot;,\&quot;memory\&quot;:\&quot;4Gi\&quot;,\&quot;cu\&quot;:\&quot;1\&quot;}</p>
         */
        @NameInMap("maxResource")
        public String maxResource;

        @NameInMap("orderId")
        public String orderId;

        /**
         * <p>The status of the subscription quota. Valid values:</p>
         * <ul>
         * <li>NORMAL</li>
         * <li>WAIT_FOR_EXPIRE</li>
         * <li>EXPIRED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("paymentStatus")
        public String paymentStatus;

        /**
         * <p>The amount of resources that are used.</p>
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The error message.</p>
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
        @NameInMap("tagKey")
        public String tagKey;

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
         * <p>Specifies whether to enable auto-renewal. This parameter is required only if the paymentType parameter is set to Pre.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoRenew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal duration. This parameter is required only if the paymentType parameter is set to Pre.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("autoRenewPeriod")
        public Integer autoRenewPeriod;

        /**
         * <p>The unit of the auto-renewal duration. This parameter is required only if the paymentType parameter is set to Pre.</p>
         * 
         * <strong>example:</strong>
         * <p>YEAR, MONTH, WEEK, DAY, HOUR, MINUTE</p>
         */
        @NameInMap("autoRenewPeriodUnit")
        public String autoRenewPeriodUnit;

        /**
         * <p>The time when the workflow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1684115879955</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The information of the Data Lake Formation (DLF) catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("dlfCatalogId")
        public String dlfCatalogId;

        /**
         * <p>The version of DLF.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("dlfType")
        public String dlfType;

        /**
         * <p>The subscription period. This parameter is required only if the paymentType parameter is set to Pre.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("duration")
        public Integer duration;

        /**
         * <p>The end of the end time range.</p>
         * 
         * <strong>example:</strong>
         * <p>1687103999999</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The failure reason.</p>
         * 
         * <strong>example:</strong>
         * <p>out of stock</p>
         */
        @NameInMap("failReason")
        public String failReason;

        /**
         * <p>The unit of the subscription duration.</p>
         * 
         * <strong>example:</strong>
         * <p>YEAR, MONTH, WEEK, DAY, HOUR, MINUTE</p>
         */
        @NameInMap("paymentDurationUnit")
        public String paymentDurationUnit;

        /**
         * <p>The status of the payment.</p>
         * 
         * <strong>example:</strong>
         * <p>PAID/UNPAID</p>
         */
        @NameInMap("paymentStatus")
        public String paymentStatus;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PayAsYouGo</li>
         * <li>Pre</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The information about the subscription quota.</p>
         */
        @NameInMap("prePaidQuota")
        public ListWorkspacesResponseBodyWorkspacesPrePaidQuota prePaidQuota;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The reason why the workspace is released.</p>
         * 
         * <strong>example:</strong>
         * <p>SERVICE_RELEASE</p>
         */
        @NameInMap("releaseType")
        public String releaseType;

        /**
         * <p>The resource specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>100cu</p>
         */
        @NameInMap("resourceSpec")
        public String resourceSpec;

        /**
         * <p>The reason of the job status change.</p>
         */
        @NameInMap("stateChangeReason")
        public ListWorkspacesResponseBodyWorkspacesStateChangeReason stateChangeReason;

        /**
         * <p>The OSS path.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-result</p>
         */
        @NameInMap("storage")
        public String storage;

        @NameInMap("tags")
        public java.util.List<ListWorkspacesResponseBodyWorkspacesTags> tags;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-******</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-1</p>
         */
        @NameInMap("workspaceName")
        public String workspaceName;

        /**
         * <p>The workspace status.</p>
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
