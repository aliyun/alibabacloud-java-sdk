// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AbortPredictiveJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AbortPredictiveJobsResponseBody body;

    public static AbortPredictiveJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortPredictiveJobsResponse self = new AbortPredictiveJobsResponse();
        return TeaModel.build(map, self);
    }

    public AbortPredictiveJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortPredictiveJobsResponse setBody(AbortPredictiveJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortPredictiveJobsResponseBody getBody() {
        return this.body;
    }

}
