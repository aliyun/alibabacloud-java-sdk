// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RunPipelinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunPipelinesResponseBody body;

    public static RunPipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        RunPipelinesResponse self = new RunPipelinesResponse();
        return TeaModel.build(map, self);
    }

    public RunPipelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunPipelinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunPipelinesResponse setBody(RunPipelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public RunPipelinesResponseBody getBody() {
        return this.body;
    }

}
