// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCustomSourceTopicAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomSourceTopicAnalysisTaskResponseBody body;

    public static GetCustomSourceTopicAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomSourceTopicAnalysisTaskResponse self = new GetCustomSourceTopicAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomSourceTopicAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomSourceTopicAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomSourceTopicAnalysisTaskResponse setBody(GetCustomSourceTopicAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomSourceTopicAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
