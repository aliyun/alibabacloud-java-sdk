// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ReleaseIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseIpAddressResponseBody body;

    public static ReleaseIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseIpAddressResponse self = new ReleaseIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseIpAddressResponse setBody(ReleaseIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseIpAddressResponseBody getBody() {
        return this.body;
    }

}
