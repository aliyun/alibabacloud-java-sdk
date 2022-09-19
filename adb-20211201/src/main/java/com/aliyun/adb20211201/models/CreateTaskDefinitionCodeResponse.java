// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateTaskDefinitionCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTaskDefinitionCodeResponseBody body;

    public static CreateTaskDefinitionCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskDefinitionCodeResponse self = new CreateTaskDefinitionCodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateTaskDefinitionCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTaskDefinitionCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTaskDefinitionCodeResponse setBody(CreateTaskDefinitionCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTaskDefinitionCodeResponseBody getBody() {
        return this.body;
    }

}
