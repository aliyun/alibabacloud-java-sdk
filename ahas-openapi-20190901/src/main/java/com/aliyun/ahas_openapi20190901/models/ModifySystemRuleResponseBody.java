// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ModifySystemRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ModifySystemRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ModifySystemRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySystemRuleResponseBody self = new ModifySystemRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySystemRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySystemRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySystemRuleResponseBody setData(ModifySystemRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifySystemRuleResponseBodyData getData() {
        return this.data;
    }

    public ModifySystemRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySystemRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifySystemRuleResponseBodyData extends TeaModel {
        @NameInMap("MetricType")
        public Integer metricType;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Enable")
        public Boolean enable;

        public static ModifySystemRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifySystemRuleResponseBodyData self = new ModifySystemRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifySystemRuleResponseBodyData setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public ModifySystemRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ModifySystemRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ModifySystemRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
