// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListExchangeDownstreamBindingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExchangeDownstreamBindingsResponseBody body;

    public static ListExchangeDownstreamBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExchangeDownstreamBindingsResponse self = new ListExchangeDownstreamBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ListExchangeDownstreamBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExchangeDownstreamBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExchangeDownstreamBindingsResponse setBody(ListExchangeDownstreamBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExchangeDownstreamBindingsResponseBody getBody() {
        return this.body;
    }

}
