// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class FeedbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FeedbackResponseBody body;

    public static FeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        FeedbackResponse self = new FeedbackResponse();
        return TeaModel.build(map, self);
    }

    public FeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FeedbackResponse setBody(FeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public FeedbackResponseBody getBody() {
        return this.body;
    }

}
