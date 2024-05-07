// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteAppSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppSecretResponseBody body;

    public static DeleteAppSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppSecretResponse self = new DeleteAppSecretResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppSecretResponse setBody(DeleteAppSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppSecretResponseBody getBody() {
        return this.body;
    }

}
