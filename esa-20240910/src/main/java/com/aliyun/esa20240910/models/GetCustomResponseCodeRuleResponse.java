// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCustomResponseCodeRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomResponseCodeRuleResponseBody body;

    public static GetCustomResponseCodeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomResponseCodeRuleResponse self = new GetCustomResponseCodeRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomResponseCodeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomResponseCodeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomResponseCodeRuleResponse setBody(GetCustomResponseCodeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomResponseCodeRuleResponseBody getBody() {
        return this.body;
    }

}
