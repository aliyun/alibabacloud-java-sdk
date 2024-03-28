// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBandwidthPackageResponseBody body;

    public static DeleteBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBandwidthPackageResponse self = new DeleteBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBandwidthPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBandwidthPackageResponse setBody(DeleteBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
