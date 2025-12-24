// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class QueryPredictiveMetricResponseBody extends TeaModel {
    @NameInMap("PredictiveMetrics")
    public QueryPredictiveMetricResponseBodyPredictiveMetrics predictiveMetrics;

    /**
     * <strong>example:</strong>
     * <p>CC107349-57B7-4405-B1BF-9BF5AF7F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryPredictiveMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPredictiveMetricResponseBody self = new QueryPredictiveMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPredictiveMetricResponseBody setPredictiveMetrics(QueryPredictiveMetricResponseBodyPredictiveMetrics predictiveMetrics) {
        this.predictiveMetrics = predictiveMetrics;
        return this;
    }
    public QueryPredictiveMetricResponseBodyPredictiveMetrics getPredictiveMetrics() {
        return this.predictiveMetrics;
    }

    public QueryPredictiveMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPredictiveMetricResponseBodyPredictiveMetricsPredictiveMetric extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("MetricValue")
        public String metricValue;

        /**
         * <strong>example:</strong>
         * <p>2025-12-17T16:00Z</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryPredictiveMetricResponseBodyPredictiveMetricsPredictiveMetric build(java.util.Map<String, ?> map) throws Exception {
            QueryPredictiveMetricResponseBodyPredictiveMetricsPredictiveMetric self = new QueryPredictiveMetricResponseBodyPredictiveMetricsPredictiveMetric();
            return TeaModel.build(map, self);
        }

        public QueryPredictiveMetricResponseBodyPredictiveMetricsPredictiveMetric setMetricValue(String metricValue) {
            this.metricValue = metricValue;
            return this;
        }
        public String getMetricValue() {
            return this.metricValue;
        }

        public QueryPredictiveMetricResponseBodyPredictiveMetricsPredictiveMetric setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryPredictiveMetricResponseBodyPredictiveMetrics extends TeaModel {
        @NameInMap("PredictiveMetric")
        public java.util.List<QueryPredictiveMetricResponseBodyPredictiveMetricsPredictiveMetric> predictiveMetric;

        public static QueryPredictiveMetricResponseBodyPredictiveMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryPredictiveMetricResponseBodyPredictiveMetrics self = new QueryPredictiveMetricResponseBodyPredictiveMetrics();
            return TeaModel.build(map, self);
        }

        public QueryPredictiveMetricResponseBodyPredictiveMetrics setPredictiveMetric(java.util.List<QueryPredictiveMetricResponseBodyPredictiveMetricsPredictiveMetric> predictiveMetric) {
            this.predictiveMetric = predictiveMetric;
            return this;
        }
        public java.util.List<QueryPredictiveMetricResponseBodyPredictiveMetricsPredictiveMetric> getPredictiveMetric() {
            return this.predictiveMetric;
        }

    }

}
