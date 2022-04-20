// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateSensitiveWordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSensitiveWordResponseBody body;

    public static CreateSensitiveWordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSensitiveWordResponse self = new CreateSensitiveWordResponse();
        return TeaModel.build(map, self);
    }

    public CreateSensitiveWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSensitiveWordResponse setBody(CreateSensitiveWordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSensitiveWordResponseBody getBody() {
        return this.body;
    }

}
