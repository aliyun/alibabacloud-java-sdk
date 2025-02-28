// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateServiceTestCaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceTestCaseResponseBody body;

    public static CreateServiceTestCaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceTestCaseResponse self = new CreateServiceTestCaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceTestCaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceTestCaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceTestCaseResponse setBody(CreateServiceTestCaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceTestCaseResponseBody getBody() {
        return this.body;
    }

}
