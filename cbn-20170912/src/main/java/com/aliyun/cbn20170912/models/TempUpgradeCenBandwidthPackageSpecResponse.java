// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class TempUpgradeCenBandwidthPackageSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public TempUpgradeCenBandwidthPackageSpecResponse setBody(TempUpgradeCenBandwidthPackageSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public TempUpgradeCenBandwidthPackageSpecResponseBody getBody() {
        return this.body;
    }

}
