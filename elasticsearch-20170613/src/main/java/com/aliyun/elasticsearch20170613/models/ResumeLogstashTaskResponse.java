// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ResumeLogstashTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ResumeLogstashTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeLogstashTaskResponse setBody(ResumeLogstashTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeLogstashTaskResponseBody getBody() {
        return this.body;
    }

}
