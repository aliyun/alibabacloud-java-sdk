// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPrimaryClientPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetPrimaryClientPublicKeyResponseBody body;

    public static SetPrimaryClientPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPrimaryClientPublicKeyResponse self = new SetPrimaryClientPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public SetPrimaryClientPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPrimaryClientPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPrimaryClientPublicKeyResponse setBody(SetPrimaryClientPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPrimaryClientPublicKeyResponseBody getBody() {
        return this.body;
    }

}
