// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class OpenComputePreCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenComputePreCheckResponseBody body;

    public static OpenComputePreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenComputePreCheckResponse self = new OpenComputePreCheckResponse();
        return TeaModel.build(map, self);
    }

    public OpenComputePreCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenComputePreCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenComputePreCheckResponse setBody(OpenComputePreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenComputePreCheckResponseBody getBody() {
        return this.body;
    }

}
