// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryCommercialUsageRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("AdvancedFilters")
    public java.util.List<QueryCommercialUsageRequestAdvancedFilters> advancedFilters;

    /**
     * <p>The dimensions of the metric that you want to query. Valid values:</p>
     * <ul>
     * <li>dataType: data type</li>
     * <li>productType: product type</li>
     * <li>instanceId: instance ID</li>
     * <li>instanceName: instance name</li>
     * <li>instanceType: instance type</li>
     * </ul>
     */
    @NameInMap("Dimensions")
    public java.util.List<String> dimensions;

    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1699286400000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The time interval between data slices. Unit: seconds. Minimum value: 3600.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>3600: 1 hour</li>
     * <li>86400: 1 day</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("IntervalInSec")
    public Integer intervalInSec;

    /**
     * <p>The measures of the metric that you want to query.</p>
     */
    @NameInMap("Measures")
    public java.util.List<String> measures;

    /**
     * <p>The name of the metric. Valid value: USAGEFEE.STAT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USAGEFEE.STAT</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The order in which data is sorted. Valid value:</p>
     * <ul>
     * <li><code>ASC</code>: ascending order</li>
     * <li><code>DESC</code>: descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The dimension by which data is sorted.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li><p>dataType</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dataType</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The data type. Valid values:</p>
     * <ul>
     * <li>instantQuery: non-time series</li>
     * <li>timeSeriesQuery: time series</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instantQuery</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The start of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1699200000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static QueryCommercialUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommercialUsageRequest self = new QueryCommercialUsageRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommercialUsageRequest setAdvancedFilters(java.util.List<QueryCommercialUsageRequestAdvancedFilters> advancedFilters) {
        this.advancedFilters = advancedFilters;
        return this;
    }
    public java.util.List<QueryCommercialUsageRequestAdvancedFilters> getAdvancedFilters() {
        return this.advancedFilters;
    }

    public QueryCommercialUsageRequest setDimensions(java.util.List<String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<String> getDimensions() {
        return this.dimensions;
    }

    public QueryCommercialUsageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryCommercialUsageRequest setIntervalInSec(Integer intervalInSec) {
        this.intervalInSec = intervalInSec;
        return this;
    }
    public Integer getIntervalInSec() {
        return this.intervalInSec;
    }

    public QueryCommercialUsageRequest setMeasures(java.util.List<String> measures) {
        this.measures = measures;
        return this;
    }
    public java.util.List<String> getMeasures() {
        return this.measures;
    }

    public QueryCommercialUsageRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public QueryCommercialUsageRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryCommercialUsageRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryCommercialUsageRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryCommercialUsageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class QueryCommercialUsageRequestAdvancedFilters extends TeaModel {
        /**
         * <p>The key of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The operator. Valid values: eq and in.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("OpType")
        public String opType;

        /**
         * <p>The value of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryCommercialUsageRequestAdvancedFilters build(java.util.Map<String, ?> map) throws Exception {
            QueryCommercialUsageRequestAdvancedFilters self = new QueryCommercialUsageRequestAdvancedFilters();
            return TeaModel.build(map, self);
        }

        public QueryCommercialUsageRequestAdvancedFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryCommercialUsageRequestAdvancedFilters setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

        public QueryCommercialUsageRequestAdvancedFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
