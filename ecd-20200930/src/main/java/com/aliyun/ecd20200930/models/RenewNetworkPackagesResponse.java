// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewNetworkPackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RenewNetworkPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewNetworkPackagesResponse setBody(RenewNetworkPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewNetworkPackagesResponseBody getBody() {
        return this.body;
    }

}
