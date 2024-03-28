// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class BandwidthPackageRemoveAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BandwidthPackageRemoveAcceleratorResponseBody body;

    public static BandwidthPackageRemoveAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        BandwidthPackageRemoveAcceleratorResponse self = new BandwidthPackageRemoveAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public BandwidthPackageRemoveAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BandwidthPackageRemoveAcceleratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BandwidthPackageRemoveAcceleratorResponse setBody(BandwidthPackageRemoveAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public BandwidthPackageRemoveAcceleratorResponseBody getBody() {
        return this.body;
    }

}
