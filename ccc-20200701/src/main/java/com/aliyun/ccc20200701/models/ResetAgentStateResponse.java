// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ResetAgentStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAgentStateResponseBody body;

    public static ResetAgentStateResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAgentStateResponse self = new ResetAgentStateResponse();
        return TeaModel.build(map, self);
    }

    public ResetAgentStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAgentStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAgentStateResponse setBody(ResetAgentStateResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAgentStateResponseBody getBody() {
        return this.body;
    }

}
