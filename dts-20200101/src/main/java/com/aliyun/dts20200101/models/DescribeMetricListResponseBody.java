// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMetricListResponseBody extends TeaModel {
    /**
     * <p>The backend error code, which is an incrementing number.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The monitoring statistics information.</p>
     */
    @NameInMap("DataPoints")
    public java.util.List<DescribeMetricListResponseBodyDataPoints> dataPoints;

    /**
     * <p>The dynamic error message, which is used to replace the %s placeholder in the <strong>ErrMessage</strong> error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Type</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Value of Input Parameter %s is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code corresponding to the exception.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <ul>
     * <li><strong>InternetOut</strong>: outbound Internet traffic, in bytes.</li>
     * <li><strong>diskusage_utilization</strong>: disk usage.</li>
     * <li><strong>IntranetInRate</strong>: inbound internal network traffic, in bytes.</li>
     * <li><strong>InternetIn</strong>: inbound Internet traffic, in bytes.</li>
     * <li><strong>cpu_total</strong>: CPU utilization.</li>
     * <li><strong>memory_usedutilization</strong>: memory utilization.</li>
     * <li><strong>IntranetOutRate</strong>: outbound internal network traffic, in bytes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>Specifies whether to query a cluster or a node. Valid values:</p>
     * <ul>
     * <li><strong>CLUSTER</strong>: cluster.</li>
     * <li><strong>NODE</strong>: node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLUSTER</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The observation value.</p>
     * <ul>
     * <li>If <strong>MetricType</strong> is set to <strong>NODE</strong>, the value is <strong>nodeid</strong>.</li>
     * <li>If <strong>MetricType</strong> is set to <strong>CLUSTER</strong>, the value is the ID of the dedicated cluster, which can be obtained by calling the ListDedicatedCluster operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs-jhjnjjn</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The observation interval in seconds. The minimum interval is 15 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeMetricListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricListResponseBody self = new DescribeMetricListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMetricListResponseBody setDataPoints(java.util.List<DescribeMetricListResponseBodyDataPoints> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }
    public java.util.List<DescribeMetricListResponseBodyDataPoints> getDataPoints() {
        return this.dataPoints;
    }

    public DescribeMetricListResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeMetricListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeMetricListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeMetricListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeMetricListResponseBody setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMetricListResponseBody setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeMetricListResponseBody setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public DescribeMetricListResponseBody setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public DescribeMetricListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMetricListResponseBodyDataPoints extends TeaModel {
        /**
         * <p>The statistical value.</p>
         * 
         * <strong>example:</strong>
         * <p>15.25</p>
         */
        @NameInMap("Statistics")
        public Float statistics;

        /**
         * <p>The record timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1650872310000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeMetricListResponseBodyDataPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricListResponseBodyDataPoints self = new DescribeMetricListResponseBodyDataPoints();
            return TeaModel.build(map, self);
        }

        public DescribeMetricListResponseBodyDataPoints setStatistics(Float statistics) {
            this.statistics = statistics;
            return this;
        }
        public Float getStatistics() {
            return this.statistics;
        }

        public DescribeMetricListResponseBodyDataPoints setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
