// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class FeedbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public FeedbackResponse setBody(FeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public FeedbackResponseBody getBody() {
        return this.body;
    }

}
