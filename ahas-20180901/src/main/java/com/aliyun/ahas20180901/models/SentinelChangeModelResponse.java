// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelChangeModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelChangeModelResponseBody body;

    public static SentinelChangeModelResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelChangeModelResponse self = new SentinelChangeModelResponse();
        return TeaModel.build(map, self);
    }

    public SentinelChangeModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelChangeModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelChangeModelResponse setBody(SentinelChangeModelResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelChangeModelResponseBody getBody() {
        return this.body;
    }

}
