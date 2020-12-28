// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListBindingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBindingsResponseBody body;

    public static ListBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBindingsResponse self = new ListBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ListBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBindingsResponse setBody(ListBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBindingsResponseBody getBody() {
        return this.body;
    }

}
