// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StopLivyComputeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopLivyComputeResponseBody body;

    public static StopLivyComputeResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLivyComputeResponse self = new StopLivyComputeResponse();
        return TeaModel.build(map, self);
    }

    public StopLivyComputeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLivyComputeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopLivyComputeResponse setBody(StopLivyComputeResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLivyComputeResponseBody getBody() {
        return this.body;
    }

}
