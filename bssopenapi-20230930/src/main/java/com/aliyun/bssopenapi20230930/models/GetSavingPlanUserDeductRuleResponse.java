// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetSavingPlanUserDeductRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSavingPlanUserDeductRuleResponseBody body;

    public static GetSavingPlanUserDeductRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSavingPlanUserDeductRuleResponse self = new GetSavingPlanUserDeductRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetSavingPlanUserDeductRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSavingPlanUserDeductRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSavingPlanUserDeductRuleResponse setBody(GetSavingPlanUserDeductRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSavingPlanUserDeductRuleResponseBody getBody() {
        return this.body;
    }

}
