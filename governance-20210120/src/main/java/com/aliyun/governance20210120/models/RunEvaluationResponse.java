// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class RunEvaluationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunEvaluationResponseBody body;

    public static RunEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunEvaluationResponse self = new RunEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public RunEvaluationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunEvaluationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunEvaluationResponse setBody(RunEvaluationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunEvaluationResponseBody getBody() {
        return this.body;
    }

}
