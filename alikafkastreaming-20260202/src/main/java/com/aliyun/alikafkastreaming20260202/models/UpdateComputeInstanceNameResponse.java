// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class UpdateComputeInstanceNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComputeInstanceNameResponseBody body;

    public static UpdateComputeInstanceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeInstanceNameResponse self = new UpdateComputeInstanceNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComputeInstanceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComputeInstanceNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComputeInstanceNameResponse setBody(UpdateComputeInstanceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComputeInstanceNameResponseBody getBody() {
        return this.body;
    }

}
