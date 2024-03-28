// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class BandwidthPackageAddAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BandwidthPackageAddAcceleratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BandwidthPackageAddAcceleratorResponse setBody(BandwidthPackageAddAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public BandwidthPackageAddAcceleratorResponseBody getBody() {
        return this.body;
    }

}
