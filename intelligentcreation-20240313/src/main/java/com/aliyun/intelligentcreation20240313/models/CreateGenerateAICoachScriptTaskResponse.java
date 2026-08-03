// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateGenerateAICoachScriptTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGenerateAICoachScriptTaskResponseBody body;

    public static CreateGenerateAICoachScriptTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGenerateAICoachScriptTaskResponse self = new CreateGenerateAICoachScriptTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateGenerateAICoachScriptTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGenerateAICoachScriptTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGenerateAICoachScriptTaskResponse setBody(CreateGenerateAICoachScriptTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGenerateAICoachScriptTaskResponseBody getBody() {
        return this.body;
    }

}
