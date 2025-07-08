// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateCardMessageCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCardMessageCallbackResponseBody body;

    public static CreateCardMessageCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCardMessageCallbackResponse self = new CreateCardMessageCallbackResponse();
        return TeaModel.build(map, self);
    }

    public CreateCardMessageCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCardMessageCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCardMessageCallbackResponse setBody(CreateCardMessageCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCardMessageCallbackResponseBody getBody() {
        return this.body;
    }

}
