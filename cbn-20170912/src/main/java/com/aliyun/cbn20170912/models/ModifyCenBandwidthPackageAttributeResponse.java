// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenBandwidthPackageAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCenBandwidthPackageAttributeResponseBody body;

    public static ModifyCenBandwidthPackageAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenBandwidthPackageAttributeResponse self = new ModifyCenBandwidthPackageAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCenBandwidthPackageAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCenBandwidthPackageAttributeResponse setBody(ModifyCenBandwidthPackageAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCenBandwidthPackageAttributeResponseBody getBody() {
        return this.body;
    }

}
