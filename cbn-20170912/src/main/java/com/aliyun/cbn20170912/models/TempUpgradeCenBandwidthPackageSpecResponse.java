// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class TempUpgradeCenBandwidthPackageSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TempUpgradeCenBandwidthPackageSpecResponseBody body;

    public static TempUpgradeCenBandwidthPackageSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        TempUpgradeCenBandwidthPackageSpecResponse self = new TempUpgradeCenBandwidthPackageSpecResponse();
        return TeaModel.build(map, self);
    }

    public TempUpgradeCenBandwidthPackageSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TempUpgradeCenBandwidthPackageSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TempUpgradeCenBandwidthPackageSpecResponse setBody(TempUpgradeCenBandwidthPackageSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public TempUpgradeCenBandwidthPackageSpecResponseBody getBody() {
        return this.body;
    }

}
