// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListMemoryEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMemoryEventResponseBody body;

    public static ListMemoryEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryEventResponse self = new ListMemoryEventResponse();
        return TeaModel.build(map, self);
    }

    public ListMemoryEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMemoryEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMemoryEventResponse setBody(ListMemoryEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMemoryEventResponseBody getBody() {
        return this.body;
    }

}
