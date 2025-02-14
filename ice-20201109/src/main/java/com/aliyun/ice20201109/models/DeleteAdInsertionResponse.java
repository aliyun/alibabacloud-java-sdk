// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteAdInsertionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAdInsertionResponseBody body;

    public static DeleteAdInsertionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdInsertionResponse self = new DeleteAdInsertionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAdInsertionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAdInsertionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAdInsertionResponse setBody(DeleteAdInsertionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAdInsertionResponseBody getBody() {
        return this.body;
    }

}
