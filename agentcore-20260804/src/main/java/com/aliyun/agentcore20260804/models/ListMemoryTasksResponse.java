// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMemoryTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMemoryTasksResponseBody body;

    public static ListMemoryTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryTasksResponse self = new ListMemoryTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListMemoryTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMemoryTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMemoryTasksResponse setBody(ListMemoryTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMemoryTasksResponseBody getBody() {
        return this.body;
    }

}
