// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchGetTrainTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetTrainTaskResponseBody body;

    public static BatchGetTrainTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetTrainTaskResponse self = new BatchGetTrainTaskResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetTrainTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetTrainTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetTrainTaskResponse setBody(BatchGetTrainTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetTrainTaskResponseBody getBody() {
        return this.body;
    }

}
