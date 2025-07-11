// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryStorageMetricResponseBody extends TeaModel {
    @NameInMap("data")
    public QueryStorageMetricResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>0A3B1FD2006A24C8D8BE65CDAC028298</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
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
        @NameInMap("metric")
        public java.util.Map<String, String> metric;

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
         * <strong>example:</strong>
         * <p>storage</p>
         */
        @NameInMap("category")
        public String category;

        @NameInMap("metrics")
        public java.util.List<QueryStorageMetricResponseBodyDataMetrics> metrics;

        /**
         * <strong>example:</strong>
         * <p>summary</p>
         */
        @NameInMap("name")
        public String name;

        /**
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
