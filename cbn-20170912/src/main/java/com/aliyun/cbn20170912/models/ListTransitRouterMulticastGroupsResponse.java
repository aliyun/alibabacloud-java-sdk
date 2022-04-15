// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListTransitRouterMulticastGroupsResponse setBody(ListTransitRouterMulticastGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterMulticastGroupsResponseBody getBody() {
        return this.body;
    }

}
