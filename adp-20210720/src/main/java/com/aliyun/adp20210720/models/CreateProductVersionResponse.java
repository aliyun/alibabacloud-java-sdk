// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProductVersionResponseBody body;

    public static CreateProductVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductVersionResponse self = new CreateProductVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductVersionResponse setBody(CreateProductVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductVersionResponseBody getBody() {
        return this.body;
    }

}
