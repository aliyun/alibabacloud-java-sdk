// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifySrvNetworkAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySrvNetworkAddressResponseBody body;

    public static ModifySrvNetworkAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySrvNetworkAddressResponse self = new ModifySrvNetworkAddressResponse();
        return TeaModel.build(map, self);
    }

    public ModifySrvNetworkAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySrvNetworkAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySrvNetworkAddressResponse setBody(ModifySrvNetworkAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySrvNetworkAddressResponseBody getBody() {
        return this.body;
    }

}
