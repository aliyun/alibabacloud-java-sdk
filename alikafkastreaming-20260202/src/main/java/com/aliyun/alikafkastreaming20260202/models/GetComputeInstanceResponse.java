// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class GetComputeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetComputeInstanceResponseBody body;

    public static GetComputeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComputeInstanceResponse self = new GetComputeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetComputeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComputeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComputeInstanceResponse setBody(GetComputeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComputeInstanceResponseBody getBody() {
        return this.body;
    }

}
