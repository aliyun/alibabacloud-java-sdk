// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataAgentMemoryResponseBody body;

    public static DeleteDataAgentMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentMemoryResponse self = new DeleteDataAgentMemoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataAgentMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataAgentMemoryResponse setBody(DeleteDataAgentMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataAgentMemoryResponseBody getBody() {
        return this.body;
    }

}
