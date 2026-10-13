// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMemorySessionMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMemorySessionMessagesResponseBody body;

    public static ListMemorySessionMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMemorySessionMessagesResponse self = new ListMemorySessionMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListMemorySessionMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMemorySessionMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMemorySessionMessagesResponse setBody(ListMemorySessionMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMemorySessionMessagesResponseBody getBody() {
        return this.body;
    }

}
