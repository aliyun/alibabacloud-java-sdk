// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCommandResponseBody body;

    public static CreateCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCommandResponse self = new CreateCommandResponse();
        return TeaModel.build(map, self);
    }

    public CreateCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCommandResponse setBody(CreateCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCommandResponseBody getBody() {
        return this.body;
    }

}
