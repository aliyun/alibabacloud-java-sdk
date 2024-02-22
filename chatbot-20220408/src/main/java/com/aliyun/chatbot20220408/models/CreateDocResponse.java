// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDocResponseBody body;

    public static CreateDocResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDocResponse self = new CreateDocResponse();
        return TeaModel.build(map, self);
    }

    public CreateDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDocResponse setBody(CreateDocResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDocResponseBody getBody() {
        return this.body;
    }

}
