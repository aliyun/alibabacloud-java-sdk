// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchCreateAICoachTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateAICoachTaskResponseBody body;

    public static BatchCreateAICoachTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateAICoachTaskResponse self = new BatchCreateAICoachTaskResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateAICoachTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateAICoachTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateAICoachTaskResponse setBody(BatchCreateAICoachTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateAICoachTaskResponseBody getBody() {
        return this.body;
    }

}
