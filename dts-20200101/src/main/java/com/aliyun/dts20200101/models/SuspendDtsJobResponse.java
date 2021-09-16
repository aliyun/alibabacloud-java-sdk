// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SuspendDtsJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SuspendDtsJobResponseBody body;

    public static SuspendDtsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendDtsJobResponse self = new SuspendDtsJobResponse();
        return TeaModel.build(map, self);
    }

    public SuspendDtsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendDtsJobResponse setBody(SuspendDtsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendDtsJobResponseBody getBody() {
        return this.body;
    }

}
