// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaProducingJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListMediaProducingJobsResponse setBody(ListMediaProducingJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaProducingJobsResponseBody getBody() {
        return this.body;
    }

}
