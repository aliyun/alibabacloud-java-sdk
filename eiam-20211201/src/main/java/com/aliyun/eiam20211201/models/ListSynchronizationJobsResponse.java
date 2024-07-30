// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListSynchronizationJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSynchronizationJobsResponseBody body;

    public static ListSynchronizationJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSynchronizationJobsResponse self = new ListSynchronizationJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListSynchronizationJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSynchronizationJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSynchronizationJobsResponse setBody(ListSynchronizationJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSynchronizationJobsResponseBody getBody() {
        return this.body;
    }

}
