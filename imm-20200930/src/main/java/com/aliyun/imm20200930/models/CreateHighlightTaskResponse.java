// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateHighlightTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHighlightTaskResponseBody body;

    public static CreateHighlightTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHighlightTaskResponse self = new CreateHighlightTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateHighlightTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHighlightTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHighlightTaskResponse setBody(CreateHighlightTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHighlightTaskResponseBody getBody() {
        return this.body;
    }

}
