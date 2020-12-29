// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class CreateDocTranslateTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDocTranslateTaskResponseBody body;

    public static CreateDocTranslateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDocTranslateTaskResponse self = new CreateDocTranslateTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDocTranslateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDocTranslateTaskResponse setBody(CreateDocTranslateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDocTranslateTaskResponseBody getBody() {
        return this.body;
    }

}
