// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSandboxesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSandboxesResponseBody body;

    public static ListSandboxesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSandboxesResponse self = new ListSandboxesResponse();
        return TeaModel.build(map, self);
    }

    public ListSandboxesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSandboxesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSandboxesResponse setBody(ListSandboxesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSandboxesResponseBody getBody() {
        return this.body;
    }

}
