// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ResetSynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetSynchronizationJobResponseBody body;

    public static ResetSynchronizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetSynchronizationJobResponse self = new ResetSynchronizationJobResponse();
        return TeaModel.build(map, self);
    }

    public ResetSynchronizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetSynchronizationJobResponse setBody(ResetSynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetSynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
