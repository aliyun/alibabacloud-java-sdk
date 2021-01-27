// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class BandwidthPackageRemoveAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BandwidthPackageRemoveAcceleratorResponse setBody(BandwidthPackageRemoveAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public BandwidthPackageRemoveAcceleratorResponseBody getBody() {
        return this.body;
    }

}
