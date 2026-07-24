// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class StartComputeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartComputeInstanceResponseBody body;

    public static StartComputeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartComputeInstanceResponse self = new StartComputeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartComputeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartComputeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartComputeInstanceResponse setBody(StartComputeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartComputeInstanceResponseBody getBody() {
        return this.body;
    }

}
