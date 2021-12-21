// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateSystemRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateSystemRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateSystemRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSystemRuleResponseBody self = new CreateSystemRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSystemRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSystemRuleResponseBody setData(CreateSystemRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSystemRuleResponseBodyData getData() {
        return this.data;
    }

    public CreateSystemRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSystemRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSystemRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSystemRuleResponseBodyData extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("MetricType")
        public Integer metricType;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Threshold")
        public Float threshold;

        public static CreateSystemRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSystemRuleResponseBodyData self = new CreateSystemRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSystemRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateSystemRuleResponseBodyData setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public CreateSystemRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public CreateSystemRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
