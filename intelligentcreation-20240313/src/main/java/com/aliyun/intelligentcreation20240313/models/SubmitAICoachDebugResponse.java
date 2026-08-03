// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SubmitAICoachDebugResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAICoachDebugResponseBody body;

    public static SubmitAICoachDebugResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAICoachDebugResponse self = new SubmitAICoachDebugResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAICoachDebugResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAICoachDebugResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAICoachDebugResponse setBody(SubmitAICoachDebugResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAICoachDebugResponseBody getBody() {
        return this.body;
    }

}
