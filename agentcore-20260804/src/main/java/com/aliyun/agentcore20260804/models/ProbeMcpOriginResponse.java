// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ProbeMcpOriginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProbeMcpOriginResponseBody body;

    public static ProbeMcpOriginResponse build(java.util.Map<String, ?> map) throws Exception {
        ProbeMcpOriginResponse self = new ProbeMcpOriginResponse();
        return TeaModel.build(map, self);
    }

    public ProbeMcpOriginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProbeMcpOriginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProbeMcpOriginResponse setBody(ProbeMcpOriginResponseBody body) {
        this.body = body;
        return this;
    }
    public ProbeMcpOriginResponseBody getBody() {
        return this.body;
    }

}
