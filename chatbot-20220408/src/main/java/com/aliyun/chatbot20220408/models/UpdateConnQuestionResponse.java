// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateConnQuestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConnQuestionResponseBody body;

    public static UpdateConnQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnQuestionResponse self = new UpdateConnQuestionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConnQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConnQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConnQuestionResponse setBody(UpdateConnQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConnQuestionResponseBody getBody() {
        return this.body;
    }

}
