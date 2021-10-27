// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class EnableInstanceIpv6AddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableInstanceIpv6AddressResponseBody body;

    public static EnableInstanceIpv6AddressResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableInstanceIpv6AddressResponse self = new EnableInstanceIpv6AddressResponse();
        return TeaModel.build(map, self);
    }

    public EnableInstanceIpv6AddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableInstanceIpv6AddressResponse setBody(EnableInstanceIpv6AddressResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableInstanceIpv6AddressResponseBody getBody() {
        return this.body;
    }

}
