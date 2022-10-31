// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class InitializeAutoShowListTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitializeAutoShowListTaskResponseBody body;

    public static InitializeAutoShowListTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeAutoShowListTaskResponse self = new InitializeAutoShowListTaskResponse();
        return TeaModel.build(map, self);
    }

    public InitializeAutoShowListTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeAutoShowListTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitializeAutoShowListTaskResponse setBody(InitializeAutoShowListTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeAutoShowListTaskResponseBody getBody() {
        return this.body;
    }

}
