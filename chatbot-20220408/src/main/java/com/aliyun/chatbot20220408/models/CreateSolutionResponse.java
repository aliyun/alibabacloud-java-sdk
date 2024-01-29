// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateSolutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSolutionResponseBody body;

    public static CreateSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSolutionResponse self = new CreateSolutionResponse();
        return TeaModel.build(map, self);
    }

    public CreateSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSolutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSolutionResponse setBody(CreateSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSolutionResponseBody getBody() {
        return this.body;
    }

}
