// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreateMessageCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMessageCallbackResponseBody body;

    public static CreateMessageCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageCallbackResponse self = new CreateMessageCallbackResponse();
        return TeaModel.build(map, self);
    }

    public CreateMessageCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMessageCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMessageCallbackResponse setBody(CreateMessageCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMessageCallbackResponseBody getBody() {
        return this.body;
    }

}
