// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetIssuesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>233588686</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>h5Resource</p>
     */
    @NameInMap("BizModule")
    public String bizModule;

    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <strong>example:</strong>
     * <p>GUI-TEST1711072832000</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>instances</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <strong>example:</strong>
     * <p>h5</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>FE_RUNNING</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimeRange")
    public GetIssuesShrinkRequestTimeRange timeRange;

    public static GetIssuesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIssuesShrinkRequest self = new GetIssuesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetIssuesShrinkRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public GetIssuesShrinkRequest setBizModule(String bizModule) {
        this.bizModule = bizModule;
        return this;
    }
    public String getBizModule() {
        return this.bizModule;
    }

    public GetIssuesShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public GetIssuesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetIssuesShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetIssuesShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public GetIssuesShrinkRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public GetIssuesShrinkRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetIssuesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetIssuesShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetIssuesShrinkRequest setTimeRange(GetIssuesShrinkRequestTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public GetIssuesShrinkRequestTimeRange getTimeRange() {
        return this.timeRange;
    }

    public static class GetIssuesShrinkRequestTimeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-09-04T02:15:00Z</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("Granularity")
        public Integer granularity;

        /**
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("GranularityUnit")
        public String granularityUnit;

        /**
         * <strong>example:</strong>
         * <p>2024-11-05T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static GetIssuesShrinkRequestTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetIssuesShrinkRequestTimeRange self = new GetIssuesShrinkRequestTimeRange();
            return TeaModel.build(map, self);
        }

        public GetIssuesShrinkRequestTimeRange setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetIssuesShrinkRequestTimeRange setGranularity(Integer granularity) {
            this.granularity = granularity;
            return this;
        }
        public Integer getGranularity() {
            return this.granularity;
        }

        public GetIssuesShrinkRequestTimeRange setGranularityUnit(String granularityUnit) {
            this.granularityUnit = granularityUnit;
            return this;
        }
        public String getGranularityUnit() {
            return this.granularityUnit;
        }

        public GetIssuesShrinkRequestTimeRange setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
