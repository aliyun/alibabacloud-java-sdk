// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteAICPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAICPublicKeyResponseBody body;

    public static DeleteAICPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAICPublicKeyResponse self = new DeleteAICPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAICPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAICPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAICPublicKeyResponse setBody(DeleteAICPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAICPublicKeyResponseBody getBody() {
        return this.body;
    }

}
