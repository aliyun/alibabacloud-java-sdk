// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCustomHostnamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomHostnamesResponseBody body;

    public static ListCustomHostnamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomHostnamesResponse self = new ListCustomHostnamesResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomHostnamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomHostnamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomHostnamesResponse setBody(ListCustomHostnamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomHostnamesResponseBody getBody() {
        return this.body;
    }

}
