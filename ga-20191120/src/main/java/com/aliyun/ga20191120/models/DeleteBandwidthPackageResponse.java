// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteBandwidthPackageResponse setBody(DeleteBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
