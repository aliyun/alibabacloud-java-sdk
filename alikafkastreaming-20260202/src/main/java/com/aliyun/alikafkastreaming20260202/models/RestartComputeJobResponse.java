// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class RestartComputeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartComputeJobResponseBody body;

    public static RestartComputeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartComputeJobResponse self = new RestartComputeJobResponse();
        return TeaModel.build(map, self);
    }

    public RestartComputeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartComputeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartComputeJobResponse setBody(RestartComputeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartComputeJobResponseBody getBody() {
        return this.body;
    }

}
