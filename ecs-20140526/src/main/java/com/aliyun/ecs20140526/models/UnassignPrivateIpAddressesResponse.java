// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnassignPrivateIpAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnassignPrivateIpAddressesResponseBody body;

    public static UnassignPrivateIpAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassignPrivateIpAddressesResponse self = new UnassignPrivateIpAddressesResponse();
        return TeaModel.build(map, self);
    }

    public UnassignPrivateIpAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassignPrivateIpAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnassignPrivateIpAddressesResponse setBody(UnassignPrivateIpAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassignPrivateIpAddressesResponseBody getBody() {
        return this.body;
    }

}
