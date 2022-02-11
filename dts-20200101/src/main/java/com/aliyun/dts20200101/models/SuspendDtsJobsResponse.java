// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SuspendDtsJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SuspendDtsJobsResponseBody body;

    public static SuspendDtsJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendDtsJobsResponse self = new SuspendDtsJobsResponse();
        return TeaModel.build(map, self);
    }

    public SuspendDtsJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendDtsJobsResponse setBody(SuspendDtsJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendDtsJobsResponseBody getBody() {
        return this.body;
    }

}
