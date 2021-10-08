// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMessageResponseBody body;

    public static CreateMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageResponse self = new CreateMessageResponse();
        return TeaModel.build(map, self);
    }

    public CreateMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMessageResponse setBody(CreateMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMessageResponseBody getBody() {
        return this.body;
    }

}
