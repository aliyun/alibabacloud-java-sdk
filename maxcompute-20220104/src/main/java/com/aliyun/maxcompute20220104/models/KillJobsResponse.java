// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class KillJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public KillJobsResponseBody body;

    public static KillJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        KillJobsResponse self = new KillJobsResponse();
        return TeaModel.build(map, self);
    }

    public KillJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KillJobsResponse setBody(KillJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public KillJobsResponseBody getBody() {
        return this.body;
    }

}
