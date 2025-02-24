// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAICoachScriptResponseBody body;

    public static GetAICoachScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachScriptResponse self = new GetAICoachScriptResponse();
        return TeaModel.build(map, self);
    }

    public GetAICoachScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAICoachScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAICoachScriptResponse setBody(GetAICoachScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAICoachScriptResponseBody getBody() {
        return this.body;
    }

}
