// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateTargetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTargetsResponseBody body;

    public static CreateTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTargetsResponse self = new CreateTargetsResponse();
        return TeaModel.build(map, self);
    }

    public CreateTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTargetsResponse setBody(CreateTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTargetsResponseBody getBody() {
        return this.body;
    }

}
