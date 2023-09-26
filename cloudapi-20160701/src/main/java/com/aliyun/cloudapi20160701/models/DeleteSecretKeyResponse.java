// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DeleteSecretKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSecretKeyResponseBody body;

    public static DeleteSecretKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretKeyResponse self = new DeleteSecretKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecretKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecretKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecretKeyResponse setBody(DeleteSecretKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecretKeyResponseBody getBody() {
        return this.body;
    }

}
