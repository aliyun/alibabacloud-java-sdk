// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class UpdateComputeJobCuResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComputeJobCuResponseBody body;

    public static UpdateComputeJobCuResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeJobCuResponse self = new UpdateComputeJobCuResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComputeJobCuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComputeJobCuResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComputeJobCuResponse setBody(UpdateComputeJobCuResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComputeJobCuResponseBody getBody() {
        return this.body;
    }

}
