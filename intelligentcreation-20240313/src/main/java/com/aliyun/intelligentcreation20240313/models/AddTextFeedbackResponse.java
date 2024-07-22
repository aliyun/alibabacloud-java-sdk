// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class AddTextFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTextFeedbackResponseBody body;

    public static AddTextFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTextFeedbackResponse self = new AddTextFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public AddTextFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTextFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTextFeedbackResponse setBody(AddTextFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTextFeedbackResponseBody getBody() {
        return this.body;
    }

}
