// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeregisterTransitRouterMulticastGroupSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeregisterTransitRouterMulticastGroupSourcesResponseBody body;

    public static DeregisterTransitRouterMulticastGroupSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeregisterTransitRouterMulticastGroupSourcesResponse self = new DeregisterTransitRouterMulticastGroupSourcesResponse();
        return TeaModel.build(map, self);
    }

    public DeregisterTransitRouterMulticastGroupSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeregisterTransitRouterMulticastGroupSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeregisterTransitRouterMulticastGroupSourcesResponse setBody(DeregisterTransitRouterMulticastGroupSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeregisterTransitRouterMulticastGroupSourcesResponseBody getBody() {
        return this.body;
    }

}
