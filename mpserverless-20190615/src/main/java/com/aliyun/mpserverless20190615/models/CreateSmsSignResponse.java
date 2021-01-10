// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateSmsSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSmsSignResponseBody body;

    public static CreateSmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSignResponse self = new CreateSmsSignResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsSignResponse setBody(CreateSmsSignResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsSignResponseBody getBody() {
        return this.body;
    }

}
