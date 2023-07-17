// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class QueryMetricByPageRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("CustomFilters")
    public java.util.List<String> customFilters;

    @NameInMap("Dimensions")
    public java.util.List<String> dimensions;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Filters")
    public java.util.List<QueryMetricByPageRequestFilters> filters;

    @NameInMap("IntervalInSec")
    public Integer intervalInSec;

    @NameInMap("Measures")
    public java.util.List<String> measures;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("Order")
    public String order;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageSize")
    public Integer pageSize;

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
        @NameInMap("Key")
        public String key;

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
