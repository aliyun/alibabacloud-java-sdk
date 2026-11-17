// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetAiModelSourceEditImpactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiModelSourceEditImpactResponseBody body;

    public static GetAiModelSourceEditImpactResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiModelSourceEditImpactResponse self = new GetAiModelSourceEditImpactResponse();
        return TeaModel.build(map, self);
    }

    public GetAiModelSourceEditImpactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiModelSourceEditImpactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiModelSourceEditImpactResponse setBody(GetAiModelSourceEditImpactResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiModelSourceEditImpactResponseBody getBody() {
        return this.body;
    }

}
