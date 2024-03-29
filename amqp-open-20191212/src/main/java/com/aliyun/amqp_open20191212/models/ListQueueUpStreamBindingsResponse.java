// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListQueueUpStreamBindingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQueueUpStreamBindingsResponseBody body;

    public static ListQueueUpStreamBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueueUpStreamBindingsResponse self = new ListQueueUpStreamBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ListQueueUpStreamBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueueUpStreamBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQueueUpStreamBindingsResponse setBody(ListQueueUpStreamBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueueUpStreamBindingsResponseBody getBody() {
        return this.body;
    }

}
