// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateBandwidthPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBandwidthPackageResponse setBody(UpdateBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
