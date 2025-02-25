// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetIssuesRequest extends TeaModel {
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
    public GetIssuesRequestFilter filter;

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
    public GetIssuesRequestTimeRange timeRange;

    public static GetIssuesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIssuesRequest self = new GetIssuesRequest();
        return TeaModel.build(map, self);
    }

    public GetIssuesRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public GetIssuesRequest setBizModule(String bizModule) {
        this.bizModule = bizModule;
        return this;
    }
    public String getBizModule() {
        return this.bizModule;
    }

    public GetIssuesRequest setFilter(GetIssuesRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public GetIssuesRequestFilter getFilter() {
        return this.filter;
    }

    public GetIssuesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetIssuesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetIssuesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public GetIssuesRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public GetIssuesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetIssuesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetIssuesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetIssuesRequest setTimeRange(GetIssuesRequestTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public GetIssuesRequestTimeRange getTimeRange() {
        return this.timeRange;
    }

    public static class GetIssuesRequestFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>erConfig</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>BeginWith</p>
         */
        @NameInMap("Operator")
        public String operator;

        @NameInMap("SubFilters")
        public java.util.List<String> subFilters;

        @NameInMap("Values")
        public java.util.List<?> values;

        public static GetIssuesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetIssuesRequestFilter self = new GetIssuesRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetIssuesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetIssuesRequestFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetIssuesRequestFilter setSubFilters(java.util.List<String> subFilters) {
            this.subFilters = subFilters;
            return this;
        }
        public java.util.List<String> getSubFilters() {
            return this.subFilters;
        }

        public GetIssuesRequestFilter setValues(java.util.List<?> values) {
            this.values = values;
            return this;
        }
        public java.util.List<?> getValues() {
            return this.values;
        }

    }

    public static class GetIssuesRequestTimeRange extends TeaModel {
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

        public static GetIssuesRequestTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetIssuesRequestTimeRange self = new GetIssuesRequestTimeRange();
            return TeaModel.build(map, self);
        }

        public GetIssuesRequestTimeRange setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetIssuesRequestTimeRange setGranularity(Integer granularity) {
            this.granularity = granularity;
            return this;
        }
        public Integer getGranularity() {
            return this.granularity;
        }

        public GetIssuesRequestTimeRange setGranularityUnit(String granularityUnit) {
            this.granularityUnit = granularityUnit;
            return this;
        }
        public String getGranularityUnit() {
            return this.granularityUnit;
        }

        public GetIssuesRequestTimeRange setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
