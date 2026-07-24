// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class ReopenComputeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReopenComputeInstanceResponseBody body;

    public static ReopenComputeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReopenComputeInstanceResponse self = new ReopenComputeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReopenComputeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReopenComputeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReopenComputeInstanceResponse setBody(ReopenComputeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReopenComputeInstanceResponseBody getBody() {
        return this.body;
    }

}
