// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class RerunJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RerunJobsResponseBody body;

    public static RerunJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        RerunJobsResponse self = new RerunJobsResponse();
        return TeaModel.build(map, self);
    }

    public RerunJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RerunJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RerunJobsResponse setBody(RerunJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public RerunJobsResponseBody getBody() {
        return this.body;
    }

}
