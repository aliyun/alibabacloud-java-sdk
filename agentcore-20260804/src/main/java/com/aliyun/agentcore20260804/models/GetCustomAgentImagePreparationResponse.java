// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetCustomAgentImagePreparationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomAgentImagePreparationResponseBody body;

    public static GetCustomAgentImagePreparationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomAgentImagePreparationResponse self = new GetCustomAgentImagePreparationResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomAgentImagePreparationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomAgentImagePreparationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomAgentImagePreparationResponse setBody(GetCustomAgentImagePreparationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomAgentImagePreparationResponseBody getBody() {
        return this.body;
    }

}
