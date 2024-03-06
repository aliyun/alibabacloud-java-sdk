// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DisableKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableKeyResponseBody body;

    public static DisableKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableKeyResponse self = new DisableKeyResponse();
        return TeaModel.build(map, self);
    }

    public DisableKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableKeyResponse setBody(DisableKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableKeyResponseBody getBody() {
        return this.body;
    }

}
