// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryStorageMetricResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public QueryStorageMetricResponseBodyData data;

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
     * <p>0A3B1FD2006A24C8D8BE65CDAC028298</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p>1xx: Informational - The request was received and is being processed.</p>
     * </li>
     * <li><p>2xx: Success - The request was successfully received, understood, and accepted by the server.</p>
     * </li>
     * <li><p>3xx: Redirection - The request was redirected. Further action is needed to complete the request.</p>
     * </li>
     * <li><p>4xx: Client error - The request contains incorrect parameters or syntax, or cannot be fulfilled.</p>
     * </li>
     * <li><p>5xx: Server error - The server failed to fulfill the request for other reasons.</p>
     * </li>
     * </ul>
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
     * <p>0be3e0bb16654558425251398e27a9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryStorageMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStorageMetricResponseBody self = new QueryStorageMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStorageMetricResponseBody setData(QueryStorageMetricResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryStorageMetricResponseBodyData getData() {
        return this.data;
    }

    public QueryStorageMetricResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryStorageMetricResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryStorageMetricResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public QueryStorageMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryStorageMetricResponseBodyDataMetrics extends TeaModel {
        /**
         * <p>The metadata of the metric.</p>
         */
        @NameInMap("metric")
        public java.util.Map<String, String> metric;

        /**
         * <p>The time series data.</p>
         */
        @NameInMap("values")
        public java.util.List<java.util.List<Double>> values;

        public static QueryStorageMetricResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryStorageMetricResponseBodyDataMetrics self = new QueryStorageMetricResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public QueryStorageMetricResponseBodyDataMetrics setMetric(java.util.Map<String, String> metric) {
            this.metric = metric;
            return this;
        }
        public java.util.Map<String, String> getMetric() {
            return this.metric;
        }

        public QueryStorageMetricResponseBodyDataMetrics setValues(java.util.List<java.util.List<Double>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.List<Double>> getValues() {
            return this.values;
        }

    }

    public static class QueryStorageMetricResponseBodyData extends TeaModel {
        /**
         * <p>The category of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>storage</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The metric values.</p>
         */
        @NameInMap("metrics")
        public java.util.List<QueryStorageMetricResponseBodyDataMetrics> metrics;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>summary</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The step size of the monitoring data.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("period")
        public Long period;

        public static QueryStorageMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStorageMetricResponseBodyData self = new QueryStorageMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStorageMetricResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryStorageMetricResponseBodyData setMetrics(java.util.List<QueryStorageMetricResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryStorageMetricResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryStorageMetricResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryStorageMetricResponseBodyData setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

    }

}
