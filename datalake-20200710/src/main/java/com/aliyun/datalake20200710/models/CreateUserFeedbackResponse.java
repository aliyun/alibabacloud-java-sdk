// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateUserFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUserFeedbackResponseBody body;

    public static CreateUserFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserFeedbackResponse self = new CreateUserFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserFeedbackResponse setBody(CreateUserFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserFeedbackResponseBody getBody() {
        return this.body;
    }

}
