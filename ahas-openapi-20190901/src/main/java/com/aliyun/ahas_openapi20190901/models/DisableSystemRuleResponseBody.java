// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DisableSystemRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DisableSystemRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DisableSystemRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSystemRuleResponseBody self = new DisableSystemRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSystemRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableSystemRuleResponseBody setData(DisableSystemRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisableSystemRuleResponseBodyData getData() {
        return this.data;
    }

    public DisableSystemRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableSystemRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableSystemRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DisableSystemRuleResponseBodyData extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("MetricType")
        public Integer metricType;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Threshold")
        public Float threshold;

        public static DisableSystemRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisableSystemRuleResponseBodyData self = new DisableSystemRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisableSystemRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DisableSystemRuleResponseBodyData setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public DisableSystemRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DisableSystemRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
