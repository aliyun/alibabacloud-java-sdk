// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitCustomTopicSelectionPerspectiveAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitCustomTopicSelectionPerspectiveAnalysisTaskResponseBody body;

    public static SubmitCustomTopicSelectionPerspectiveAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomTopicSelectionPerspectiveAnalysisTaskResponse self = new SubmitCustomTopicSelectionPerspectiveAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCustomTopicSelectionPerspectiveAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCustomTopicSelectionPerspectiveAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitCustomTopicSelectionPerspectiveAnalysisTaskResponse setBody(SubmitCustomTopicSelectionPerspectiveAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCustomTopicSelectionPerspectiveAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
