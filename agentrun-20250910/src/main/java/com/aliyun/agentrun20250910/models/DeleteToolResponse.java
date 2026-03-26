// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteToolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ToolResult body;

    public static DeleteToolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteToolResponse self = new DeleteToolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteToolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteToolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteToolResponse setBody(ToolResult body) {
        this.body = body;
        return this;
    }
    public ToolResult getBody() {
        return this.body;
    }

}
