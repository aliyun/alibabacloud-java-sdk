// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentResponseBody body;

    public static DeleteAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentResponse self = new DeleteAgentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentResponse setBody(DeleteAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentResponseBody getBody() {
        return this.body;
    }

}
