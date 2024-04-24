// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class EnableInstanceIpv6AddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public EnableInstanceIpv6AddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableInstanceIpv6AddressResponse setBody(EnableInstanceIpv6AddressResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableInstanceIpv6AddressResponseBody getBody() {
        return this.body;
    }

}
