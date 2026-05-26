// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteUserPoolClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserPoolClientResponseBody body;

    public static DeleteUserPoolClientResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPoolClientResponse self = new DeleteUserPoolClientResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserPoolClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserPoolClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserPoolClientResponse setBody(DeleteUserPoolClientResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserPoolClientResponseBody getBody() {
        return this.body;
    }

}
