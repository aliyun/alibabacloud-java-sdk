// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListLogstoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogstoreResponseBody body;

    public static ListLogstoreResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogstoreResponse self = new ListLogstoreResponse();
        return TeaModel.build(map, self);
    }

    public ListLogstoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogstoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogstoreResponse setBody(ListLogstoreResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogstoreResponseBody getBody() {
        return this.body;
    }

}
