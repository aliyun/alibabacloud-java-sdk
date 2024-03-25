// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterCidrAllocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterCidrAllocationResponseBody body;

    public static ListTransitRouterCidrAllocationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterCidrAllocationResponse self = new ListTransitRouterCidrAllocationResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterCidrAllocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterCidrAllocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterCidrAllocationResponse setBody(ListTransitRouterCidrAllocationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterCidrAllocationResponseBody getBody() {
        return this.body;
    }

}
