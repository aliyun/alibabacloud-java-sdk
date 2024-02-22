// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListExchangeUpStreamBindingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExchangeUpStreamBindingsResponseBody body;

    public static ListExchangeUpStreamBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExchangeUpStreamBindingsResponse self = new ListExchangeUpStreamBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ListExchangeUpStreamBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExchangeUpStreamBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExchangeUpStreamBindingsResponse setBody(ListExchangeUpStreamBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExchangeUpStreamBindingsResponseBody getBody() {
        return this.body;
    }

}
