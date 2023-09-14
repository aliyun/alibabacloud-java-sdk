// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateRuleResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code. The HTTP status code 200 indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateRuleResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values: true and false.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleResponseBody self = new CreateRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRuleResponseBody setData(CreateRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateRuleResponseBodyData getData() {
        return this.data;
    }

    public CreateRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateRuleResponseBodyData extends TeaModel {
        /**
         * <p>The ARN of the event rule. The ARN is used for authorization.</p>
         */
        @NameInMap("RuleARN")
        public String ruleARN;

        public static CreateRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleResponseBodyData self = new CreateRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateRuleResponseBodyData setRuleARN(String ruleARN) {
            this.ruleARN = ruleARN;
            return this;
        }
        public String getRuleARN() {
            return this.ruleARN;
        }

    }

}
