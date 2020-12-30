// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSignResponseBody body;

    public static CreateSignResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSignResponse self = new CreateSignResponse();
        return TeaModel.build(map, self);
    }

    public CreateSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSignResponse setBody(CreateSignResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSignResponseBody getBody() {
        return this.body;
    }

}
