// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteFlowRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DeleteFlowRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteFlowRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowRuleResponseBody self = new DeleteFlowRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFlowRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteFlowRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFlowRuleResponseBody setData(DeleteFlowRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteFlowRuleResponseBodyData getData() {
        return this.data;
    }

    public DeleteFlowRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteFlowRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteFlowRuleResponseBodyData extends TeaModel {
        @NameInMap("RuleId")
        public Long ruleId;

        public static DeleteFlowRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteFlowRuleResponseBodyData self = new DeleteFlowRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteFlowRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
