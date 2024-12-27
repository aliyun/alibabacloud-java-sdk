// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherExpansionDialogueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAITeacherExpansionDialogueResponseBody body;

    public static ExecuteAITeacherExpansionDialogueResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherExpansionDialogueResponse self = new ExecuteAITeacherExpansionDialogueResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherExpansionDialogueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAITeacherExpansionDialogueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAITeacherExpansionDialogueResponse setBody(ExecuteAITeacherExpansionDialogueResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAITeacherExpansionDialogueResponseBody getBody() {
        return this.body;
    }

}
