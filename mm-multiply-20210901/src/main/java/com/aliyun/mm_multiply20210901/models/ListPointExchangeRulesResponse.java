// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListPointExchangeRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPointExchangeRulesResponseBody body;

    public static ListPointExchangeRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPointExchangeRulesResponse self = new ListPointExchangeRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListPointExchangeRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPointExchangeRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPointExchangeRulesResponse setBody(ListPointExchangeRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPointExchangeRulesResponseBody getBody() {
        return this.body;
    }

}
