// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenBandwidthPackageSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyCenBandwidthPackageSpecResponse setBody(ModifyCenBandwidthPackageSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCenBandwidthPackageSpecResponseBody getBody() {
        return this.body;
    }

}
