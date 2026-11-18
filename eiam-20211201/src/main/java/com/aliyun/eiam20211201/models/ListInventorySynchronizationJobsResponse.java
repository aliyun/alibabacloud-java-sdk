// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListInventorySynchronizationJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInventorySynchronizationJobsResponseBody body;

    public static ListInventorySynchronizationJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInventorySynchronizationJobsResponse self = new ListInventorySynchronizationJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListInventorySynchronizationJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInventorySynchronizationJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInventorySynchronizationJobsResponse setBody(ListInventorySynchronizationJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInventorySynchronizationJobsResponseBody getBody() {
        return this.body;
    }

}
