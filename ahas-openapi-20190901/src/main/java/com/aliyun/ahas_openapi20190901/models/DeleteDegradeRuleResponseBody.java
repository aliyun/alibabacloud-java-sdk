// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteDegradeRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteDegradeRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteDegradeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDegradeRuleResponseBody self = new DeleteDegradeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDegradeRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteDegradeRuleResponseBody setData(DeleteDegradeRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDegradeRuleResponseBodyData getData() {
        return this.data;
    }

    public DeleteDegradeRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteDegradeRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDegradeRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteDegradeRuleResponseBodyData extends TeaModel {
        @NameInMap("RuleId")
        public Long ruleId;

        public static DeleteDegradeRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDegradeRuleResponseBodyData self = new DeleteDegradeRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDegradeRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
