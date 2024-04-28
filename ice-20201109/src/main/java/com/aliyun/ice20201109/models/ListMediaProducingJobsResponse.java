// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaProducingJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaProducingJobsResponseBody body;

    public static ListMediaProducingJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaProducingJobsResponse self = new ListMediaProducingJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaProducingJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaProducingJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaProducingJobsResponse setBody(ListMediaProducingJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaProducingJobsResponseBody getBody() {
        return this.body;
    }

}
