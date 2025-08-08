// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListProvidedSharesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProvidedSharesResponseBody body;

    public static ListProvidedSharesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProvidedSharesResponse self = new ListProvidedSharesResponse();
        return TeaModel.build(map, self);
    }

    public ListProvidedSharesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProvidedSharesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProvidedSharesResponse setBody(ListProvidedSharesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProvidedSharesResponseBody getBody() {
        return this.body;
    }

}
