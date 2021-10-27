// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateMyCatEvaluateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMyCatEvaluateResponseBody body;

    public static CreateMyCatEvaluateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMyCatEvaluateResponse self = new CreateMyCatEvaluateResponse();
        return TeaModel.build(map, self);
    }

    public CreateMyCatEvaluateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMyCatEvaluateResponse setBody(CreateMyCatEvaluateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMyCatEvaluateResponseBody getBody() {
        return this.body;
    }

}
