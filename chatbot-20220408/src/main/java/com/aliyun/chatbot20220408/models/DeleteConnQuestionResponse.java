// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteConnQuestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConnQuestionResponseBody body;

    public static DeleteConnQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnQuestionResponse self = new DeleteConnQuestionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConnQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConnQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConnQuestionResponse setBody(DeleteConnQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConnQuestionResponseBody getBody() {
        return this.body;
    }

}
