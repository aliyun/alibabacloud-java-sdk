// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ResumeInstanceRefreshResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeInstanceRefreshResponseBody body;

    public static ResumeInstanceRefreshResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeInstanceRefreshResponse self = new ResumeInstanceRefreshResponse();
        return TeaModel.build(map, self);
    }

    public ResumeInstanceRefreshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeInstanceRefreshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeInstanceRefreshResponse setBody(ResumeInstanceRefreshResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeInstanceRefreshResponseBody getBody() {
        return this.body;
    }

}
