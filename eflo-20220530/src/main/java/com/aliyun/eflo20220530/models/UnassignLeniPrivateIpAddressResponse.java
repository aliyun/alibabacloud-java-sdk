// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UnassignLeniPrivateIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnassignLeniPrivateIpAddressResponseBody body;

    public static UnassignLeniPrivateIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassignLeniPrivateIpAddressResponse self = new UnassignLeniPrivateIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public UnassignLeniPrivateIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassignLeniPrivateIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnassignLeniPrivateIpAddressResponse setBody(UnassignLeniPrivateIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassignLeniPrivateIpAddressResponseBody getBody() {
        return this.body;
    }

}
