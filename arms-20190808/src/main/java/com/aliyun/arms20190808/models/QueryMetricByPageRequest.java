// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryMetricByPageRequest extends TeaModel {
    @NameInMap("IntervalInSec")
    public Integer intervalInSec;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("Order")
    public String order;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("ConsistencyDataKey")
    public String consistencyDataKey;

    @NameInMap("ConsistencyQueryStrategy")
    public String consistencyQueryStrategy;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Filters")
    public java.util.List<QueryMetricByPageRequestFilters> filters;

    @NameInMap("Dimensions")
    public java.util.List<String> dimensions;

    @NameInMap("Measures")
    public java.util.List<String> measures;

    public static QueryMetricByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricByPageRequest self = new QueryMetricByPageRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetricByPageRequest setIntervalInSec(Integer intervalInSec) {
        this.intervalInSec = intervalInSec;
        return this;
    }
    public Integer getIntervalInSec() {
        return this.intervalInSec;
    }

    public QueryMetricByPageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryMetricByPageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMetricByPageRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
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

    public QueryMetricByPageRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    public QueryMetricByPageRequest setConsistencyDataKey(String consistencyDataKey) {
        this.consistencyDataKey = consistencyDataKey;
        return this;
    }
    public String getConsistencyDataKey() {
        return this.consistencyDataKey;
    }

    public QueryMetricByPageRequest setConsistencyQueryStrategy(String consistencyQueryStrategy) {
        this.consistencyQueryStrategy = consistencyQueryStrategy;
        return this;
    }
    public String getConsistencyQueryStrategy() {
        return this.consistencyQueryStrategy;
    }

    public QueryMetricByPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryMetricByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMetricByPageRequest setFilters(java.util.List<QueryMetricByPageRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<QueryMetricByPageRequestFilters> getFilters() {
        return this.filters;
    }

    public QueryMetricByPageRequest setDimensions(java.util.List<String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<String> getDimensions() {
        return this.dimensions;
    }

    public QueryMetricByPageRequest setMeasures(java.util.List<String> measures) {
        this.measures = measures;
        return this;
    }
    public java.util.List<String> getMeasures() {
        return this.measures;
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
