// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentResponseBody body;

    public static GetAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentResponse self = new GetAgentResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentResponse setBody(GetAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentResponseBody getBody() {
        return this.body;
    }

}
