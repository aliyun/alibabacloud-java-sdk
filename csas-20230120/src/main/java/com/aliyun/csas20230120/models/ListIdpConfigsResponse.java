// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListIdpConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIdpConfigsResponseBody body;

    public static ListIdpConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIdpConfigsResponse self = new ListIdpConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListIdpConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIdpConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIdpConfigsResponse setBody(ListIdpConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIdpConfigsResponseBody getBody() {
        return this.body;
    }

}
