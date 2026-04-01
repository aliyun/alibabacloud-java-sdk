// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InitModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitModelResponseBody body;

    public static InitModelResponse build(java.util.Map<String, ?> map) throws Exception {
        InitModelResponse self = new InitModelResponse();
        return TeaModel.build(map, self);
    }

    public InitModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitModelResponse setBody(InitModelResponseBody body) {
        this.body = body;
        return this;
    }
    public InitModelResponseBody getBody() {
        return this.body;
    }

}
