// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnassignIpv6AddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnassignIpv6AddressesResponseBody body;

    public static UnassignIpv6AddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassignIpv6AddressesResponse self = new UnassignIpv6AddressesResponse();
        return TeaModel.build(map, self);
    }

    public UnassignIpv6AddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassignIpv6AddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnassignIpv6AddressesResponse setBody(UnassignIpv6AddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassignIpv6AddressesResponseBody getBody() {
        return this.body;
    }

}
