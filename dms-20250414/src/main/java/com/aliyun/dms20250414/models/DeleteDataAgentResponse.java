// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataAgentResponseBody body;

    public static DeleteDataAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentResponse self = new DeleteDataAgentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataAgentResponse setBody(DeleteDataAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataAgentResponseBody getBody() {
        return this.body;
    }

}
