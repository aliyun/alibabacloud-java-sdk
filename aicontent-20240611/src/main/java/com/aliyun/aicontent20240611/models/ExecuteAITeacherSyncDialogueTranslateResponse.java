// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherSyncDialogueTranslateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAITeacherSyncDialogueTranslateResponseBody body;

    public static ExecuteAITeacherSyncDialogueTranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherSyncDialogueTranslateResponse self = new ExecuteAITeacherSyncDialogueTranslateResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherSyncDialogueTranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAITeacherSyncDialogueTranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAITeacherSyncDialogueTranslateResponse setBody(ExecuteAITeacherSyncDialogueTranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAITeacherSyncDialogueTranslateResponseBody getBody() {
        return this.body;
    }

}
