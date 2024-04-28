// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListBatchMediaProducingJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBatchMediaProducingJobsResponseBody body;

    public static ListBatchMediaProducingJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBatchMediaProducingJobsResponse self = new ListBatchMediaProducingJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListBatchMediaProducingJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBatchMediaProducingJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBatchMediaProducingJobsResponse setBody(ListBatchMediaProducingJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBatchMediaProducingJobsResponseBody getBody() {
        return this.body;
    }

}
