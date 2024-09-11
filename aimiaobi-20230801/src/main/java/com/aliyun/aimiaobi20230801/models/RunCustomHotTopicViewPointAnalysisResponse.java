// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunCustomHotTopicViewPointAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunCustomHotTopicViewPointAnalysisResponseBody body;

    public static RunCustomHotTopicViewPointAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCustomHotTopicViewPointAnalysisResponse self = new RunCustomHotTopicViewPointAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public RunCustomHotTopicViewPointAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunCustomHotTopicViewPointAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunCustomHotTopicViewPointAnalysisResponse setBody(RunCustomHotTopicViewPointAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public RunCustomHotTopicViewPointAnalysisResponseBody getBody() {
        return this.body;
    }

}
