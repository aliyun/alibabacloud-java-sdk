// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobMetricResponseBody extends TeaModel {
    @NameInMap("data")
    public ListJobMetricResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpCode")
    public Integer httpCode;

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
        @NameInMap("metric")
        public java.util.Map<String, String> metric;

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
        @NameInMap("category")
        public String category;

        @NameInMap("metrics")
        public java.util.List<ListJobMetricResponseBodyDataMetrics> metrics;

        @NameInMap("name")
        public String name;

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
