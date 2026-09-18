// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class GenerateRelayPollerScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateRelayPollerScriptResponseBody body;

    public static GenerateRelayPollerScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateRelayPollerScriptResponse self = new GenerateRelayPollerScriptResponse();
        return TeaModel.build(map, self);
    }

    public GenerateRelayPollerScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateRelayPollerScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateRelayPollerScriptResponse setBody(GenerateRelayPollerScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateRelayPollerScriptResponseBody getBody() {
        return this.body;
    }

}
