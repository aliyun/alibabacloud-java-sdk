// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateIntentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIntentResponseBody body;

    public static CreateIntentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentResponse self = new CreateIntentResponse();
        return TeaModel.build(map, self);
    }

    public CreateIntentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIntentResponse setBody(CreateIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIntentResponseBody getBody() {
        return this.body;
    }

}
