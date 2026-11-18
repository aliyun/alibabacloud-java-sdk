// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class GetAgentSessionModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentSessionModelResponseBody body;

    public static GetAgentSessionModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSessionModelResponse self = new GetAgentSessionModelResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentSessionModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentSessionModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentSessionModelResponse setBody(GetAgentSessionModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentSessionModelResponseBody getBody() {
        return this.body;
    }

}
