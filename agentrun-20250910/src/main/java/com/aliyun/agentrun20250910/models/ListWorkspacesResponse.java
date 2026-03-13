// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkspacesResult body;

    public static ListWorkspacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponse self = new ListWorkspacesResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkspacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkspacesResponse setBody(ListWorkspacesResult body) {
        this.body = body;
        return this;
    }
    public ListWorkspacesResult getBody() {
        return this.body;
    }

}
