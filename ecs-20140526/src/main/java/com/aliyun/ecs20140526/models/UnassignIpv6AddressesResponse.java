// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnassignIpv6AddressesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UnassignIpv6AddressesResponse setBody(UnassignIpv6AddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassignIpv6AddressesResponseBody getBody() {
        return this.body;
    }

}
