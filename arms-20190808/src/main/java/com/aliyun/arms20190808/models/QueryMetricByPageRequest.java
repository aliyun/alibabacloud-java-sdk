// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryMetricByPageRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <code>1</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Custom filter conditions.</p>
     */
    @NameInMap("CustomFilters")
    public java.util.List<String> customFilters;

    /**
     * <p>The dimensions of the metric that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;detector_browser&quot;,&quot;detector_device&quot;]</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<String> dimensions;

    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1667546895000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<QueryMetricByPageRequestFilters> filters;

    /**
     * <p>The time interval at which data entries are aggregated. Unit: milliseconds. Minimum value: 60000.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("IntervalInSec")
    public Integer intervalInSec;

    /**
     * <p>The measures of the metric that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>pv</p>
     */
    @NameInMap("Measures")
    public java.util.List<String> measures;

    /**
     * <p>The metric that you want to query. You cannot specify a custom metric. For more information, see the &quot;Application monitoring metrics that can be queried&quot; section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>appstat.host</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The order in which measures are sorted. Valid values:</p>
     * <ul>
     * <li><code>ASC</code>: ascending order</li>
     * <li><code>DESC</code>: descending order</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify the parameter, data is not sorted.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The dimension from which metrics are sorted. You can set this parameter to a supported dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>pid</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of entries to return on each page. This parameter is no longer supported. The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1667287695000</p>
     */
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
        /**
         * <p>The key of the filter condition. You must set the key to <code>pid</code> or <code>regionId</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>pid</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition. You must set the value of the <code>pid</code> or <code>regionId</code> condition. For information about how to obtain the <code>pid</code>, see the &quot;Obtain the PID of an application&quot; section.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx@74xxx</p>
         */
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
