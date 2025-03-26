// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody body;

    public static ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse self = new ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse setBody(ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody getBody() {
        return this.body;
    }

}
