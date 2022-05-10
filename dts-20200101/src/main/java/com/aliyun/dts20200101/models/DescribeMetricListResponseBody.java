// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMetricListResponseBody extends TeaModel {
    // 后端错误码 数字递增
    @NameInMap("Code")
    public String code;

    @NameInMap("DataPoints")
    public java.util.List<DescribeMetricListResponseBodyDataPoints> dataPoints;

    // 动态错误信息，会替换错误码里的"%s"
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    // 错误短码 ps：InternalError
    @NameInMap("ErrCode")
    public String errCode;

    // 错误信息（返回给用户）
    @NameInMap("ErrMessage")
    public String errMessage;

    // 异常对应的http code
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("MetricName")
    public String metricName;

    // NODE, CLUSTER
    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("Param")
    public String param;

    @NameInMap("Period")
    public Long period;

    @NameInMap("RequestId")
    public String requestId;

    // 调用结果
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
        @NameInMap("Statistics")
        public Float statistics;

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
