// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ReleaseAnycastEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseAnycastEipAddressResponseBody body;

    public static ReleaseAnycastEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAnycastEipAddressResponse self = new ReleaseAnycastEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseAnycastEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseAnycastEipAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseAnycastEipAddressResponse setBody(ReleaseAnycastEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

}
