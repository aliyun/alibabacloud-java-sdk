// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartLivyComputeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartLivyComputeResponseBody body;

    public static StartLivyComputeResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLivyComputeResponse self = new StartLivyComputeResponse();
        return TeaModel.build(map, self);
    }

    public StartLivyComputeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartLivyComputeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartLivyComputeResponse setBody(StartLivyComputeResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLivyComputeResponseBody getBody() {
        return this.body;
    }

}
