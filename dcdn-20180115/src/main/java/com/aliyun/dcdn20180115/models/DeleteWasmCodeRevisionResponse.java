// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteWasmCodeRevisionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWasmCodeRevisionResponseBody body;

    public static DeleteWasmCodeRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWasmCodeRevisionResponse self = new DeleteWasmCodeRevisionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWasmCodeRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWasmCodeRevisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWasmCodeRevisionResponse setBody(DeleteWasmCodeRevisionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWasmCodeRevisionResponseBody getBody() {
        return this.body;
    }

}
