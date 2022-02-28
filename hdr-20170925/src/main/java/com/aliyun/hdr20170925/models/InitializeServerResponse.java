// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class InitializeServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitializeServerResponseBody body;

    public static InitializeServerResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeServerResponse self = new InitializeServerResponse();
        return TeaModel.build(map, self);
    }

    public InitializeServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeServerResponse setBody(InitializeServerResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeServerResponseBody getBody() {
        return this.body;
    }

}
