// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteModelConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelConnectionResponseBody body;

    public static DeleteModelConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelConnectionResponse self = new DeleteModelConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelConnectionResponse setBody(DeleteModelConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelConnectionResponseBody getBody() {
        return this.body;
    }

}
