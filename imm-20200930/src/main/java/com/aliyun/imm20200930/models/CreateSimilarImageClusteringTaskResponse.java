// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateSimilarImageClusteringTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSimilarImageClusteringTaskResponseBody body;

    public static CreateSimilarImageClusteringTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSimilarImageClusteringTaskResponse self = new CreateSimilarImageClusteringTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSimilarImageClusteringTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSimilarImageClusteringTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSimilarImageClusteringTaskResponse setBody(CreateSimilarImageClusteringTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSimilarImageClusteringTaskResponseBody getBody() {
        return this.body;
    }

}
