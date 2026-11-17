// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAgentInstanceMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentInstanceMemoryResponseBody body;

    public static ListAgentInstanceMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstanceMemoryResponse self = new ListAgentInstanceMemoryResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentInstanceMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentInstanceMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentInstanceMemoryResponse setBody(ListAgentInstanceMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentInstanceMemoryResponseBody getBody() {
        return this.body;
    }

}
