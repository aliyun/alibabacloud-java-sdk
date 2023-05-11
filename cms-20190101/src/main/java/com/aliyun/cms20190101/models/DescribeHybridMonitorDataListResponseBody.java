// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorDataListResponseBody extends TeaModel {
    /**
     * <p>The name of the metric.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned monitoring data.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The name of the namespace.</p>
     * <br>
     * <p>For information about how to obtain the name of a namespace, see [DescribeHybridMonitorNamespaceList](~~428880~~).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timestamp that indicates the time when the metric value is collected.</p>
     * <br>
     * <p>Unit: seconds.</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The metric value.</p>
     */
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
        /**
         * <p>The timestamp that specifies the end of the time range to query.</p>
         * <br>
         * <p>Unit: seconds.</p>
         */
        @NameInMap("K")
        public String k;

        /**
         * <p>The ID of the request.</p>
         */
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
        /**
         * <p>The tags of the time dimension.</p>
         */
        @NameInMap("Labels")
        public java.util.List<DescribeHybridMonitorDataListResponseBodyTimeSeriesLabels> labels;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
         */
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
