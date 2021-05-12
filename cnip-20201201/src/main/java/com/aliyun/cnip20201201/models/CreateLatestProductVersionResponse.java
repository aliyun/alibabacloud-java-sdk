// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateLatestProductVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLatestProductVersionResponseBody body;

    public static CreateLatestProductVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLatestProductVersionResponse self = new CreateLatestProductVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateLatestProductVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLatestProductVersionResponse setBody(CreateLatestProductVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLatestProductVersionResponseBody getBody() {
        return this.body;
    }

}
