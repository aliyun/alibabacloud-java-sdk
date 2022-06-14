// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ReleasePublicNetworkAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReleasePublicNetworkAddressResponseBody body;

    public static ReleasePublicNetworkAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicNetworkAddressResponse self = new ReleasePublicNetworkAddressResponse();
        return TeaModel.build(map, self);
    }

    public ReleasePublicNetworkAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleasePublicNetworkAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleasePublicNetworkAddressResponse setBody(ReleasePublicNetworkAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleasePublicNetworkAddressResponseBody getBody() {
        return this.body;
    }

}
