// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ResumeProcessesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeProcessesResponseBody body;

    public static ResumeProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeProcessesResponse self = new ResumeProcessesResponse();
        return TeaModel.build(map, self);
    }

    public ResumeProcessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeProcessesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeProcessesResponse setBody(ResumeProcessesResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeProcessesResponseBody getBody() {
        return this.body;
    }

}
