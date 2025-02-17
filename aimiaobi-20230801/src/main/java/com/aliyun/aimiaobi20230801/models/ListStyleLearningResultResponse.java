// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListStyleLearningResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStyleLearningResultResponseBody body;

    public static ListStyleLearningResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStyleLearningResultResponse self = new ListStyleLearningResultResponse();
        return TeaModel.build(map, self);
    }

    public ListStyleLearningResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStyleLearningResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStyleLearningResultResponse setBody(ListStyleLearningResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStyleLearningResultResponseBody getBody() {
        return this.body;
    }

}
