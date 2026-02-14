// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteCustomAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomAgentResponseBody body;

    public static DeleteCustomAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomAgentResponse self = new DeleteCustomAgentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomAgentResponse setBody(DeleteCustomAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomAgentResponseBody getBody() {
        return this.body;
    }

}
