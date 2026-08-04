// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ModifyDataAgentMcpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDataAgentMcpResponseBody body;

    public static ModifyDataAgentMcpResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataAgentMcpResponse self = new ModifyDataAgentMcpResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDataAgentMcpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDataAgentMcpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDataAgentMcpResponse setBody(ModifyDataAgentMcpResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDataAgentMcpResponseBody getBody() {
        return this.body;
    }

}
