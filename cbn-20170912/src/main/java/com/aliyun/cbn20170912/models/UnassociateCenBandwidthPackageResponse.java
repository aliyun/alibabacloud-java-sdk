// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UnassociateCenBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnassociateCenBandwidthPackageResponseBody body;

    public static UnassociateCenBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateCenBandwidthPackageResponse self = new UnassociateCenBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateCenBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassociateCenBandwidthPackageResponse setBody(UnassociateCenBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateCenBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
