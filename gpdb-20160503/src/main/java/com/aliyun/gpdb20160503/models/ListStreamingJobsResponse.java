// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListStreamingJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStreamingJobsResponseBody body;

    public static ListStreamingJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStreamingJobsResponse self = new ListStreamingJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListStreamingJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStreamingJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStreamingJobsResponse setBody(ListStreamingJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStreamingJobsResponseBody getBody() {
        return this.body;
    }

}
