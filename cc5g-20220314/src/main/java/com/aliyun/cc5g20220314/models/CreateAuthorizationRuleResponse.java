// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAuthorizationRuleResponseBody body;

    public static CreateAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationRuleResponse self = new CreateAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAuthorizationRuleResponse setBody(CreateAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
