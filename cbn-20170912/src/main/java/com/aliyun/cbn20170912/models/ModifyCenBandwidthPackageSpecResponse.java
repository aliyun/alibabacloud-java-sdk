// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenBandwidthPackageSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCenBandwidthPackageSpecResponseBody body;

    public static ModifyCenBandwidthPackageSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenBandwidthPackageSpecResponse self = new ModifyCenBandwidthPackageSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCenBandwidthPackageSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCenBandwidthPackageSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCenBandwidthPackageSpecResponse setBody(ModifyCenBandwidthPackageSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCenBandwidthPackageSpecResponseBody getBody() {
        return this.body;
    }

}
