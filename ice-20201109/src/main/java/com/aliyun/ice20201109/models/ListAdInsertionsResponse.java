// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAdInsertionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAdInsertionsResponseBody body;

    public static ListAdInsertionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAdInsertionsResponse self = new ListAdInsertionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAdInsertionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAdInsertionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAdInsertionsResponse setBody(ListAdInsertionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAdInsertionsResponseBody getBody() {
        return this.body;
    }

}
