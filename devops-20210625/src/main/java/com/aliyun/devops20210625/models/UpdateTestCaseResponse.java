// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateTestCaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTestCaseResponseBody body;

    public static UpdateTestCaseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTestCaseResponse self = new UpdateTestCaseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTestCaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTestCaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTestCaseResponse setBody(UpdateTestCaseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTestCaseResponseBody getBody() {
        return this.body;
    }

}
