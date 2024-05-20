// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ListAppSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppSessionsResponseBody body;

    public static ListAppSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppSessionsResponse self = new ListAppSessionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppSessionsResponse setBody(ListAppSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppSessionsResponseBody getBody() {
        return this.body;
    }

}
