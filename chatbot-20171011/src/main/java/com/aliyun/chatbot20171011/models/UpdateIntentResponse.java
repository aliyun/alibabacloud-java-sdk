// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateIntentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIntentResponseBody body;

    public static UpdateIntentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntentResponse self = new UpdateIntentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIntentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIntentResponse setBody(UpdateIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIntentResponseBody getBody() {
        return this.body;
    }

}
