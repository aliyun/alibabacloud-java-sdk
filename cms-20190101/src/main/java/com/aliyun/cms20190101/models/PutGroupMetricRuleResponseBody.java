// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutGroupMetricRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public PutGroupMetricRuleResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static PutGroupMetricRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutGroupMetricRuleResponseBody self = new PutGroupMetricRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public PutGroupMetricRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutGroupMetricRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutGroupMetricRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutGroupMetricRuleResponseBody setResult(PutGroupMetricRuleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public PutGroupMetricRuleResponseBodyResult getResult() {
        return this.result;
    }

    public PutGroupMetricRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PutGroupMetricRuleResponseBodyResult extends TeaModel {
        @NameInMap("RuleId")
        public String ruleId;

        public static PutGroupMetricRuleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleResponseBodyResult self = new PutGroupMetricRuleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleResponseBodyResult setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
