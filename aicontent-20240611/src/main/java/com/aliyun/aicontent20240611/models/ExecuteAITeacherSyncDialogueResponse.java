// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherSyncDialogueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAITeacherSyncDialogueResponseBody body;

    public static ExecuteAITeacherSyncDialogueResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherSyncDialogueResponse self = new ExecuteAITeacherSyncDialogueResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherSyncDialogueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAITeacherSyncDialogueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAITeacherSyncDialogueResponse setBody(ExecuteAITeacherSyncDialogueResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAITeacherSyncDialogueResponseBody getBody() {
        return this.body;
    }

}
