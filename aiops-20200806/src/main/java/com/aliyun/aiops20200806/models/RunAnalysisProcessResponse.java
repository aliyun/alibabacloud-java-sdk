// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class RunAnalysisProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunAnalysisProcessResponseBody body;

    public static RunAnalysisProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        RunAnalysisProcessResponse self = new RunAnalysisProcessResponse();
        return TeaModel.build(map, self);
    }

    public RunAnalysisProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunAnalysisProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunAnalysisProcessResponse setBody(RunAnalysisProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public RunAnalysisProcessResponseBody getBody() {
        return this.body;
    }

}
