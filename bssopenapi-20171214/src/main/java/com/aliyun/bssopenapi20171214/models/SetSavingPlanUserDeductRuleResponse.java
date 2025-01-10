// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetSavingPlanUserDeductRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSavingPlanUserDeductRuleResponseBody body;

    public static SetSavingPlanUserDeductRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSavingPlanUserDeductRuleResponse self = new SetSavingPlanUserDeductRuleResponse();
        return TeaModel.build(map, self);
    }

    public SetSavingPlanUserDeductRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSavingPlanUserDeductRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSavingPlanUserDeductRuleResponse setBody(SetSavingPlanUserDeductRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSavingPlanUserDeductRuleResponseBody getBody() {
        return this.body;
    }

}
