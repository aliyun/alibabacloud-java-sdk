// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignIpv6AddressesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssignIpv6AddressesResponseBody body;

    public static AssignIpv6AddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignIpv6AddressesResponse self = new AssignIpv6AddressesResponse();
        return TeaModel.build(map, self);
    }

    public AssignIpv6AddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignIpv6AddressesResponse setBody(AssignIpv6AddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignIpv6AddressesResponseBody getBody() {
        return this.body;
    }

}
