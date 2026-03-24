// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class ModifyAgentPlatformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAgentPlatformResponseBody body;

    public static ModifyAgentPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgentPlatformResponse self = new ModifyAgentPlatformResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAgentPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAgentPlatformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAgentPlatformResponse setBody(ModifyAgentPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAgentPlatformResponseBody getBody() {
        return this.body;
    }

}
