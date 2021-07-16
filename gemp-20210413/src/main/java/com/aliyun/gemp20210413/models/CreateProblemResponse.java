// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProblemResponseBody body;

    public static CreateProblemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemResponse self = new CreateProblemResponse();
        return TeaModel.build(map, self);
    }

    public CreateProblemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProblemResponse setBody(CreateProblemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProblemResponseBody getBody() {
        return this.body;
    }

}
