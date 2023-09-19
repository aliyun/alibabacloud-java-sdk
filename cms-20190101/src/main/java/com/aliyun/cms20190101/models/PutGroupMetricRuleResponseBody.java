// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutGroupMetricRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Result")
    public PutGroupMetricRuleResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
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
        /**
         * <p>The ID of the alert rule.</p>
         */
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
