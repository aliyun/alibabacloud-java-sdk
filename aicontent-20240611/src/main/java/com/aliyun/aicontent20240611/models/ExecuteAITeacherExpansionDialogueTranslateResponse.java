// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherExpansionDialogueTranslateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAITeacherExpansionDialogueTranslateResponseBody body;

    public static ExecuteAITeacherExpansionDialogueTranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherExpansionDialogueTranslateResponse self = new ExecuteAITeacherExpansionDialogueTranslateResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherExpansionDialogueTranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAITeacherExpansionDialogueTranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAITeacherExpansionDialogueTranslateResponse setBody(ExecuteAITeacherExpansionDialogueTranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAITeacherExpansionDialogueTranslateResponseBody getBody() {
        return this.body;
    }

}
