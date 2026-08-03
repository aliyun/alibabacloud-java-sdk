// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachDebugResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAICoachDebugResultResponseBody body;

    public static GetAICoachDebugResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachDebugResultResponse self = new GetAICoachDebugResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAICoachDebugResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAICoachDebugResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAICoachDebugResultResponse setBody(GetAICoachDebugResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAICoachDebugResultResponseBody getBody() {
        return this.body;
    }

}
