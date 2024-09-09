// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunStyleFeatureAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunStyleFeatureAnalysisResponseBody body;

    public static RunStyleFeatureAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        RunStyleFeatureAnalysisResponse self = new RunStyleFeatureAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public RunStyleFeatureAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunStyleFeatureAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunStyleFeatureAnalysisResponse setBody(RunStyleFeatureAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public RunStyleFeatureAnalysisResponseBody getBody() {
        return this.body;
    }

}
