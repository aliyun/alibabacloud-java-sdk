// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableClientPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableClientPublicKeyResponseBody body;

    public static EnableClientPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableClientPublicKeyResponse self = new EnableClientPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public EnableClientPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableClientPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableClientPublicKeyResponse setBody(EnableClientPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableClientPublicKeyResponseBody getBody() {
        return this.body;
    }

}
