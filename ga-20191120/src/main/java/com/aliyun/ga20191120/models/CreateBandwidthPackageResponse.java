// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateBandwidthPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBandwidthPackageResponse setBody(CreateBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
