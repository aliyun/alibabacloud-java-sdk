// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class CreateComputeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateComputeJobResponseBody body;

    public static CreateComputeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeJobResponse self = new CreateComputeJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateComputeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComputeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComputeJobResponse setBody(CreateComputeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComputeJobResponseBody getBody() {
        return this.body;
    }

}
