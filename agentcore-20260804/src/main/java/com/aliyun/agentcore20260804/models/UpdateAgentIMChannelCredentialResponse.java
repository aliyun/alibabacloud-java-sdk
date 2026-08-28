// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateAgentIMChannelCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgentIMChannelCredentialResponseBody body;

    public static UpdateAgentIMChannelCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentIMChannelCredentialResponse self = new UpdateAgentIMChannelCredentialResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentIMChannelCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentIMChannelCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentIMChannelCredentialResponse setBody(UpdateAgentIMChannelCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentIMChannelCredentialResponseBody getBody() {
        return this.body;
    }

}
