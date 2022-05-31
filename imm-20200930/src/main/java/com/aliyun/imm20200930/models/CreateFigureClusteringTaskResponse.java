// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFigureClusteringTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFigureClusteringTaskResponseBody body;

    public static CreateFigureClusteringTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFigureClusteringTaskResponse self = new CreateFigureClusteringTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateFigureClusteringTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFigureClusteringTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFigureClusteringTaskResponse setBody(CreateFigureClusteringTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFigureClusteringTaskResponseBody getBody() {
        return this.body;
    }

}
