// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DeleteVideoTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVideoTaskResponseBody body;

    public static DeleteVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoTaskResponse self = new DeleteVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVideoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVideoTaskResponse setBody(DeleteVideoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVideoTaskResponseBody getBody() {
        return this.body;
    }

}
