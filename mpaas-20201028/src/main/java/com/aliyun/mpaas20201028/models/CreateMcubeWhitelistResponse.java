// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateMcubeWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcubeWhitelistResponse setBody(CreateMcubeWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeWhitelistResponseBody getBody() {
        return this.body;
    }

}
