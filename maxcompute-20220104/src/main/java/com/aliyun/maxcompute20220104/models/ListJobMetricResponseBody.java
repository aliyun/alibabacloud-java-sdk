// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobMetricResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListJobMetricResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>This object does not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>1xx: Informational response. The request was received and is being processed.</li>
     * <li>2xx: Success. The request action was successfully received, understood, and accepted by the server.</li>
     * <li>3xx: Redirection. The request was redirected, and further action is required to complete it.</li>
     * <li>4xx: Client error. The request contains invalid parameters, bad syntax, or cannot be fulfilled due to specific request conditions.</li>
     * <li>5xx: Server error. The server failed to fulfill the request due to other reasons.</li>
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
     * <p>0be3e0aa16667684362147582e038f</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListJobMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobMetricResponseBody self = new ListJobMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobMetricResponseBody setData(ListJobMetricResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListJobMetricResponseBodyData getData() {
        return this.data;
    }

    public ListJobMetricResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListJobMetricResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListJobMetricResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListJobMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListJobMetricResponseBodyDataMetrics extends TeaModel {
        /**
         * <p>The metric-related information.</p>
         */
        @NameInMap("metric")
        public java.util.Map<String, String> metric;

        /**
         * <p>The metric value information.</p>
         */
        @NameInMap("values")
        public java.util.List<java.util.List<Double>> values;

        public static ListJobMetricResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListJobMetricResponseBodyDataMetrics self = new ListJobMetricResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public ListJobMetricResponseBodyDataMetrics setMetric(java.util.Map<String, String> metric) {
            this.metric = metric;
            return this;
        }
        public java.util.Map<String, String> getMetric() {
            return this.metric;
        }

        public ListJobMetricResponseBodyDataMetrics setValues(java.util.List<java.util.List<Double>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.List<Double>> getValues() {
            return this.values;
        }

    }

    public static class ListJobMetricResponseBodyData extends TeaModel {
        /**
         * <p>The metric type.</p>
         * 
         * <strong>example:</strong>
         * <p>job</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The metric details.</p>
         */
        @NameInMap("metrics")
        public java.util.List<ListJobMetricResponseBodyDataMetrics> metrics;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>num</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The monitoring statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("period")
        public Long period;

        public static ListJobMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobMetricResponseBodyData self = new ListJobMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobMetricResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListJobMetricResponseBodyData setMetrics(java.util.List<ListJobMetricResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<ListJobMetricResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public ListJobMetricResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobMetricResponseBodyData setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

    }

}
