// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunCustomHotTopicAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunCustomHotTopicAnalysisResponseBody body;

    public static RunCustomHotTopicAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCustomHotTopicAnalysisResponse self = new RunCustomHotTopicAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public RunCustomHotTopicAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunCustomHotTopicAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunCustomHotTopicAnalysisResponse setBody(RunCustomHotTopicAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public RunCustomHotTopicAnalysisResponseBody getBody() {
        return this.body;
    }

}
