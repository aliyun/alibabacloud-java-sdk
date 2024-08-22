// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMemoryResponseBody body;

    public static UpdateMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryResponse self = new UpdateMemoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMemoryResponse setBody(UpdateMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMemoryResponseBody getBody() {
        return this.body;
    }

}
