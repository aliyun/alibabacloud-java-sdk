// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class TextFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TextFeedbackResponseBody body;

    public static TextFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        TextFeedbackResponse self = new TextFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public TextFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TextFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TextFeedbackResponse setBody(TextFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public TextFeedbackResponseBody getBody() {
        return this.body;
    }

}
