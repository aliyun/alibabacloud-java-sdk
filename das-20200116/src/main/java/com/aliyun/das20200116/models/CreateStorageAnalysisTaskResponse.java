// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateStorageAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStorageAnalysisTaskResponseBody body;

    public static CreateStorageAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageAnalysisTaskResponse self = new CreateStorageAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateStorageAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStorageAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStorageAnalysisTaskResponse setBody(CreateStorageAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStorageAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
