// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class ListComputeJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComputeJobsResponseBody body;

    public static ListComputeJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComputeJobsResponse self = new ListComputeJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListComputeJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComputeJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComputeJobsResponse setBody(ListComputeJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComputeJobsResponseBody getBody() {
        return this.body;
    }

}
