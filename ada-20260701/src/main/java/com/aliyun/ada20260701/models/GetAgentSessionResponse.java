// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class GetAgentSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentSessionResponseBody body;

    public static GetAgentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSessionResponse self = new GetAgentSessionResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentSessionResponse setBody(GetAgentSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentSessionResponseBody getBody() {
        return this.body;
    }

}
