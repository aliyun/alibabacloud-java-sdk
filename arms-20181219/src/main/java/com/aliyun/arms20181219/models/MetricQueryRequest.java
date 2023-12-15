// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20181219.models;

import com.aliyun.tea.*;

public class MetricQueryRequest extends TeaModel {
    @NameInMap("Dimensions")
    public java.util.List<String> dimensions;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Filters")
    public java.util.List<MetricQueryRequestFilters> filters;

    @NameInMap("IintervalInSec")
    public Integer iintervalInSec;

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

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StartTime")
    public Long startTime;

    public static MetricQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        MetricQueryRequest self = new MetricQueryRequest();
        return TeaModel.build(map, self);
    }

    public MetricQueryRequest setDimensions(java.util.List<String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<String> getDimensions() {
        return this.dimensions;
    }

    public MetricQueryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public MetricQueryRequest setFilters(java.util.List<MetricQueryRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<MetricQueryRequestFilters> getFilters() {
        return this.filters;
    }

    public MetricQueryRequest setIintervalInSec(Integer iintervalInSec) {
        this.iintervalInSec = iintervalInSec;
        return this;
    }
    public Integer getIintervalInSec() {
        return this.iintervalInSec;
    }

    public MetricQueryRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public MetricQueryRequest setMeasures(java.util.List<String> measures) {
        this.measures = measures;
        return this;
    }
    public java.util.List<String> getMeasures() {
        return this.measures;
    }

    public MetricQueryRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public MetricQueryRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public MetricQueryRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public MetricQueryRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public MetricQueryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class MetricQueryRequestFilters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static MetricQueryRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            MetricQueryRequestFilters self = new MetricQueryRequestFilters();
            return TeaModel.build(map, self);
        }

        public MetricQueryRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public MetricQueryRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
