// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AssociateCenBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateCenBandwidthPackageResponseBody body;

    public static AssociateCenBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateCenBandwidthPackageResponse self = new AssociateCenBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public AssociateCenBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateCenBandwidthPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateCenBandwidthPackageResponse setBody(AssociateCenBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateCenBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
