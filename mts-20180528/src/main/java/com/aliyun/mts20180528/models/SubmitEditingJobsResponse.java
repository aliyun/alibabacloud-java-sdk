// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class SubmitEditingJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitEditingJobsResponseBody body;

    public static SubmitEditingJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitEditingJobsResponse self = new SubmitEditingJobsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitEditingJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitEditingJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitEditingJobsResponse setBody(SubmitEditingJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitEditingJobsResponseBody getBody() {
        return this.body;
    }

}
