// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunGenerateQuestionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunGenerateQuestionsResponseBody body;

    public static RunGenerateQuestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        RunGenerateQuestionsResponse self = new RunGenerateQuestionsResponse();
        return TeaModel.build(map, self);
    }

    public RunGenerateQuestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunGenerateQuestionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunGenerateQuestionsResponse setBody(RunGenerateQuestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public RunGenerateQuestionsResponseBody getBody() {
        return this.body;
    }

}
