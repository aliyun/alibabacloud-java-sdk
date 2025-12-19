// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InitiatePptCreationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitiatePptCreationResponseBody body;

    public static InitiatePptCreationResponse build(java.util.Map<String, ?> map) throws Exception {
        InitiatePptCreationResponse self = new InitiatePptCreationResponse();
        return TeaModel.build(map, self);
    }

    public InitiatePptCreationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitiatePptCreationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitiatePptCreationResponse setBody(InitiatePptCreationResponseBody body) {
        this.body = body;
        return this;
    }
    public InitiatePptCreationResponseBody getBody() {
        return this.body;
    }

}
