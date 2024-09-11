// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetTopicSelectionPerspectiveAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTopicSelectionPerspectiveAnalysisTaskResponseBody body;

    public static GetTopicSelectionPerspectiveAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTopicSelectionPerspectiveAnalysisTaskResponse self = new GetTopicSelectionPerspectiveAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTopicSelectionPerspectiveAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTopicSelectionPerspectiveAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTopicSelectionPerspectiveAnalysisTaskResponse setBody(GetTopicSelectionPerspectiveAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTopicSelectionPerspectiveAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
