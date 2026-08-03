// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachScriptGenerateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAICoachScriptGenerateTaskResponseBody body;

    public static GetAICoachScriptGenerateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachScriptGenerateTaskResponse self = new GetAICoachScriptGenerateTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetAICoachScriptGenerateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAICoachScriptGenerateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAICoachScriptGenerateTaskResponse setBody(GetAICoachScriptGenerateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAICoachScriptGenerateTaskResponseBody getBody() {
        return this.body;
    }

}
