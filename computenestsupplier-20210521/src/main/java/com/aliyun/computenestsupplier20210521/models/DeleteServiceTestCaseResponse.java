// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeleteServiceTestCaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceTestCaseResponseBody body;

    public static DeleteServiceTestCaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceTestCaseResponse self = new DeleteServiceTestCaseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceTestCaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceTestCaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceTestCaseResponse setBody(DeleteServiceTestCaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceTestCaseResponseBody getBody() {
        return this.body;
    }

}
