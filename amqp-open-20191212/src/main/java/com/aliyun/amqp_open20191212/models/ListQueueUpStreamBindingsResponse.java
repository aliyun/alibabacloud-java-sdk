// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListQueueUpStreamBindingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListQueueUpStreamBindingsResponse setBody(ListQueueUpStreamBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueueUpStreamBindingsResponseBody getBody() {
        return this.body;
    }

}
