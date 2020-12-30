// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ResumeJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeJobsResponseBody body;

    public static ResumeJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeJobsResponse self = new ResumeJobsResponse();
        return TeaModel.build(map, self);
    }

    public ResumeJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeJobsResponse setBody(ResumeJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeJobsResponseBody getBody() {
        return this.body;
    }

}
