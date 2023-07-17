// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class QueryMetricRequest extends TeaModel {
    @NameInMap("ConsistencyDataKey")
    public String consistencyDataKey;

    @NameInMap("ConsistencyQueryStrategy")
    public String consistencyQueryStrategy;

    @NameInMap("Dimensions")
    public java.util.List<String> dimensions;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Filters")
    public java.util.List<QueryMetricRequestFilters> filters;

    @NameInMap("IntervalInSec")
    public Integer intervalInSec;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Measures")
    public java.util.List<String> measures;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("Order")
    public String order;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("StartTime")
    public Long startTime;

    public static QueryMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricRequest self = new QueryMetricRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetricRequest setConsistencyDataKey(String consistencyDataKey) {
        this.consistencyDataKey = consistencyDataKey;
        return this;
    }
    public String getConsistencyDataKey() {
        return this.consistencyDataKey;
    }

    public QueryMetricRequest setConsistencyQueryStrategy(String consistencyQueryStrategy) {
        this.consistencyQueryStrategy = consistencyQueryStrategy;
        return this;
    }
    public String getConsistencyQueryStrategy() {
        return this.consistencyQueryStrategy;
    }

    public QueryMetricRequest setDimensions(java.util.List<String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<String> getDimensions() {
        return this.dimensions;
    }

    public QueryMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMetricRequest setFilters(java.util.List<QueryMetricRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<QueryMetricRequestFilters> getFilters() {
        return this.filters;
    }

    public QueryMetricRequest setIntervalInSec(Integer intervalInSec) {
        this.intervalInSec = intervalInSec;
        return this;
    }
    public Integer getIntervalInSec() {
        return this.intervalInSec;
    }

    public QueryMetricRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryMetricRequest setMeasures(java.util.List<String> measures) {
        this.measures = measures;
        return this;
    }
    public java.util.List<String> getMeasures() {
        return this.measures;
    }

    public QueryMetricRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public QueryMetricRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryMetricRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryMetricRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    public QueryMetricRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class QueryMetricRequestFilters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryMetricRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            QueryMetricRequestFilters self = new QueryMetricRequestFilters();
            return TeaModel.build(map, self);
        }

        public QueryMetricRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryMetricRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
