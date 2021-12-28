// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewNetworkPackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenewNetworkPackagesResponseBody body;

    public static RenewNetworkPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewNetworkPackagesResponse self = new RenewNetworkPackagesResponse();
        return TeaModel.build(map, self);
    }

    public RenewNetworkPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewNetworkPackagesResponse setBody(RenewNetworkPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewNetworkPackagesResponseBody getBody() {
        return this.body;
    }

}
