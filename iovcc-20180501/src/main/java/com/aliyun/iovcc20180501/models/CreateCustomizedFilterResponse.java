// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateCustomizedFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCustomizedFilterResponseBody body;

    public static CreateCustomizedFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedFilterResponse self = new CreateCustomizedFilterResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomizedFilterResponse setBody(CreateCustomizedFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomizedFilterResponseBody getBody() {
        return this.body;
    }

}
