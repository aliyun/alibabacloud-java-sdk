// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AddDataAgentMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDataAgentMemoryResponseBody body;

    public static AddDataAgentMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDataAgentMemoryResponse self = new AddDataAgentMemoryResponse();
        return TeaModel.build(map, self);
    }

    public AddDataAgentMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDataAgentMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDataAgentMemoryResponse setBody(AddDataAgentMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDataAgentMemoryResponseBody getBody() {
        return this.body;
    }

}
