// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class BatchGetYikeAIAppJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetYikeAIAppJobResponseBody body;

    public static BatchGetYikeAIAppJobResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetYikeAIAppJobResponse self = new BatchGetYikeAIAppJobResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetYikeAIAppJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetYikeAIAppJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetYikeAIAppJobResponse setBody(BatchGetYikeAIAppJobResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetYikeAIAppJobResponseBody getBody() {
        return this.body;
    }

}
