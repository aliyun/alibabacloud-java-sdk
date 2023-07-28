// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetRunningJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRunningJobsResponseBody body;

    public static GetRunningJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRunningJobsResponse self = new GetRunningJobsResponse();
        return TeaModel.build(map, self);
    }

    public GetRunningJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRunningJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRunningJobsResponse setBody(GetRunningJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRunningJobsResponseBody getBody() {
        return this.body;
    }

}
