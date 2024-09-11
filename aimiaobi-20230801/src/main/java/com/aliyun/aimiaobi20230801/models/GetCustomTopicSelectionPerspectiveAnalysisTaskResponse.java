// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCustomTopicSelectionPerspectiveAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody body;

    public static GetCustomTopicSelectionPerspectiveAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomTopicSelectionPerspectiveAnalysisTaskResponse self = new GetCustomTopicSelectionPerspectiveAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomTopicSelectionPerspectiveAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomTopicSelectionPerspectiveAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomTopicSelectionPerspectiveAnalysisTaskResponse setBody(GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
