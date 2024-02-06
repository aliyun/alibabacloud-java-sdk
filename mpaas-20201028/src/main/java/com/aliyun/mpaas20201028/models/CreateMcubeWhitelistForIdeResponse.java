// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeWhitelistForIdeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcubeWhitelistForIdeResponseBody body;

    public static CreateMcubeWhitelistForIdeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeWhitelistForIdeResponse self = new CreateMcubeWhitelistForIdeResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcubeWhitelistForIdeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcubeWhitelistForIdeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcubeWhitelistForIdeResponse setBody(CreateMcubeWhitelistForIdeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeWhitelistForIdeResponseBody getBody() {
        return this.body;
    }

}
