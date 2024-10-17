// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunClusterResponseBody body;

    public static RunClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        RunClusterResponse self = new RunClusterResponse();
        return TeaModel.build(map, self);
    }

    public RunClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunClusterResponse setBody(RunClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public RunClusterResponseBody getBody() {
        return this.body;
    }

}
