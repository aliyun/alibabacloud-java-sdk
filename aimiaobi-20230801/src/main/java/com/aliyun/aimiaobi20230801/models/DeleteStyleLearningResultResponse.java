// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteStyleLearningResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStyleLearningResultResponseBody body;

    public static DeleteStyleLearningResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStyleLearningResultResponse self = new DeleteStyleLearningResultResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStyleLearningResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStyleLearningResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStyleLearningResultResponse setBody(DeleteStyleLearningResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStyleLearningResultResponseBody getBody() {
        return this.body;
    }

}
