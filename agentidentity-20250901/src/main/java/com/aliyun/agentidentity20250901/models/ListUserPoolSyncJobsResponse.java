// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListUserPoolSyncJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserPoolSyncJobsResponseBody body;

    public static ListUserPoolSyncJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserPoolSyncJobsResponse self = new ListUserPoolSyncJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserPoolSyncJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserPoolSyncJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserPoolSyncJobsResponse setBody(ListUserPoolSyncJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserPoolSyncJobsResponseBody getBody() {
        return this.body;
    }

}
