// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SuspendSynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendSynchronizationJobResponseBody body;

    public static SuspendSynchronizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendSynchronizationJobResponse self = new SuspendSynchronizationJobResponse();
        return TeaModel.build(map, self);
    }

    public SuspendSynchronizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendSynchronizationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendSynchronizationJobResponse setBody(SuspendSynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendSynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
