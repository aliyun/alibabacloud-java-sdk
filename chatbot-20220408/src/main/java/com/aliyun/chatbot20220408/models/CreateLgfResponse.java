// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateLgfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLgfResponseBody body;

    public static CreateLgfResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLgfResponse self = new CreateLgfResponse();
        return TeaModel.build(map, self);
    }

    public CreateLgfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLgfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLgfResponse setBody(CreateLgfResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLgfResponseBody getBody() {
        return this.body;
    }

}
