// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCenBandwidthPackageResponseBody body;

    public static CreateCenBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCenBandwidthPackageResponse self = new CreateCenBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateCenBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCenBandwidthPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCenBandwidthPackageResponse setBody(CreateCenBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCenBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
