// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ExecuteAutoDisposeRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAutoDisposeRecordsResponseBody body;

    public static ExecuteAutoDisposeRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAutoDisposeRecordsResponse self = new ExecuteAutoDisposeRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAutoDisposeRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAutoDisposeRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAutoDisposeRecordsResponse setBody(ExecuteAutoDisposeRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAutoDisposeRecordsResponseBody getBody() {
        return this.body;
    }

}
