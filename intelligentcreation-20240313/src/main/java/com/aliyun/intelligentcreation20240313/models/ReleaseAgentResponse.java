// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ReleaseAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseAgentResponseBody body;

    public static ReleaseAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAgentResponse self = new ReleaseAgentResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseAgentResponse setBody(ReleaseAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseAgentResponseBody getBody() {
        return this.body;
    }

}
