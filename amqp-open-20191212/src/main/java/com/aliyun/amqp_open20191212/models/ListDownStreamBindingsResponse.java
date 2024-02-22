// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListDownStreamBindingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDownStreamBindingsResponseBody body;

    public static ListDownStreamBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDownStreamBindingsResponse self = new ListDownStreamBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ListDownStreamBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDownStreamBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDownStreamBindingsResponse setBody(ListDownStreamBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDownStreamBindingsResponseBody getBody() {
        return this.body;
    }

}
