// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class CreateComputeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateComputeInstanceResponseBody body;

    public static CreateComputeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeInstanceResponse self = new CreateComputeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateComputeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComputeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComputeInstanceResponse setBody(CreateComputeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComputeInstanceResponseBody getBody() {
        return this.body;
    }

}
