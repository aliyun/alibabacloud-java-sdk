// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class RunUserPoolSyncJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunUserPoolSyncJobResponseBody body;

    public static RunUserPoolSyncJobResponse build(java.util.Map<String, ?> map) throws Exception {
        RunUserPoolSyncJobResponse self = new RunUserPoolSyncJobResponse();
        return TeaModel.build(map, self);
    }

    public RunUserPoolSyncJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunUserPoolSyncJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunUserPoolSyncJobResponse setBody(RunUserPoolSyncJobResponseBody body) {
        this.body = body;
        return this;
    }
    public RunUserPoolSyncJobResponseBody getBody() {
        return this.body;
    }

}
