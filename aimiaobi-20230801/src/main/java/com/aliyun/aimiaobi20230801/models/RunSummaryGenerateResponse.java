// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSummaryGenerateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunSummaryGenerateResponseBody body;

    public static RunSummaryGenerateResponse build(java.util.Map<String, ?> map) throws Exception {
        RunSummaryGenerateResponse self = new RunSummaryGenerateResponse();
        return TeaModel.build(map, self);
    }

    public RunSummaryGenerateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunSummaryGenerateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunSummaryGenerateResponse setBody(RunSummaryGenerateResponseBody body) {
        this.body = body;
        return this;
    }
    public RunSummaryGenerateResponseBody getBody() {
        return this.body;
    }

}
