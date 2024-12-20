// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class SubmitChatQuestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitChatQuestionResponseBody body;

    public static SubmitChatQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitChatQuestionResponse self = new SubmitChatQuestionResponse();
        return TeaModel.build(map, self);
    }

    public SubmitChatQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitChatQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitChatQuestionResponse setBody(SubmitChatQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitChatQuestionResponseBody getBody() {
        return this.body;
    }

}
