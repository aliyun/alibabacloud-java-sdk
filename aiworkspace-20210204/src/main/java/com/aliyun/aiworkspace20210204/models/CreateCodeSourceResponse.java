// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateCodeSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateCodeSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCodeSourceResponse setBody(CreateCodeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCodeSourceResponseBody getBody() {
        return this.body;
    }

}
