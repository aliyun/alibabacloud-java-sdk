// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherExpansionDialogueRefineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAITeacherExpansionDialogueRefineResponseBody body;

    public static ExecuteAITeacherExpansionDialogueRefineResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherExpansionDialogueRefineResponse self = new ExecuteAITeacherExpansionDialogueRefineResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherExpansionDialogueRefineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAITeacherExpansionDialogueRefineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAITeacherExpansionDialogueRefineResponse setBody(ExecuteAITeacherExpansionDialogueRefineResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAITeacherExpansionDialogueRefineResponseBody getBody() {
        return this.body;
    }

}
