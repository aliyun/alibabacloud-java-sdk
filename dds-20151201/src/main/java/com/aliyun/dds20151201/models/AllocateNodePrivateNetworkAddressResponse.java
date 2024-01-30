// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class AllocateNodePrivateNetworkAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateNodePrivateNetworkAddressResponseBody body;

    public static AllocateNodePrivateNetworkAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateNodePrivateNetworkAddressResponse self = new AllocateNodePrivateNetworkAddressResponse();
        return TeaModel.build(map, self);
    }

    public AllocateNodePrivateNetworkAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateNodePrivateNetworkAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateNodePrivateNetworkAddressResponse setBody(AllocateNodePrivateNetworkAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateNodePrivateNetworkAddressResponseBody getBody() {
        return this.body;
    }

}
