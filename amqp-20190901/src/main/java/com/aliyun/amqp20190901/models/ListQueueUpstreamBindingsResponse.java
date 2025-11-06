// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListQueueUpstreamBindingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQueueUpstreamBindingsResponseBody body;

    public static ListQueueUpstreamBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueueUpstreamBindingsResponse self = new ListQueueUpstreamBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ListQueueUpstreamBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueueUpstreamBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQueueUpstreamBindingsResponse setBody(ListQueueUpstreamBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueueUpstreamBindingsResponseBody getBody() {
        return this.body;
    }

}
