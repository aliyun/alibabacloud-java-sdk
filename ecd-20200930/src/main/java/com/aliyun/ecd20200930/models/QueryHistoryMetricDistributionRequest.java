// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryMetricDistributionRequest extends TeaModel {
    /**
     * <p>The end date of the query period. The date must be in the <code>YYYY-MM-DD</code> format. The default value is T-1.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-01</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The name of the metric to query.</p>
     * 
     * <strong>example:</strong>
     * <p>LOAD_SCORE</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>An array of custom value ranges.</p>
     */
    @NameInMap("Ranges")
    public java.util.List<QueryHistoryMetricDistributionRequestRanges> ranges;

    /**
     * <p>The start date of the query period. The date must be in the <code>YYYY-MM-DD</code> format. The default value is T-1.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-01</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static QueryHistoryMetricDistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryMetricDistributionRequest self = new QueryHistoryMetricDistributionRequest();
        return TeaModel.build(map, self);
    }

    public QueryHistoryMetricDistributionRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryHistoryMetricDistributionRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public QueryHistoryMetricDistributionRequest setRanges(java.util.List<QueryHistoryMetricDistributionRequestRanges> ranges) {
        this.ranges = ranges;
        return this;
    }
    public java.util.List<QueryHistoryMetricDistributionRequestRanges> getRanges() {
        return this.ranges;
    }

    public QueryHistoryMetricDistributionRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public static class QueryHistoryMetricDistributionRequestRanges extends TeaModel {
        /**
         * <p>Specifies whether to include the maximum value in the range. The default value is <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IncludeMax")
        public Boolean includeMax;

        /**
         * <p>Specifies whether to include the minimum value in the range. The default value is <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IncludeMin")
        public Boolean includeMin;

        /**
         * <p>The label for the value range. This label is returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>label-02\&quot;</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The maximum value of the value range.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Max")
        public Float max;

        /**
         * <p>The minimum value of the value range.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Min")
        public Float min;

        public static QueryHistoryMetricDistributionRequestRanges build(java.util.Map<String, ?> map) throws Exception {
            QueryHistoryMetricDistributionRequestRanges self = new QueryHistoryMetricDistributionRequestRanges();
            return TeaModel.build(map, self);
        }

        public QueryHistoryMetricDistributionRequestRanges setIncludeMax(Boolean includeMax) {
            this.includeMax = includeMax;
            return this;
        }
        public Boolean getIncludeMax() {
            return this.includeMax;
        }

        public QueryHistoryMetricDistributionRequestRanges setIncludeMin(Boolean includeMin) {
            this.includeMin = includeMin;
            return this;
        }
        public Boolean getIncludeMin() {
            return this.includeMin;
        }

        public QueryHistoryMetricDistributionRequestRanges setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryHistoryMetricDistributionRequestRanges setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

        public QueryHistoryMetricDistributionRequestRanges setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

    }

}
