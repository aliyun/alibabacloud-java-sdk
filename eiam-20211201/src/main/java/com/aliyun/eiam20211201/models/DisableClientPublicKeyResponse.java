// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableClientPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableClientPublicKeyResponseBody body;

    public static DisableClientPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableClientPublicKeyResponse self = new DisableClientPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public DisableClientPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableClientPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableClientPublicKeyResponse setBody(DisableClientPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableClientPublicKeyResponseBody getBody() {
        return this.body;
    }

}
