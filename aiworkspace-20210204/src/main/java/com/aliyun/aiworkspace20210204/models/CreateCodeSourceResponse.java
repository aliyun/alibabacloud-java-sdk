// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateCodeSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCodeSourceResponseBody body;

    public static CreateCodeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeSourceResponse self = new CreateCodeSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateCodeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCodeSourceResponse setBody(CreateCodeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCodeSourceResponseBody getBody() {
        return this.body;
    }

}
