// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateGameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGameResponseBody body;

    public static CreateGameResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGameResponse self = new CreateGameResponse();
        return TeaModel.build(map, self);
    }

    public CreateGameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGameResponse setBody(CreateGameResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGameResponseBody getBody() {
        return this.body;
    }

}
