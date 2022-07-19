// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class GetJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobsResponseBody body;

    public static GetJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobsResponse self = new GetJobsResponse();
        return TeaModel.build(map, self);
    }

    public GetJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobsResponse setBody(GetJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobsResponseBody getBody() {
        return this.body;
    }

}
