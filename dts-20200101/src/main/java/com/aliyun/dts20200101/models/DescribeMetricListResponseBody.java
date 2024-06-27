// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMetricListResponseBody extends TeaModel {
    /**
     * <p>The error code returned by the backend service. The number is incremented.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The monitoring statistics.</p>
     */
    @NameInMap("DataPoints")
    public java.util.List<DescribeMetricListResponseBodyDataPoints> dataPoints;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the %s variable in the <strong>ErrMessage</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Type</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The Value of Input Parameter %s is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code returned for an exception.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <ul>
     * <li><strong>InternetOut</strong>: the outbound traffic over the Internet. Unit: byte.</li>
     * <li><strong>diskusage_utilization</strong>: the disk usage.</li>
     * <li><strong>IntranetInRate</strong>: the inbound traffic over the internal network. Unit: byte.</li>
     * <li><strong>InternetIn</strong>: the inbound traffic from the Internet. Unit: byte.</li>
     * <li><strong>cpu_total</strong>: the CPU utilization.</li>
     * <li><strong>memory_usedutilization</strong>: the memory usage.</li>
     * <li><strong>IntranetOutRate</strong>: the outbound traffic over the internal network. Unit: byte.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>Indicates whether the metrics of the cluster or a node are queried. Valid values:</p>
     * <ul>
     * <li><strong>CLUSTER</strong>: The metrics of the cluster are queried.</li>
     * <li><strong>NODE</strong>: The metrics of a node are queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLUSTER</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The monitored object.</p>
     * <ul>
     * <li>If the <strong>MetricType</strong> parameter is set to <strong>NODE</strong>, the value of this parameter is the ID of the node that is monitored.****</li>
     * <li>If the <strong>MetricType</strong> parameter is set to <strong>CLUSTER</strong>, the value of this parameter is the ID of the dedicated cluster. You can obtain the ID by calling the ListDedicatedCluster operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs-jhjnjjn</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The monitoring interval. Unit: seconds. Minimum value: 15.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
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
         * <p>The timestamp of the record. Unit: milliseconds.</p>
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
