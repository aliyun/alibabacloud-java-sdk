// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBody body;

    public static ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse self = new ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse setBody(ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBody getBody() {
        return this.body;
    }

}
