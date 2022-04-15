// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeregisterTransitRouterMulticastGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeregisterTransitRouterMulticastGroupMembersResponseBody body;

    public static DeregisterTransitRouterMulticastGroupMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeregisterTransitRouterMulticastGroupMembersResponse self = new DeregisterTransitRouterMulticastGroupMembersResponse();
        return TeaModel.build(map, self);
    }

    public DeregisterTransitRouterMulticastGroupMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeregisterTransitRouterMulticastGroupMembersResponse setBody(DeregisterTransitRouterMulticastGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeregisterTransitRouterMulticastGroupMembersResponseBody getBody() {
        return this.body;
    }

}
