// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiCallTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAiCallTaskResponseBody body;

    public static CreateAiCallTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAiCallTaskResponse self = new CreateAiCallTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAiCallTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAiCallTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAiCallTaskResponse setBody(CreateAiCallTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAiCallTaskResponseBody getBody() {
        return this.body;
    }

}
