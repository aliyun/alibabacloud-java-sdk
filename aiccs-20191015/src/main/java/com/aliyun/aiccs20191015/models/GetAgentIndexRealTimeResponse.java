// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentIndexRealTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentIndexRealTimeResponseBody body;

    public static GetAgentIndexRealTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentIndexRealTimeResponse self = new GetAgentIndexRealTimeResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentIndexRealTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentIndexRealTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentIndexRealTimeResponse setBody(GetAgentIndexRealTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentIndexRealTimeResponseBody getBody() {
        return this.body;
    }

}
