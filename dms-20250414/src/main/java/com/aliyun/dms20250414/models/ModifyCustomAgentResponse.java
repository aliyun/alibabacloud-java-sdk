// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ModifyCustomAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCustomAgentResponseBody body;

    public static ModifyCustomAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomAgentResponse self = new ModifyCustomAgentResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCustomAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCustomAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCustomAgentResponse setBody(ModifyCustomAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustomAgentResponseBody getBody() {
        return this.body;
    }

}
