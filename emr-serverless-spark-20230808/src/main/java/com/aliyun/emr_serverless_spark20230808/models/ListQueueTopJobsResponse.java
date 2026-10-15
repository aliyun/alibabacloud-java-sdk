// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListQueueTopJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQueueTopJobsResponseBody body;

    public static ListQueueTopJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueueTopJobsResponse self = new ListQueueTopJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListQueueTopJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueueTopJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQueueTopJobsResponse setBody(ListQueueTopJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueueTopJobsResponseBody getBody() {
        return this.body;
    }

}
