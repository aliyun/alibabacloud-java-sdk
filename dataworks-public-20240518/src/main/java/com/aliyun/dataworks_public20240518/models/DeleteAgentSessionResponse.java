// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteAgentSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentSessionResponseBody body;

    public static DeleteAgentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentSessionResponse self = new DeleteAgentSessionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentSessionResponse setBody(DeleteAgentSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentSessionResponseBody getBody() {
        return this.body;
    }

}
