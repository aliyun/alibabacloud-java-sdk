// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListWorkspaceQueuesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkspaceQueuesResponseBody body;

    public static ListWorkspaceQueuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceQueuesResponse self = new ListWorkspaceQueuesResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceQueuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkspaceQueuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkspaceQueuesResponse setBody(ListWorkspaceQueuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkspaceQueuesResponseBody getBody() {
        return this.body;
    }

}
