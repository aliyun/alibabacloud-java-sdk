// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RunClusterInspectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunClusterInspectResponseBody body;

    public static RunClusterInspectResponse build(java.util.Map<String, ?> map) throws Exception {
        RunClusterInspectResponse self = new RunClusterInspectResponse();
        return TeaModel.build(map, self);
    }

    public RunClusterInspectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunClusterInspectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunClusterInspectResponse setBody(RunClusterInspectResponseBody body) {
        this.body = body;
        return this;
    }
    public RunClusterInspectResponseBody getBody() {
        return this.body;
    }

}
