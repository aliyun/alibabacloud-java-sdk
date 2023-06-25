// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteUserKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserKeyResponseBody body;

    public static DeleteUserKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserKeyResponse self = new DeleteUserKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserKeyResponse setBody(DeleteUserKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserKeyResponseBody getBody() {
        return this.body;
    }

}
