// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorDataListResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>end timestamp must not be before start time.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C240412F-3F5F-50E2-ACEC-DE808EF9C4BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The returned monitoring data.</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("K")
        public String k;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>i-rj99xc6cptkk64ml****</p>
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
        /**
         * <p>The timestamp that indicates the time when the metric value is collected.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1653804865</p>
         */
        @NameInMap("Ts")
        public String ts;

        /**
         * <p>The metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>0.13</p>
         */
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
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunEcs_cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The metric values that are collected at different timestamps.</p>
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
