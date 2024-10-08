// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListScheduledPreloadJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScheduledPreloadJobsResponseBody body;

    public static ListScheduledPreloadJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledPreloadJobsResponse self = new ListScheduledPreloadJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListScheduledPreloadJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScheduledPreloadJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScheduledPreloadJobsResponse setBody(ListScheduledPreloadJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScheduledPreloadJobsResponseBody getBody() {
        return this.body;
    }

}
