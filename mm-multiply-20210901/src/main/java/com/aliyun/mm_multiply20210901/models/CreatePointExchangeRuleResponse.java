// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CreatePointExchangeRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePointExchangeRuleResponseBody body;

    public static CreatePointExchangeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePointExchangeRuleResponse self = new CreatePointExchangeRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreatePointExchangeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePointExchangeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePointExchangeRuleResponse setBody(CreatePointExchangeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePointExchangeRuleResponseBody getBody() {
        return this.body;
    }

}
