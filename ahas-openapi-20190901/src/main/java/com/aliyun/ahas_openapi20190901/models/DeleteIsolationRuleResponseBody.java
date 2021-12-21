// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteIsolationRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteIsolationRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteIsolationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIsolationRuleResponseBody self = new DeleteIsolationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIsolationRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteIsolationRuleResponseBody setData(DeleteIsolationRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteIsolationRuleResponseBodyData getData() {
        return this.data;
    }

    public DeleteIsolationRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteIsolationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteIsolationRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteIsolationRuleResponseBodyData extends TeaModel {
        @NameInMap("RuleId")
        public Long ruleId;

        public static DeleteIsolationRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteIsolationRuleResponseBodyData self = new DeleteIsolationRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteIsolationRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
