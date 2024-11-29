// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCiphersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCiphersResponseBody body;

    public static ListCiphersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCiphersResponse self = new ListCiphersResponse();
        return TeaModel.build(map, self);
    }

    public ListCiphersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCiphersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCiphersResponse setBody(ListCiphersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCiphersResponseBody getBody() {
        return this.body;
    }

}
