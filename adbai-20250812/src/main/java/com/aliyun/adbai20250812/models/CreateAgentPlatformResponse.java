// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class CreateAgentPlatformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentPlatformResponseBody body;

    public static CreateAgentPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentPlatformResponse self = new CreateAgentPlatformResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentPlatformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentPlatformResponse setBody(CreateAgentPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentPlatformResponseBody getBody() {
        return this.body;
    }

}
