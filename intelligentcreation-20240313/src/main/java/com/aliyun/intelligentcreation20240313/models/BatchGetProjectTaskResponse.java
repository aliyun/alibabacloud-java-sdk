// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchGetProjectTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetProjectTaskResponseBody body;

    public static BatchGetProjectTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetProjectTaskResponse self = new BatchGetProjectTaskResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetProjectTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetProjectTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetProjectTaskResponse setBody(BatchGetProjectTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetProjectTaskResponseBody getBody() {
        return this.body;
    }

}
