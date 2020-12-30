// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class SubmitBatchJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitBatchJobsResponseBody body;

    public static SubmitBatchJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchJobsResponse self = new SubmitBatchJobsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitBatchJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBatchJobsResponse setBody(SubmitBatchJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitBatchJobsResponseBody getBody() {
        return this.body;
    }

}
