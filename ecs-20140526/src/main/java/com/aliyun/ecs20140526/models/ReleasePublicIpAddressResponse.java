// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleasePublicIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleasePublicIpAddressResponseBody body;

    public static ReleasePublicIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicIpAddressResponse self = new ReleasePublicIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public ReleasePublicIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleasePublicIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleasePublicIpAddressResponse setBody(ReleasePublicIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleasePublicIpAddressResponseBody getBody() {
        return this.body;
    }

}
