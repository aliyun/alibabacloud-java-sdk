// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UnassociateCenBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UnassociateCenBandwidthPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnassociateCenBandwidthPackageResponse setBody(UnassociateCenBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateCenBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
