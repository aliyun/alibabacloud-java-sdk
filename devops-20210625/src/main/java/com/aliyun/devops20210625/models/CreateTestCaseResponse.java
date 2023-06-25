// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateTestCaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTestCaseResponseBody body;

    public static CreateTestCaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTestCaseResponse self = new CreateTestCaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateTestCaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTestCaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTestCaseResponse setBody(CreateTestCaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTestCaseResponseBody getBody() {
        return this.body;
    }

}
