// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class StopComputeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopComputeInstanceResponseBody body;

    public static StopComputeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopComputeInstanceResponse self = new StopComputeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopComputeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopComputeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopComputeInstanceResponse setBody(StopComputeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopComputeInstanceResponseBody getBody() {
        return this.body;
    }

}
