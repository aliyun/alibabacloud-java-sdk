// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class DeleteAppImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppImageResponseBody body;

    public static DeleteAppImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppImageResponse self = new DeleteAppImageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppImageResponse setBody(DeleteAppImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppImageResponseBody getBody() {
        return this.body;
    }

}
