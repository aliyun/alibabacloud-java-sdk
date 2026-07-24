// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class StopComputeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopComputeJobResponseBody body;

    public static StopComputeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopComputeJobResponse self = new StopComputeJobResponse();
        return TeaModel.build(map, self);
    }

    public StopComputeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopComputeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopComputeJobResponse setBody(StopComputeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopComputeJobResponseBody getBody() {
        return this.body;
    }

}
