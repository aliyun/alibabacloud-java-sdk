// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateBotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBotResponseBody body;

    public static CreateBotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBotResponse self = new CreateBotResponse();
        return TeaModel.build(map, self);
    }

    public CreateBotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBotResponse setBody(CreateBotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBotResponseBody getBody() {
        return this.body;
    }

}
