// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMemoryResponseBody body;

    public static ListMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryResponse self = new ListMemoryResponse();
        return TeaModel.build(map, self);
    }

    public ListMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMemoryResponse setBody(ListMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMemoryResponseBody getBody() {
        return this.body;
    }

}
