// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBandwidthPackageResponseBody body;

    public static CreateBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBandwidthPackageResponse self = new CreateBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBandwidthPackageResponse setBody(CreateBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
