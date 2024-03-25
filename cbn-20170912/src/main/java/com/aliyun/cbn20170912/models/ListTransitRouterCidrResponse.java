// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterCidrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterCidrResponseBody body;

    public static ListTransitRouterCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterCidrResponse self = new ListTransitRouterCidrResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterCidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterCidrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterCidrResponse setBody(ListTransitRouterCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterCidrResponseBody getBody() {
        return this.body;
    }

}
