// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ListAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppResponseBody body;

    public static ListAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppResponse self = new ListAppResponse();
        return TeaModel.build(map, self);
    }

    public ListAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppResponse setBody(ListAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppResponseBody getBody() {
        return this.body;
    }

}
