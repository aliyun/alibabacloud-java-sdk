// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMetricListResponseBody extends TeaModel {
    /**
     * <p>The error code returned by the backend service. The number is incremented.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The monitoring statistics.</p>
     */
    @NameInMap("DataPoints")
    public java.util.List<DescribeMetricListResponseBodyDataPoints> dataPoints;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the %s variable in the **ErrMessage** parameter.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code returned for an exception.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>*   **InternetOut**: the outbound traffic over the Internet. Unit: byte.</p>
     * <p>*   **diskusage_utilization**: the disk usage.</p>
     * <p>*   **IntranetInRate**: the inbound traffic over the internal network. Unit: byte.</p>
     * <p>*   **InternetIn**: the inbound traffic from the Internet. Unit: byte.</p>
     * <p>*   **cpu_total**: the CPU utilization.</p>
     * <p>*   **memory_usedutilization**: the memory usage.</p>
     * <p>*   **IntranetOutRate**: the outbound traffic over the internal network. Unit: byte.</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>Indicates whether the metrics of the cluster or a node are queried. Valid values:</p>
     * <br>
     * <p>*   **CLUSTER**: The metrics of the cluster are queried.</p>
     * <p>*   **NODE**: The metrics of a node are queried.</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The monitored object.</p>
     * <br>
     * <p>*   If the **MetricType** parameter is set to **NODE**, the value of this parameter is the ID of the node that is monitored.****</p>
     * <p>*   If the **MetricType** parameter is set to **CLUSTER**, the value of this parameter is the ID of the dedicated cluster. You can obtain the ID by calling the ListDedicatedCluster operation.</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The monitoring interval. Unit: seconds. Minimum value: 15.</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
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
         */
        @NameInMap("Statistics")
        public Float statistics;

        /**
         * <p>The timestamp of the record. Unit: milliseconds.</p>
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
