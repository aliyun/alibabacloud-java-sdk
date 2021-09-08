// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateAuthKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAuthKeyResponseBody body;

    public static CreateAuthKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthKeyResponse self = new CreateAuthKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAuthKeyResponse setBody(CreateAuthKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuthKeyResponseBody getBody() {
        return this.body;
    }

}
