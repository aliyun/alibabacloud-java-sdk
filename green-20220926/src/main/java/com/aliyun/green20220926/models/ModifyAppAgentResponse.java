// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyAppAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppAgentResponseBody body;

    public static ModifyAppAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppAgentResponse self = new ModifyAppAgentResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppAgentResponse setBody(ModifyAppAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppAgentResponseBody getBody() {
        return this.body;
    }

}
