// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateOsVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOsVersionResponseBody body;

    public static CreateOsVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOsVersionResponse self = new CreateOsVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateOsVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOsVersionResponse setBody(CreateOsVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOsVersionResponseBody getBody() {
        return this.body;
    }

}
