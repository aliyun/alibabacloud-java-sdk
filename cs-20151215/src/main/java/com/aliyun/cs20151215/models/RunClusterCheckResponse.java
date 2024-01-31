// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RunClusterCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunClusterCheckResponseBody body;

    public static RunClusterCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        RunClusterCheckResponse self = new RunClusterCheckResponse();
        return TeaModel.build(map, self);
    }

    public RunClusterCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunClusterCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunClusterCheckResponse setBody(RunClusterCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public RunClusterCheckResponseBody getBody() {
        return this.body;
    }

}
