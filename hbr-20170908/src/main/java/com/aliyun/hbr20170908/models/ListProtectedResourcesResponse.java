// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ListProtectedResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProtectedResourcesResponseBody body;

    public static ListProtectedResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProtectedResourcesResponse self = new ListProtectedResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListProtectedResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProtectedResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProtectedResourcesResponse setBody(ListProtectedResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProtectedResourcesResponseBody getBody() {
        return this.body;
    }

}
