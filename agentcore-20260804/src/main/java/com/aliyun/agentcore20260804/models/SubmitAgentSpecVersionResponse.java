// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class SubmitAgentSpecVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAgentSpecVersionResponseBody body;

    public static SubmitAgentSpecVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAgentSpecVersionResponse self = new SubmitAgentSpecVersionResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAgentSpecVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAgentSpecVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAgentSpecVersionResponse setBody(SubmitAgentSpecVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAgentSpecVersionResponseBody getBody() {
        return this.body;
    }

}
