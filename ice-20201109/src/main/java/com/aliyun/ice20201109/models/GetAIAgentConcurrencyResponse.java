// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAIAgentConcurrencyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAIAgentConcurrencyResponseBody body;

    public static GetAIAgentConcurrencyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIAgentConcurrencyResponse self = new GetAIAgentConcurrencyResponse();
        return TeaModel.build(map, self);
    }

    public GetAIAgentConcurrencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIAgentConcurrencyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAIAgentConcurrencyResponse setBody(GetAIAgentConcurrencyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIAgentConcurrencyResponseBody getBody() {
        return this.body;
    }

}
