// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateIntentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateIntentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIntentResponse setBody(UpdateIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIntentResponseBody getBody() {
        return this.body;
    }

}
