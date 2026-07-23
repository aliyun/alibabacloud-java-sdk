// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeDataAgentMetricsResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public DescribeDataAgentMetricsResponseBodyData data;

    /**
     * <p>The error code returned when the request is abnormal.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDataAgentMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAgentMetricsResponseBody self = new DescribeDataAgentMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataAgentMetricsResponseBody setData(DescribeDataAgentMetricsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDataAgentMetricsResponseBodyData getData() {
        return this.data;
    }

    public DescribeDataAgentMetricsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDataAgentMetricsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeDataAgentMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataAgentMetricsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDataAgentMetricsResponseBodyDataMetrics extends TeaModel {
        /**
         * <p>The error message returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Timeout</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>data_agent_session_per_user</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDataAgentMetricsResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataAgentMetricsResponseBodyDataMetrics self = new DescribeDataAgentMetricsResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeDataAgentMetricsResponseBodyDataMetrics setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDataAgentMetricsResponseBodyDataMetrics setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeDataAgentMetricsResponseBodyDataMetrics setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DescribeDataAgentMetricsResponseBodyDataMetrics setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDataAgentMetricsResponseBodyData extends TeaModel {
        /**
         * <p>The end time of the query range.</p>
         * 
         * <strong>example:</strong>
         * <p>1782836200000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The metric type.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <p>The list of metrics.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<DescribeDataAgentMetricsResponseBodyDataMetrics> metrics;

        /**
         * <p>The start time of the query range.</p>
         * 
         * <strong>example:</strong>
         * <p>1782835200000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeDataAgentMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataAgentMetricsResponseBodyData self = new DescribeDataAgentMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataAgentMetricsResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDataAgentMetricsResponseBodyData setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public DescribeDataAgentMetricsResponseBodyData setMetrics(java.util.List<DescribeDataAgentMetricsResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<DescribeDataAgentMetricsResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public DescribeDataAgentMetricsResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
