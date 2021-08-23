// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreatePerspectiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreatePerspectiveResponse setBody(CreatePerspectiveResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePerspectiveResponseBody getBody() {
        return this.body;
    }

}
