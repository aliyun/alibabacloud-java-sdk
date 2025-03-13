// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchGetVideoClipTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetVideoClipTaskResponseBody body;

    public static BatchGetVideoClipTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetVideoClipTaskResponse self = new BatchGetVideoClipTaskResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetVideoClipTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetVideoClipTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetVideoClipTaskResponse setBody(BatchGetVideoClipTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetVideoClipTaskResponseBody getBody() {
        return this.body;
    }

}
