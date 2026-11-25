// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateMultiModalTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMultiModalTaskResponseBody body;

    public static CreateMultiModalTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiModalTaskResponse self = new CreateMultiModalTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMultiModalTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMultiModalTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMultiModalTaskResponse setBody(CreateMultiModalTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMultiModalTaskResponseBody getBody() {
        return this.body;
    }

}
