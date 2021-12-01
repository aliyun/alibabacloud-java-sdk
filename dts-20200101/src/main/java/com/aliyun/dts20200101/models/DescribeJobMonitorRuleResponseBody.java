// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeJobMonitorRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("MonitorRules")
    public java.util.List<DescribeJobMonitorRuleResponseBodyMonitorRules> monitorRules;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Topics")
    public java.util.List<String> topics;

    public static DescribeJobMonitorRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobMonitorRuleResponseBody self = new DescribeJobMonitorRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobMonitorRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeJobMonitorRuleResponseBody setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeJobMonitorRuleResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeJobMonitorRuleResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeJobMonitorRuleResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeJobMonitorRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeJobMonitorRuleResponseBody setMonitorRules(java.util.List<DescribeJobMonitorRuleResponseBodyMonitorRules> monitorRules) {
        this.monitorRules = monitorRules;
        return this;
    }
    public java.util.List<DescribeJobMonitorRuleResponseBodyMonitorRules> getMonitorRules() {
        return this.monitorRules;
    }

    public DescribeJobMonitorRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJobMonitorRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeJobMonitorRuleResponseBody setTopics(java.util.List<String> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.List<String> getTopics() {
        return this.topics;
    }

    public static class DescribeJobMonitorRuleResponseBodyMonitorRules extends TeaModel {
        @NameInMap("DelayRuleTime")
        public Long delayRuleTime;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("State")
        public String state;

        @NameInMap("Type")
        public String type;

        public static DescribeJobMonitorRuleResponseBodyMonitorRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobMonitorRuleResponseBodyMonitorRules self = new DescribeJobMonitorRuleResponseBodyMonitorRules();
            return TeaModel.build(map, self);
        }

        public DescribeJobMonitorRuleResponseBodyMonitorRules setDelayRuleTime(Long delayRuleTime) {
            this.delayRuleTime = delayRuleTime;
            return this;
        }
        public Long getDelayRuleTime() {
            return this.delayRuleTime;
        }

        public DescribeJobMonitorRuleResponseBodyMonitorRules setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeJobMonitorRuleResponseBodyMonitorRules setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeJobMonitorRuleResponseBodyMonitorRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
