// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCustomResponseCodeRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomResponseCodeRuleResponseBody body;

    public static CreateCustomResponseCodeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomResponseCodeRuleResponse self = new CreateCustomResponseCodeRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomResponseCodeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomResponseCodeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomResponseCodeRuleResponse setBody(CreateCustomResponseCodeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomResponseCodeRuleResponseBody getBody() {
        return this.body;
    }

}
