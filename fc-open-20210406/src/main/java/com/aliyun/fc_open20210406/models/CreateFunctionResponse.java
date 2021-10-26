// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFunctionResponseBody body;

    public static CreateFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionResponse self = new CreateFunctionResponse();
        return TeaModel.build(map, self);
    }

    public CreateFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFunctionResponse setBody(CreateFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFunctionResponseBody getBody() {
        return this.body;
    }

}
