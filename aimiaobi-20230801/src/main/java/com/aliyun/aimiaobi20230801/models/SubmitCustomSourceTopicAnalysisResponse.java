// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitCustomSourceTopicAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitCustomSourceTopicAnalysisResponseBody body;

    public static SubmitCustomSourceTopicAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomSourceTopicAnalysisResponse self = new SubmitCustomSourceTopicAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCustomSourceTopicAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCustomSourceTopicAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitCustomSourceTopicAnalysisResponse setBody(SubmitCustomSourceTopicAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCustomSourceTopicAnalysisResponseBody getBody() {
        return this.body;
    }

}
