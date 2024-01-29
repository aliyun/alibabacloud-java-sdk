// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateSimQuestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSimQuestionResponseBody body;

    public static CreateSimQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSimQuestionResponse self = new CreateSimQuestionResponse();
        return TeaModel.build(map, self);
    }

    public CreateSimQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSimQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSimQuestionResponse setBody(CreateSimQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSimQuestionResponseBody getBody() {
        return this.body;
    }

}
