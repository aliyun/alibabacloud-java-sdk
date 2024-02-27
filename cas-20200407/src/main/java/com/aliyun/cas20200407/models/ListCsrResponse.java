// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCsrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCsrResponseBody body;

    public static ListCsrResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCsrResponse self = new ListCsrResponse();
        return TeaModel.build(map, self);
    }

    public ListCsrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCsrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCsrResponse setBody(ListCsrResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCsrResponseBody getBody() {
        return this.body;
    }

}
