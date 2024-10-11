// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRuleResponseBody body;

    public static CreateRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleResponse self = new CreateRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRuleResponse setBody(CreateRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRuleResponseBody getBody() {
        return this.body;
    }

}
