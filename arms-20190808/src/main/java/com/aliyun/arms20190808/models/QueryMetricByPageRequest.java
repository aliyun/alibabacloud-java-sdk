// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryMetricByPageRequest extends TeaModel {
    // The number of the page to return. Default value: `1`.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Custom filter conditions.
    @NameInMap("CustomFilters")
    public java.util.List<String> customFilters;

    // The dimensions of the metric that you want to query.
    @NameInMap("Dimensions")
    public java.util.List<String> dimensions;

    // The end of the time range to query. Unit: milliseconds.
    @NameInMap("EndTime")
    public Long endTime;

    // The filter conditions.
    @NameInMap("Filters")
    public java.util.List<QueryMetricByPageRequestFilters> filters;

    // The time interval at which data entries are aggregated. Unit: milliseconds. Minimum value: 60000.
    @NameInMap("IntervalInSec")
    public Integer intervalInSec;

    // The measures of the metric that you want to query.
    @NameInMap("Measures")
    public java.util.List<String> measures;

    // The metric that you want to query. You cannot specify a custom metric. For more information, see the "Application monitoring metrics that can be queried" section.
    @NameInMap("Metric")
    public String metric;

    // The order in which measures are sorted. Valid values:
    // 
    // *   `ASC`: ascending order
    // *   `DESC`: descending order
    // 
    // > If you do not specify the parameter, data is not sorted.
    @NameInMap("Order")
    public String order;

    // The dimension from which metrics are sorted. You can set this parameter to a supported dimension.
    @NameInMap("OrderBy")
    public String orderBy;

    // The number of entries to return on each page. This parameter is no longer supported. The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The start of the time range to query. Unit: milliseconds.
    @NameInMap("StartTime")
    public Long startTime;

    public static QueryMetricByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricByPageRequest self = new QueryMetricByPageRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetricByPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryMetricByPageRequest setCustomFilters(java.util.List<String> customFilters) {
        this.customFilters = customFilters;
        return this;
    }
    public java.util.List<String> getCustomFilters() {
        return this.customFilters;
    }

    public QueryMetricByPageRequest setDimensions(java.util.List<String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<String> getDimensions() {
        return this.dimensions;
    }

    public QueryMetricByPageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMetricByPageRequest setFilters(java.util.List<QueryMetricByPageRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<QueryMetricByPageRequestFilters> getFilters() {
        return this.filters;
    }

    public QueryMetricByPageRequest setIntervalInSec(Integer intervalInSec) {
        this.intervalInSec = intervalInSec;
        return this;
    }
    public Integer getIntervalInSec() {
        return this.intervalInSec;
    }

    public QueryMetricByPageRequest setMeasures(java.util.List<String> measures) {
        this.measures = measures;
        return this;
    }
    public java.util.List<String> getMeasures() {
        return this.measures;
    }

    public QueryMetricByPageRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public QueryMetricByPageRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryMetricByPageRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryMetricByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMetricByPageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class QueryMetricByPageRequestFilters extends TeaModel {
        // The key of the filter condition. You must set the key to `pid` or `regionId`.
        @NameInMap("Key")
        public String key;

        // The value of the filter condition. You must set the value of the `pid` or `regionId` condition. For information about how to obtain the `pid`, see the "Obtain the PID of an application" section.
        @NameInMap("Value")
        public String value;

        public static QueryMetricByPageRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            QueryMetricByPageRequestFilters self = new QueryMetricByPageRequestFilters();
            return TeaModel.build(map, self);
        }

        public QueryMetricByPageRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryMetricByPageRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
