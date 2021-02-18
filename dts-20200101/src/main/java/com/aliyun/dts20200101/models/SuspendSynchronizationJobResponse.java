// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SuspendSynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SuspendSynchronizationJobResponse setBody(SuspendSynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendSynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
