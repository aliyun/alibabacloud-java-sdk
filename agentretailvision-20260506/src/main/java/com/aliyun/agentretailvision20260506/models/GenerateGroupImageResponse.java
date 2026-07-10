// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class GenerateGroupImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateGroupImageResponseBody body;

    public static GenerateGroupImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateGroupImageResponse self = new GenerateGroupImageResponse();
        return TeaModel.build(map, self);
    }

    public GenerateGroupImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateGroupImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateGroupImageResponse setBody(GenerateGroupImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateGroupImageResponseBody getBody() {
        return this.body;
    }

}
