// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppKeyResponseBody body;

    public static CreateAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppKeyResponse self = new CreateAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppKeyResponse setBody(CreateAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppKeyResponseBody getBody() {
        return this.body;
    }

}
