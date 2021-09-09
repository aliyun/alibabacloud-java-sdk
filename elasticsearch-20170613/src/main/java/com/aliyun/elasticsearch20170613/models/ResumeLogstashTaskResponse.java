// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ResumeLogstashTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeLogstashTaskResponseBody body;

    public static ResumeLogstashTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeLogstashTaskResponse self = new ResumeLogstashTaskResponse();
        return TeaModel.build(map, self);
    }

    public ResumeLogstashTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeLogstashTaskResponse setBody(ResumeLogstashTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeLogstashTaskResponseBody getBody() {
        return this.body;
    }

}
