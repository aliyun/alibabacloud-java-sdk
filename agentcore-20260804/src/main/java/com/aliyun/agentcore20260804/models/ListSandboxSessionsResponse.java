// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSandboxSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSandboxSessionsResponseBody body;

    public static ListSandboxSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSandboxSessionsResponse self = new ListSandboxSessionsResponse();
        return TeaModel.build(map, self);
    }

    public ListSandboxSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSandboxSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSandboxSessionsResponse setBody(ListSandboxSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSandboxSessionsResponseBody getBody() {
        return this.body;
    }

}
