// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class OpenComputeEngineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenComputeEngineResponseBody body;

    public static OpenComputeEngineResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenComputeEngineResponse self = new OpenComputeEngineResponse();
        return TeaModel.build(map, self);
    }

    public OpenComputeEngineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenComputeEngineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenComputeEngineResponse setBody(OpenComputeEngineResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenComputeEngineResponseBody getBody() {
        return this.body;
    }

}
