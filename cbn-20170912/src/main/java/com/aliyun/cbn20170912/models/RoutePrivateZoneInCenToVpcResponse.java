// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RoutePrivateZoneInCenToVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RoutePrivateZoneInCenToVpcResponseBody body;

    public static RoutePrivateZoneInCenToVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        RoutePrivateZoneInCenToVpcResponse self = new RoutePrivateZoneInCenToVpcResponse();
        return TeaModel.build(map, self);
    }

    public RoutePrivateZoneInCenToVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RoutePrivateZoneInCenToVpcResponse setBody(RoutePrivateZoneInCenToVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public RoutePrivateZoneInCenToVpcResponseBody getBody() {
        return this.body;
    }

}
