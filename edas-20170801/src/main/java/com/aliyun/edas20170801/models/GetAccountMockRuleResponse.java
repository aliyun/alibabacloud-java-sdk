// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetAccountMockRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccountMockRuleResponseBody body;

    public static GetAccountMockRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountMockRuleResponse self = new GetAccountMockRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountMockRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountMockRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountMockRuleResponse setBody(GetAccountMockRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountMockRuleResponseBody getBody() {
        return this.body;
    }

}
