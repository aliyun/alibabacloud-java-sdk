// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateDataAgentMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataAgentMemoryResponseBody body;

    public static UpdateDataAgentMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAgentMemoryResponse self = new UpdateDataAgentMemoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataAgentMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataAgentMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataAgentMemoryResponse setBody(UpdateDataAgentMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataAgentMemoryResponseBody getBody() {
        return this.body;
    }

}
