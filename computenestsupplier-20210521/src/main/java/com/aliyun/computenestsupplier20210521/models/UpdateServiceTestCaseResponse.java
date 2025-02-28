// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceTestCaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceTestCaseResponseBody body;

    public static UpdateServiceTestCaseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceTestCaseResponse self = new UpdateServiceTestCaseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceTestCaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceTestCaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceTestCaseResponse setBody(UpdateServiceTestCaseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceTestCaseResponseBody getBody() {
        return this.body;
    }

}
