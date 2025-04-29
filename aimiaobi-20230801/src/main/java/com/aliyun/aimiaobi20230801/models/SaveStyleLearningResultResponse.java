// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveStyleLearningResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveStyleLearningResultResponseBody body;

    public static SaveStyleLearningResultResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveStyleLearningResultResponse self = new SaveStyleLearningResultResponse();
        return TeaModel.build(map, self);
    }

    public SaveStyleLearningResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveStyleLearningResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveStyleLearningResultResponse setBody(SaveStyleLearningResultResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveStyleLearningResultResponseBody getBody() {
        return this.body;
    }

}
