// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class BandwidthPackageAddAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BandwidthPackageAddAcceleratorResponseBody body;

    public static BandwidthPackageAddAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        BandwidthPackageAddAcceleratorResponse self = new BandwidthPackageAddAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public BandwidthPackageAddAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BandwidthPackageAddAcceleratorResponse setBody(BandwidthPackageAddAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public BandwidthPackageAddAcceleratorResponseBody getBody() {
        return this.body;
    }

}
