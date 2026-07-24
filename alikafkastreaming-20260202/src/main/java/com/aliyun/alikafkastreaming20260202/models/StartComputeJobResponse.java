// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class StartComputeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartComputeJobResponseBody body;

    public static StartComputeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartComputeJobResponse self = new StartComputeJobResponse();
        return TeaModel.build(map, self);
    }

    public StartComputeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartComputeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartComputeJobResponse setBody(StartComputeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartComputeJobResponseBody getBody() {
        return this.body;
    }

}
