// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ReplaceBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
