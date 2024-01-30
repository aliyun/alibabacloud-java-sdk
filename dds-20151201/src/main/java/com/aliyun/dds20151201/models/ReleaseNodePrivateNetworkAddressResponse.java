// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ReleaseNodePrivateNetworkAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseNodePrivateNetworkAddressResponseBody body;

    public static ReleaseNodePrivateNetworkAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseNodePrivateNetworkAddressResponse self = new ReleaseNodePrivateNetworkAddressResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseNodePrivateNetworkAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseNodePrivateNetworkAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseNodePrivateNetworkAddressResponse setBody(ReleaseNodePrivateNetworkAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseNodePrivateNetworkAddressResponseBody getBody() {
        return this.body;
    }

}
