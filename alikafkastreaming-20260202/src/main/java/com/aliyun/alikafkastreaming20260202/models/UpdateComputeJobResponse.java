// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class UpdateComputeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComputeJobResponseBody body;

    public static UpdateComputeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeJobResponse self = new UpdateComputeJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComputeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComputeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComputeJobResponse setBody(UpdateComputeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComputeJobResponseBody getBody() {
        return this.body;
    }

}
