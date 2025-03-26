// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantDifficultyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteTextbookAssistantDifficultyResponseBody body;

    public static ExecuteTextbookAssistantDifficultyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantDifficultyResponse self = new ExecuteTextbookAssistantDifficultyResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantDifficultyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteTextbookAssistantDifficultyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteTextbookAssistantDifficultyResponse setBody(ExecuteTextbookAssistantDifficultyResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteTextbookAssistantDifficultyResponseBody getBody() {
        return this.body;
    }

}
