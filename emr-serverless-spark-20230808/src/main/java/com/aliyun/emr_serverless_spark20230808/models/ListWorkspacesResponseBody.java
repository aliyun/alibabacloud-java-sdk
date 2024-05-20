// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    /**
     * <p>一次获取的最大记录数。</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>下一页TOKEN。</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>记录总数。</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

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

    public static class ListWorkspacesResponseBodyWorkspacesStateChangeReason extends TeaModel {
        @NameInMap("code")
        public String code;

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

    public static class ListWorkspacesResponseBodyWorkspaces extends TeaModel {
        /**
         * <p>是否自动续费(pre付费类型必须)。</p>
         */
        @NameInMap("autoRenew")
        public Boolean autoRenew;

        /**
         * <p>自动续费时长(pre付费类型必须)。</p>
         */
        @NameInMap("autoRenewPeriod")
        public Integer autoRenewPeriod;

        /**
         * <p>自动续费周期(pre付费类型必须)。</p>
         */
        @NameInMap("autoRenewPeriodUnit")
        public String autoRenewPeriodUnit;

        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>dlf catalog 信息。</p>
         */
        @NameInMap("dlfCatalogId")
        public String dlfCatalogId;

        /**
         * <p>订购周期数量(pre付费类型必须)。</p>
         */
        @NameInMap("duration")
        public Integer duration;

        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>失败原因。</p>
         */
        @NameInMap("failReason")
        public String failReason;

        /**
         * <p>订购周期(pre付费类型必须)。</p>
         */
        @NameInMap("paymentDurationUnit")
        public String paymentDurationUnit;

        /**
         * <p>支付状态。</p>
         */
        @NameInMap("paymentStatus")
        public String paymentStatus;

        /**
         * <p>付费类型。</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("releaseType")
        public String releaseType;

        /**
         * <p>资源规格。</p>
         */
        @NameInMap("resourceSpec")
        public String resourceSpec;

        @NameInMap("stateChangeReason")
        public ListWorkspacesResponseBodyWorkspacesStateChangeReason stateChangeReason;

        /**
         * <p>oss 路径。</p>
         */
        @NameInMap("storage")
        public String storage;

        /**
         * <p>Workspace Id。</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        /**
         * <p>工作空间名称。</p>
         */
        @NameInMap("workspaceName")
        public String workspaceName;

        /**
         * <p>工作空间状态。</p>
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
