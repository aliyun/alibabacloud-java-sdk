// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContactResponseBody body;

    public static ListContactResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContactResponse self = new ListContactResponse();
        return TeaModel.build(map, self);
    }

    public ListContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContactResponse setBody(ListContactResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContactResponseBody getBody() {
        return this.body;
    }

}
