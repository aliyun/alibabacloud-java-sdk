// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchDeletePracticeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeletePracticeTaskResponseBody body;

    public static BatchDeletePracticeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeletePracticeTaskResponse self = new BatchDeletePracticeTaskResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeletePracticeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeletePracticeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeletePracticeTaskResponse setBody(BatchDeletePracticeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeletePracticeTaskResponseBody getBody() {
        return this.body;
    }

}
