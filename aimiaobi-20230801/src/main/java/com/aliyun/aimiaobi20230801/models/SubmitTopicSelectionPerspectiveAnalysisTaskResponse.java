// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitTopicSelectionPerspectiveAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody body;

    public static SubmitTopicSelectionPerspectiveAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTopicSelectionPerspectiveAnalysisTaskResponse self = new SubmitTopicSelectionPerspectiveAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskResponse setBody(SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
