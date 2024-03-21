// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreatePerspectiveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePerspectiveResponseBody body;

    public static CreatePerspectiveResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePerspectiveResponse self = new CreatePerspectiveResponse();
        return TeaModel.build(map, self);
    }

    public CreatePerspectiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePerspectiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePerspectiveResponse setBody(CreatePerspectiveResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePerspectiveResponseBody getBody() {
        return this.body;
    }

}
