// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GenerateWebSocketSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateWebSocketSignResponseBody body;

    public static GenerateWebSocketSignResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateWebSocketSignResponse self = new GenerateWebSocketSignResponse();
        return TeaModel.build(map, self);
    }

    public GenerateWebSocketSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateWebSocketSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateWebSocketSignResponse setBody(GenerateWebSocketSignResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateWebSocketSignResponseBody getBody() {
        return this.body;
    }

}
