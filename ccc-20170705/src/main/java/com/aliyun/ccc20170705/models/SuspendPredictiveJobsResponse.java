// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class SuspendPredictiveJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SuspendPredictiveJobsResponseBody body;

    public static SuspendPredictiveJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendPredictiveJobsResponse self = new SuspendPredictiveJobsResponse();
        return TeaModel.build(map, self);
    }

    public SuspendPredictiveJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendPredictiveJobsResponse setBody(SuspendPredictiveJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendPredictiveJobsResponseBody getBody() {
        return this.body;
    }

}
