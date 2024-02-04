// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFigureClustersMergingTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFigureClustersMergingTaskResponseBody body;

    public static CreateFigureClustersMergingTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFigureClustersMergingTaskResponse self = new CreateFigureClustersMergingTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateFigureClustersMergingTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFigureClustersMergingTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFigureClustersMergingTaskResponse setBody(CreateFigureClustersMergingTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFigureClustersMergingTaskResponseBody getBody() {
        return this.body;
    }

}
