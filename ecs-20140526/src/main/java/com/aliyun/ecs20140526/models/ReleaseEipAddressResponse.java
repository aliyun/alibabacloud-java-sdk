// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleaseEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseEipAddressResponseBody body;

    public static ReleaseEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseEipAddressResponse self = new ReleaseEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseEipAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseEipAddressResponse setBody(ReleaseEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseEipAddressResponseBody getBody() {
        return this.body;
    }

}
