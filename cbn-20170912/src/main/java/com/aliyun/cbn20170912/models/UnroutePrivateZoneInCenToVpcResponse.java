// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UnroutePrivateZoneInCenToVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnroutePrivateZoneInCenToVpcResponseBody body;

    public static UnroutePrivateZoneInCenToVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        UnroutePrivateZoneInCenToVpcResponse self = new UnroutePrivateZoneInCenToVpcResponse();
        return TeaModel.build(map, self);
    }

    public UnroutePrivateZoneInCenToVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnroutePrivateZoneInCenToVpcResponse setBody(UnroutePrivateZoneInCenToVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public UnroutePrivateZoneInCenToVpcResponseBody getBody() {
        return this.body;
    }

}
