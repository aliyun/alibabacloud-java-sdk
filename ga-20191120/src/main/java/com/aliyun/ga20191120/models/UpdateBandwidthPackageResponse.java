// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBandwidthPackageResponseBody body;

    public static UpdateBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBandwidthPackageResponse self = new UpdateBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBandwidthPackageResponse setBody(UpdateBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
