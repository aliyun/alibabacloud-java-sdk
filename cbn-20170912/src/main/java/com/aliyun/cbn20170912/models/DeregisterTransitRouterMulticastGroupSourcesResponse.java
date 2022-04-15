// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeregisterTransitRouterMulticastGroupSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeregisterTransitRouterMulticastGroupSourcesResponse setBody(DeregisterTransitRouterMulticastGroupSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeregisterTransitRouterMulticastGroupSourcesResponseBody getBody() {
        return this.body;
    }

}
