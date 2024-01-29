// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteSimQuestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSimQuestionResponseBody body;

    public static DeleteSimQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSimQuestionResponse self = new DeleteSimQuestionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSimQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSimQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSimQuestionResponse setBody(DeleteSimQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSimQuestionResponseBody getBody() {
        return this.body;
    }

}
