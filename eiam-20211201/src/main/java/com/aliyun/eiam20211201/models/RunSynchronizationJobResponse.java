// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RunSynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunSynchronizationJobResponseBody body;

    public static RunSynchronizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        RunSynchronizationJobResponse self = new RunSynchronizationJobResponse();
        return TeaModel.build(map, self);
    }

    public RunSynchronizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunSynchronizationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunSynchronizationJobResponse setBody(RunSynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public RunSynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
