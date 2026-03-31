// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryQuotaMetricResponseBody extends TeaModel {
    @NameInMap("data")
    public QueryQuotaMetricResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>plan \&quot;***\&quot; does not exist</p>
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
     * <p>0b87b7b316643495896551555e855b</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryQuotaMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryQuotaMetricResponseBody self = new QueryQuotaMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryQuotaMetricResponseBody setData(QueryQuotaMetricResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryQuotaMetricResponseBodyData getData() {
        return this.data;
    }

    public QueryQuotaMetricResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryQuotaMetricResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryQuotaMetricResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public QueryQuotaMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryQuotaMetricResponseBodyDataMetrics extends TeaModel {
        @NameInMap("metric")
        public java.util.Map<String, String> metric;

        @NameInMap("values")
        public java.util.List<java.util.List<Double>> values;

        public static QueryQuotaMetricResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryQuotaMetricResponseBodyDataMetrics self = new QueryQuotaMetricResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public QueryQuotaMetricResponseBodyDataMetrics setMetric(java.util.Map<String, String> metric) {
            this.metric = metric;
            return this;
        }
        public java.util.Map<String, String> getMetric() {
            return this.metric;
        }

        public QueryQuotaMetricResponseBodyDataMetrics setValues(java.util.List<java.util.List<Double>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.List<Double>> getValues() {
            return this.values;
        }

    }

    public static class QueryQuotaMetricResponseBodyData extends TeaModel {
        @NameInMap("category")
        public String category;

        @NameInMap("metrics")
        public java.util.List<QueryQuotaMetricResponseBodyDataMetrics> metrics;

        /**
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("period")
        public Long period;

        public static QueryQuotaMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryQuotaMetricResponseBodyData self = new QueryQuotaMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryQuotaMetricResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryQuotaMetricResponseBodyData setMetrics(java.util.List<QueryQuotaMetricResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryQuotaMetricResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryQuotaMetricResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryQuotaMetricResponseBodyData setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

    }

}
