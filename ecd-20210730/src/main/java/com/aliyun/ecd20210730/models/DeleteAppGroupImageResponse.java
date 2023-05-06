// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class DeleteAppGroupImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppGroupImageResponseBody body;

    public static DeleteAppGroupImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppGroupImageResponse self = new DeleteAppGroupImageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppGroupImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppGroupImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppGroupImageResponse setBody(DeleteAppGroupImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppGroupImageResponseBody getBody() {
        return this.body;
    }

}
