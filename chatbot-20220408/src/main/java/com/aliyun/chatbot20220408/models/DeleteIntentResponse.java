// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteIntentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIntentResponseBody body;

    public static DeleteIntentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntentResponse self = new DeleteIntentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIntentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIntentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIntentResponse setBody(DeleteIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIntentResponseBody getBody() {
        return this.body;
    }

}
