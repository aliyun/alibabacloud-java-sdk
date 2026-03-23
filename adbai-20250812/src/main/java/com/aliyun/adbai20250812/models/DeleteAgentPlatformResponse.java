// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class DeleteAgentPlatformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentPlatformResponseBody body;

    public static DeleteAgentPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentPlatformResponse self = new DeleteAgentPlatformResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentPlatformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentPlatformResponse setBody(DeleteAgentPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentPlatformResponseBody getBody() {
        return this.body;
    }

}
