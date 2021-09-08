// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTokenResponseBody body;

    public static CreateTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenResponse self = new CreateTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTokenResponse setBody(CreateTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTokenResponseBody getBody() {
        return this.body;
    }

}
