// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListExchangeUpstreamBindingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExchangeUpstreamBindingsResponseBody body;

    public static ListExchangeUpstreamBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExchangeUpstreamBindingsResponse self = new ListExchangeUpstreamBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ListExchangeUpstreamBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExchangeUpstreamBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExchangeUpstreamBindingsResponse setBody(ListExchangeUpstreamBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExchangeUpstreamBindingsResponseBody getBody() {
        return this.body;
    }

}
