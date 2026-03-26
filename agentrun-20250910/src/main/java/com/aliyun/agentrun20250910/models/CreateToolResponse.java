// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateToolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ToolResult body;

    public static CreateToolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateToolResponse self = new CreateToolResponse();
        return TeaModel.build(map, self);
    }

    public CreateToolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateToolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateToolResponse setBody(ToolResult body) {
        this.body = body;
        return this;
    }
    public ToolResult getBody() {
        return this.body;
    }

}
