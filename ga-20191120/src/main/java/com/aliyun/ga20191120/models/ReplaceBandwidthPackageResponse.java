// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ReplaceBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReplaceBandwidthPackageResponseBody body;

    public static ReplaceBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceBandwidthPackageResponse self = new ReplaceBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceBandwidthPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceBandwidthPackageResponse setBody(ReplaceBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
