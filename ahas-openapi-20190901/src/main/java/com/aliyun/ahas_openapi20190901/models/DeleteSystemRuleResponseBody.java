// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteSystemRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DeleteSystemRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteSystemRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSystemRuleResponseBody self = new DeleteSystemRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSystemRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSystemRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSystemRuleResponseBody setData(DeleteSystemRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSystemRuleResponseBodyData getData() {
        return this.data;
    }

    public DeleteSystemRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSystemRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteSystemRuleResponseBodyData extends TeaModel {
        @NameInMap("RuleId")
        public Long ruleId;

        public static DeleteSystemRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSystemRuleResponseBodyData self = new DeleteSystemRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSystemRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
