// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataAgentMemoryResponseBody body;

    public static ListDataAgentMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentMemoryResponse self = new ListDataAgentMemoryResponse();
        return TeaModel.build(map, self);
    }

    public ListDataAgentMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataAgentMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataAgentMemoryResponse setBody(ListDataAgentMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataAgentMemoryResponseBody getBody() {
        return this.body;
    }

}
