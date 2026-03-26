// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateToolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ToolResult body;

    public static UpdateToolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateToolResponse self = new UpdateToolResponse();
        return TeaModel.build(map, self);
    }

    public UpdateToolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateToolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateToolResponse setBody(ToolResult body) {
        this.body = body;
        return this;
    }
    public ToolResult getBody() {
        return this.body;
    }

}
