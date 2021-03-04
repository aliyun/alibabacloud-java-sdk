// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateKeyResponseBody body;

    public static CreateKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyResponse self = new CreateKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKeyResponse setBody(CreateKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKeyResponseBody getBody() {
        return this.body;
    }

}
