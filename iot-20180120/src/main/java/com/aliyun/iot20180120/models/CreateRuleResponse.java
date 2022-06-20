// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
