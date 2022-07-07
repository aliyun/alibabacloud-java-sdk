// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetPointCommonRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPointCommonRuleResponseBody body;

    public static GetPointCommonRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPointCommonRuleResponse self = new GetPointCommonRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetPointCommonRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPointCommonRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPointCommonRuleResponse setBody(GetPointCommonRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPointCommonRuleResponseBody getBody() {
        return this.body;
    }

}
