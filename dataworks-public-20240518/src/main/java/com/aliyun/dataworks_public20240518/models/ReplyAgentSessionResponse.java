// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ReplyAgentSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplyAgentSessionResponseBody body;

    public static ReplyAgentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplyAgentSessionResponse self = new ReplyAgentSessionResponse();
        return TeaModel.build(map, self);
    }

    public ReplyAgentSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplyAgentSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplyAgentSessionResponse setBody(ReplyAgentSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplyAgentSessionResponseBody getBody() {
        return this.body;
    }

}
