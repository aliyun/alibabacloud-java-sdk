// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateConnQuestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConnQuestionResponseBody body;

    public static CreateConnQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConnQuestionResponse self = new CreateConnQuestionResponse();
        return TeaModel.build(map, self);
    }

    public CreateConnQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConnQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConnQuestionResponse setBody(CreateConnQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConnQuestionResponseBody getBody() {
        return this.body;
    }

}
