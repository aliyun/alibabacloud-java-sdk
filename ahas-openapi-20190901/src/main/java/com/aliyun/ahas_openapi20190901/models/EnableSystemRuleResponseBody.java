// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class EnableSystemRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EnableSystemRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnableSystemRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSystemRuleResponseBody self = new EnableSystemRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSystemRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableSystemRuleResponseBody setData(EnableSystemRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnableSystemRuleResponseBodyData getData() {
        return this.data;
    }

    public EnableSystemRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableSystemRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableSystemRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnableSystemRuleResponseBodyData extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("MetricType")
        public Integer metricType;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Threshold")
        public Float threshold;

        public static EnableSystemRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnableSystemRuleResponseBodyData self = new EnableSystemRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnableSystemRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public EnableSystemRuleResponseBodyData setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public EnableSystemRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public EnableSystemRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
