// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdatePointExchangeRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePointExchangeRuleResponseBody body;

    public static UpdatePointExchangeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePointExchangeRuleResponse self = new UpdatePointExchangeRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePointExchangeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePointExchangeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePointExchangeRuleResponse setBody(UpdatePointExchangeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePointExchangeRuleResponseBody getBody() {
        return this.body;
    }

}
