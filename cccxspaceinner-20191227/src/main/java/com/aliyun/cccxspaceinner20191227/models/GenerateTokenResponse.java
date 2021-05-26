// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GenerateTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateTokenResponseBody body;

    public static GenerateTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateTokenResponse self = new GenerateTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateTokenResponse setBody(GenerateTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateTokenResponseBody getBody() {
        return this.body;
    }

}
