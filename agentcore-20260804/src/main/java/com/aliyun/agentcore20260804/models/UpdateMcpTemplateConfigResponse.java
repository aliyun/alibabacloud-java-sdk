// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMcpTemplateConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMcpTemplateConfigResponseBody body;

    public static UpdateMcpTemplateConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpTemplateConfigResponse self = new UpdateMcpTemplateConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMcpTemplateConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMcpTemplateConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMcpTemplateConfigResponse setBody(UpdateMcpTemplateConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMcpTemplateConfigResponseBody getBody() {
        return this.body;
    }

}
