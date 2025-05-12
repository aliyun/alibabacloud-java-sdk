// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetStyleLearningResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStyleLearningResultResponseBody body;

    public static GetStyleLearningResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStyleLearningResultResponse self = new GetStyleLearningResultResponse();
        return TeaModel.build(map, self);
    }

    public GetStyleLearningResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStyleLearningResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStyleLearningResultResponse setBody(GetStyleLearningResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStyleLearningResultResponseBody getBody() {
        return this.body;
    }

}
