// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListVhostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVhostResponseBody body;

    public static ListVhostResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVhostResponse self = new ListVhostResponse();
        return TeaModel.build(map, self);
    }

    public ListVhostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVhostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVhostResponse setBody(ListVhostResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVhostResponseBody getBody() {
        return this.body;
    }

}
