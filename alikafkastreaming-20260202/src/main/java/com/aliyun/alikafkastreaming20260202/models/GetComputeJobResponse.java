// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class GetComputeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetComputeJobResponseBody body;

    public static GetComputeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComputeJobResponse self = new GetComputeJobResponse();
        return TeaModel.build(map, self);
    }

    public GetComputeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComputeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComputeJobResponse setBody(GetComputeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComputeJobResponseBody getBody() {
        return this.body;
    }

}
