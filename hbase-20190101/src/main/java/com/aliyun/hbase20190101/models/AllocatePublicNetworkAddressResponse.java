// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class AllocatePublicNetworkAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AllocatePublicNetworkAddressResponseBody body;

    public static AllocatePublicNetworkAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicNetworkAddressResponse self = new AllocatePublicNetworkAddressResponse();
        return TeaModel.build(map, self);
    }

    public AllocatePublicNetworkAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocatePublicNetworkAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocatePublicNetworkAddressResponse setBody(AllocatePublicNetworkAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocatePublicNetworkAddressResponseBody getBody() {
        return this.body;
    }

}
