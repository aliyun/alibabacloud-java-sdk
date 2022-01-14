// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMcubeWhitelistResponseBody body;

    public static CreateMcubeWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeWhitelistResponse self = new CreateMcubeWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcubeWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcubeWhitelistResponse setBody(CreateMcubeWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeWhitelistResponseBody getBody() {
        return this.body;
    }

}
