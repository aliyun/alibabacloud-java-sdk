// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeWhitelistForIdeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateMcubeWhitelistForIdeResponse setBody(CreateMcubeWhitelistForIdeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeWhitelistForIdeResponseBody getBody() {
        return this.body;
    }

}
