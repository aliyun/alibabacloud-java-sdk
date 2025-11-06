// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListExchangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExchangeResponseBody body;

    public static ListExchangeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExchangeResponse self = new ListExchangeResponse();
        return TeaModel.build(map, self);
    }

    public ListExchangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExchangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExchangeResponse setBody(ListExchangeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExchangeResponseBody getBody() {
        return this.body;
    }

}
