// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class DeletePointExchangeRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePointExchangeRuleResponseBody body;

    public static DeletePointExchangeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePointExchangeRuleResponse self = new DeletePointExchangeRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeletePointExchangeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePointExchangeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePointExchangeRuleResponse setBody(DeletePointExchangeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePointExchangeRuleResponseBody getBody() {
        return this.body;
    }

}
