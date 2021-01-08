// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class CreateDiversifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDiversifyResponseBody body;

    public static CreateDiversifyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiversifyResponse self = new CreateDiversifyResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiversifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiversifyResponse setBody(CreateDiversifyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiversifyResponseBody getBody() {
        return this.body;
    }

}
