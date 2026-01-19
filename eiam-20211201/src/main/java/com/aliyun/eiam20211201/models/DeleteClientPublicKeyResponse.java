// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteClientPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteClientPublicKeyResponseBody body;

    public static DeleteClientPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientPublicKeyResponse self = new DeleteClientPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClientPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClientPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClientPublicKeyResponse setBody(DeleteClientPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClientPublicKeyResponseBody getBody() {
        return this.body;
    }

}
