// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetClientPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClientPublicKeyResponseBody body;

    public static GetClientPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientPublicKeyResponse self = new GetClientPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetClientPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClientPublicKeyResponse setBody(GetClientPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientPublicKeyResponseBody getBody() {
        return this.body;
    }

}
