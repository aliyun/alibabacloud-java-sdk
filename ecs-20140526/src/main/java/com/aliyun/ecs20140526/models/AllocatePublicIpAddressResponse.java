// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocatePublicIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocatePublicIpAddressResponseBody body;

    public static AllocatePublicIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicIpAddressResponse self = new AllocatePublicIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public AllocatePublicIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocatePublicIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocatePublicIpAddressResponse setBody(AllocatePublicIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocatePublicIpAddressResponseBody getBody() {
        return this.body;
    }

}
