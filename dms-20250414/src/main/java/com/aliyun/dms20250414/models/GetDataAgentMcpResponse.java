// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentMcpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataAgentMcpResponseBody body;

    public static GetDataAgentMcpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentMcpResponse self = new GetDataAgentMcpResponse();
        return TeaModel.build(map, self);
    }

    public GetDataAgentMcpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataAgentMcpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataAgentMcpResponse setBody(GetDataAgentMcpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataAgentMcpResponseBody getBody() {
        return this.body;
    }

}
