// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ResumePredictiveJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumePredictiveJobsResponseBody body;

    public static ResumePredictiveJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumePredictiveJobsResponse self = new ResumePredictiveJobsResponse();
        return TeaModel.build(map, self);
    }

    public ResumePredictiveJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumePredictiveJobsResponse setBody(ResumePredictiveJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumePredictiveJobsResponseBody getBody() {
        return this.body;
    }

}
