// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterMulticastGroupsResponseBody body;

    public static ListTransitRouterMulticastGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterMulticastGroupsResponse self = new ListTransitRouterMulticastGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterMulticastGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterMulticastGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterMulticastGroupsResponse setBody(ListTransitRouterMulticastGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterMulticastGroupsResponseBody getBody() {
        return this.body;
    }

}
