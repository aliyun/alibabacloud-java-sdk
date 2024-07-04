// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class SubmitJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SubmitJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitJobsResponse setBody(SubmitJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitJobsResponseBody getBody() {
        return this.body;
    }

}
