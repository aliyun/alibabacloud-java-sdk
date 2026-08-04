// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentMcpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataAgentMcpResponseBody body;

    public static DeleteDataAgentMcpResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentMcpResponse self = new DeleteDataAgentMcpResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentMcpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataAgentMcpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataAgentMcpResponse setBody(DeleteDataAgentMcpResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataAgentMcpResponseBody getBody() {
        return this.body;
    }

}
