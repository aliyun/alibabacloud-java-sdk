// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateCustomizedPropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCustomizedPropertyResponseBody body;

    public static CreateCustomizedPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedPropertyResponse self = new CreateCustomizedPropertyResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomizedPropertyResponse setBody(CreateCustomizedPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomizedPropertyResponseBody getBody() {
        return this.body;
    }

}
