// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AssociateCenBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AssociateCenBandwidthPackageResponse setBody(AssociateCenBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateCenBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
