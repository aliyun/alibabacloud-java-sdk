// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorDataListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("TimeSeries")
    public java.util.List<DescribeHybridMonitorDataListResponseBodyTimeSeries> timeSeries;

    public static DescribeHybridMonitorDataListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorDataListResponseBody self = new DescribeHybridMonitorDataListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorDataListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHybridMonitorDataListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHybridMonitorDataListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridMonitorDataListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeHybridMonitorDataListResponseBody setTimeSeries(java.util.List<DescribeHybridMonitorDataListResponseBodyTimeSeries> timeSeries) {
        this.timeSeries = timeSeries;
        return this;
    }
    public java.util.List<DescribeHybridMonitorDataListResponseBodyTimeSeries> getTimeSeries() {
        return this.timeSeries;
    }

    public static class DescribeHybridMonitorDataListResponseBodyTimeSeriesLabels extends TeaModel {
        @NameInMap("K")
        public String k;

        @NameInMap("V")
        public String v;

        public static DescribeHybridMonitorDataListResponseBodyTimeSeriesLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorDataListResponseBodyTimeSeriesLabels self = new DescribeHybridMonitorDataListResponseBodyTimeSeriesLabels();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorDataListResponseBodyTimeSeriesLabels setK(String k) {
            this.k = k;
            return this;
        }
        public String getK() {
            return this.k;
        }

        public DescribeHybridMonitorDataListResponseBodyTimeSeriesLabels setV(String v) {
            this.v = v;
            return this;
        }
        public String getV() {
            return this.v;
        }

    }

    public static class DescribeHybridMonitorDataListResponseBodyTimeSeriesValues extends TeaModel {
        @NameInMap("Ts")
        public String ts;

        @NameInMap("V")
        public String v;

        public static DescribeHybridMonitorDataListResponseBodyTimeSeriesValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorDataListResponseBodyTimeSeriesValues self = new DescribeHybridMonitorDataListResponseBodyTimeSeriesValues();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorDataListResponseBodyTimeSeriesValues setTs(String ts) {
            this.ts = ts;
            return this;
        }
        public String getTs() {
            return this.ts;
        }

        public DescribeHybridMonitorDataListResponseBodyTimeSeriesValues setV(String v) {
            this.v = v;
            return this;
        }
        public String getV() {
            return this.v;
        }

    }

    public static class DescribeHybridMonitorDataListResponseBodyTimeSeries extends TeaModel {
        @NameInMap("Labels")
        public java.util.List<DescribeHybridMonitorDataListResponseBodyTimeSeriesLabels> labels;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Values")
        public java.util.List<DescribeHybridMonitorDataListResponseBodyTimeSeriesValues> values;

        public static DescribeHybridMonitorDataListResponseBodyTimeSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorDataListResponseBodyTimeSeries self = new DescribeHybridMonitorDataListResponseBodyTimeSeries();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorDataListResponseBodyTimeSeries setLabels(java.util.List<DescribeHybridMonitorDataListResponseBodyTimeSeriesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<DescribeHybridMonitorDataListResponseBodyTimeSeriesLabels> getLabels() {
            return this.labels;
        }

        public DescribeHybridMonitorDataListResponseBodyTimeSeries setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeHybridMonitorDataListResponseBodyTimeSeries setValues(java.util.List<DescribeHybridMonitorDataListResponseBodyTimeSeriesValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeHybridMonitorDataListResponseBodyTimeSeriesValues> getValues() {
            return this.values;
        }

    }

}
