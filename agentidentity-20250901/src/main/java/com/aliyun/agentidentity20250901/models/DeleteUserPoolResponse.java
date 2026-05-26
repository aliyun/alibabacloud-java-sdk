// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteUserPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserPoolResponseBody body;

    public static DeleteUserPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPoolResponse self = new DeleteUserPoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserPoolResponse setBody(DeleteUserPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserPoolResponseBody getBody() {
        return this.body;
    }

}
