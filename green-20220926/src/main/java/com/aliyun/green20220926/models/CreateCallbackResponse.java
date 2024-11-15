// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreateCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCallbackResponseBody body;

    public static CreateCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCallbackResponse self = new CreateCallbackResponse();
        return TeaModel.build(map, self);
    }

    public CreateCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCallbackResponse setBody(CreateCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCallbackResponseBody getBody() {
        return this.body;
    }

}
