// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterAvailableResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterAvailableResourceResponseBody body;

    public static ListTransitRouterAvailableResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterAvailableResourceResponse self = new ListTransitRouterAvailableResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterAvailableResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterAvailableResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterAvailableResourceResponse setBody(ListTransitRouterAvailableResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterAvailableResourceResponseBody getBody() {
        return this.body;
    }

}
