// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ResumeVideoFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeVideoFileResponseBody body;

    public static ResumeVideoFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeVideoFileResponse self = new ResumeVideoFileResponse();
        return TeaModel.build(map, self);
    }

    public ResumeVideoFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeVideoFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeVideoFileResponse setBody(ResumeVideoFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeVideoFileResponseBody getBody() {
        return this.body;
    }

}
