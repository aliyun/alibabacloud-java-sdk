// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.consolecs20160406.models;

import com.aliyun.tea.*;

public class ListConsoleProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConsoleProductResponseBody body;

    public static ListConsoleProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsoleProductResponse self = new ListConsoleProductResponse();
        return TeaModel.build(map, self);
    }

    public ListConsoleProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsoleProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsoleProductResponse setBody(ListConsoleProductResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsoleProductResponseBody getBody() {
        return this.body;
    }

}
