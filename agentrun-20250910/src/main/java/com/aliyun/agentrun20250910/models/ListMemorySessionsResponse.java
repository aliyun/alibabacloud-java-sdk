// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListMemorySessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMemorySessionsResponseBody body;

    public static ListMemorySessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMemorySessionsResponse self = new ListMemorySessionsResponse();
        return TeaModel.build(map, self);
    }

    public ListMemorySessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMemorySessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMemorySessionsResponse setBody(ListMemorySessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMemorySessionsResponseBody getBody() {
        return this.body;
    }

}
