// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RunInventorySynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunInventorySynchronizationJobResponseBody body;

    public static RunInventorySynchronizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        RunInventorySynchronizationJobResponse self = new RunInventorySynchronizationJobResponse();
        return TeaModel.build(map, self);
    }

    public RunInventorySynchronizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunInventorySynchronizationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunInventorySynchronizationJobResponse setBody(RunInventorySynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public RunInventorySynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
