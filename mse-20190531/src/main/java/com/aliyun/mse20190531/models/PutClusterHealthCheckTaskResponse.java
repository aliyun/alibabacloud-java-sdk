// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class PutClusterHealthCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutClusterHealthCheckTaskResponseBody body;

    public static PutClusterHealthCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PutClusterHealthCheckTaskResponse self = new PutClusterHealthCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public PutClusterHealthCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutClusterHealthCheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutClusterHealthCheckTaskResponse setBody(PutClusterHealthCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PutClusterHealthCheckTaskResponseBody getBody() {
        return this.body;
    }

}
