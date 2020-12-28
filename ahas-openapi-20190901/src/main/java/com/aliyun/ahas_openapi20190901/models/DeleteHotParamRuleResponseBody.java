// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteHotParamRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DeleteHotParamRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteHotParamRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotParamRuleResponseBody self = new DeleteHotParamRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHotParamRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteHotParamRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteHotParamRuleResponseBody setData(DeleteHotParamRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteHotParamRuleResponseBodyData getData() {
        return this.data;
    }

    public DeleteHotParamRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteHotParamRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteHotParamRuleResponseBodyData extends TeaModel {
        @NameInMap("RuleId")
        public Long ruleId;

        public static DeleteHotParamRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteHotParamRuleResponseBodyData self = new DeleteHotParamRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteHotParamRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
