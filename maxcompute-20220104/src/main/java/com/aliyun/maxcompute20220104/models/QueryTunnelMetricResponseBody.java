// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryTunnelMetricResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public QueryTunnelMetricResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>0A3B1E82006A23A918C70905BF08AEC7</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Indicates whether the operation was successful. If this parameter is not empty and the value is not 200, the operation failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc3b4b016674434996033675e71ee</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryTunnelMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTunnelMetricResponseBody self = new QueryTunnelMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTunnelMetricResponseBody setData(QueryTunnelMetricResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTunnelMetricResponseBodyData getData() {
        return this.data;
    }

    public QueryTunnelMetricResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryTunnelMetricResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryTunnelMetricResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public QueryTunnelMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTunnelMetricResponseBodyDataMetrics extends TeaModel {
        /**
         * <p>The metadata of the metric.</p>
         */
        @NameInMap("metric")
        public java.util.Map<String, String> metric;

        /**
         * <p>A list of metric values.</p>
         */
        @NameInMap("values")
        public java.util.List<java.util.List<Double>> values;

        public static QueryTunnelMetricResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTunnelMetricResponseBodyDataMetrics self = new QueryTunnelMetricResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTunnelMetricResponseBodyDataMetrics setMetric(java.util.Map<String, String> metric) {
            this.metric = metric;
            return this;
        }
        public java.util.Map<String, String> getMetric() {
            return this.metric;
        }

        public QueryTunnelMetricResponseBodyDataMetrics setValues(java.util.List<java.util.List<Double>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.List<Double>> getValues() {
            return this.values;
        }

    }

    public static class QueryTunnelMetricResponseBodyData extends TeaModel {
        /**
         * <p>The category of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>tunnel</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The metric values.</p>
         */
        @NameInMap("metrics")
        public java.util.List<QueryTunnelMetricResponseBodyDataMetrics> metrics;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>slot_usage</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The step size of the monitoring data.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("period")
        public Long period;

        public static QueryTunnelMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTunnelMetricResponseBodyData self = new QueryTunnelMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTunnelMetricResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryTunnelMetricResponseBodyData setMetrics(java.util.List<QueryTunnelMetricResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTunnelMetricResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTunnelMetricResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTunnelMetricResponseBodyData setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

    }

}
