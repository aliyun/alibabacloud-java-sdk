// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateFaqResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFaqResponseBody body;

    public static CreateFaqResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFaqResponse self = new CreateFaqResponse();
        return TeaModel.build(map, self);
    }

    public CreateFaqResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFaqResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFaqResponse setBody(CreateFaqResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFaqResponseBody getBody() {
        return this.body;
    }

}
