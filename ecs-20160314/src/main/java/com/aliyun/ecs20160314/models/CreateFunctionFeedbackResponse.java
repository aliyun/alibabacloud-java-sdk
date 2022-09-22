// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateFunctionFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFunctionFeedbackResponseBody body;

    public static CreateFunctionFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionFeedbackResponse self = new CreateFunctionFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public CreateFunctionFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFunctionFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFunctionFeedbackResponse setBody(CreateFunctionFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFunctionFeedbackResponseBody getBody() {
        return this.body;
    }

}
