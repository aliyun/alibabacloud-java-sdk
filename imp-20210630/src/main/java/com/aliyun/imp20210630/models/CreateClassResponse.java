// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateClassResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClassResponseBody body;

    public static CreateClassResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClassResponse self = new CreateClassResponse();
        return TeaModel.build(map, self);
    }

    public CreateClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClassResponse setBody(CreateClassResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClassResponseBody getBody() {
        return this.body;
    }

}
