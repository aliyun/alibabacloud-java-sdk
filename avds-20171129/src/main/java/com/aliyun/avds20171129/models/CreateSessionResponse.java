// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class CreateSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSessionResponseBody body;

    public static CreateSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionResponse self = new CreateSessionResponse();
        return TeaModel.build(map, self);
    }

    public CreateSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSessionResponse setBody(CreateSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSessionResponseBody getBody() {
        return this.body;
    }

}
