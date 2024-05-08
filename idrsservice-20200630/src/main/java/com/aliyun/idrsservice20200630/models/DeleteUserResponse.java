// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserResponseBody body;

    public static DeleteUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserResponse self = new DeleteUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserResponse setBody(DeleteUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserResponseBody getBody() {
        return this.body;
    }

}
