// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitJobsResponseBody body;

    public static SubmitJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitJobsResponse self = new SubmitJobsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitJobsResponse setBody(SubmitJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitJobsResponseBody getBody() {
        return this.body;
    }

}
