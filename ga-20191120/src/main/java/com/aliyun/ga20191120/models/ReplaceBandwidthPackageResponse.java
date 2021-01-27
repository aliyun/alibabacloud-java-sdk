// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ReplaceBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ReplaceBandwidthPackageResponse setBody(ReplaceBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
