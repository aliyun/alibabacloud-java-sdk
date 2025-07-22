// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AllocateIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateIpAddressResponseBody body;

    public static AllocateIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpAddressResponse self = new AllocateIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public AllocateIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateIpAddressResponse setBody(AllocateIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateIpAddressResponseBody getBody() {
        return this.body;
    }

}
