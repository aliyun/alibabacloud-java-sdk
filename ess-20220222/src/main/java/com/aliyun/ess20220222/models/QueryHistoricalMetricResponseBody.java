// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class QueryHistoricalMetricResponseBody extends TeaModel {
    /**
     * <p>The monitoring metrics of the prediction rule.</p>
     */
    @NameInMap("HistoricalMetrics")
    public QueryHistoricalMetricResponseBodyHistoricalMetrics historicalMetrics;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryHistoricalMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoricalMetricResponseBody self = new QueryHistoricalMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHistoricalMetricResponseBody setHistoricalMetrics(QueryHistoricalMetricResponseBodyHistoricalMetrics historicalMetrics) {
        this.historicalMetrics = historicalMetrics;
        return this;
    }
    public QueryHistoricalMetricResponseBodyHistoricalMetrics getHistoricalMetrics() {
        return this.historicalMetrics;
    }

    public QueryHistoricalMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryHistoricalMetricResponseBodyHistoricalMetricsHistoricalMetric extends TeaModel {
        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("MetricValue")
        public String metricValue;

        /**
         * <p>The point in time of the monitoring metric. The value must be in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-17T16:00Z</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryHistoricalMetricResponseBodyHistoricalMetricsHistoricalMetric build(java.util.Map<String, ?> map) throws Exception {
            QueryHistoricalMetricResponseBodyHistoricalMetricsHistoricalMetric self = new QueryHistoricalMetricResponseBodyHistoricalMetricsHistoricalMetric();
            return TeaModel.build(map, self);
        }

        public QueryHistoricalMetricResponseBodyHistoricalMetricsHistoricalMetric setMetricValue(String metricValue) {
            this.metricValue = metricValue;
            return this;
        }
        public String getMetricValue() {
            return this.metricValue;
        }

        public QueryHistoricalMetricResponseBodyHistoricalMetricsHistoricalMetric setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryHistoricalMetricResponseBodyHistoricalMetrics extends TeaModel {
        @NameInMap("HistoricalMetric")
        public java.util.List<QueryHistoricalMetricResponseBodyHistoricalMetricsHistoricalMetric> historicalMetric;

        public static QueryHistoricalMetricResponseBodyHistoricalMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryHistoricalMetricResponseBodyHistoricalMetrics self = new QueryHistoricalMetricResponseBodyHistoricalMetrics();
            return TeaModel.build(map, self);
        }

        public QueryHistoricalMetricResponseBodyHistoricalMetrics setHistoricalMetric(java.util.List<QueryHistoricalMetricResponseBodyHistoricalMetricsHistoricalMetric> historicalMetric) {
            this.historicalMetric = historicalMetric;
            return this;
        }
        public java.util.List<QueryHistoricalMetricResponseBodyHistoricalMetricsHistoricalMetric> getHistoricalMetric() {
            return this.historicalMetric;
        }

    }

}
