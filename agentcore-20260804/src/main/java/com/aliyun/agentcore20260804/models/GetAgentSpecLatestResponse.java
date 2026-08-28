// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentSpecLatestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentSpecLatestResponseBody body;

    public static GetAgentSpecLatestResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSpecLatestResponse self = new GetAgentSpecLatestResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentSpecLatestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentSpecLatestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentSpecLatestResponse setBody(GetAgentSpecLatestResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentSpecLatestResponseBody getBody() {
        return this.body;
    }

}
