// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateCustomAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomAnalysisTaskResponseBody body;

    public static CreateCustomAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAnalysisTaskResponse self = new CreateCustomAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomAnalysisTaskResponse setBody(CreateCustomAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
