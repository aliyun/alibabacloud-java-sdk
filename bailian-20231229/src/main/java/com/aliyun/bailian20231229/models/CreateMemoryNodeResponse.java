// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateMemoryNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMemoryNodeResponseBody body;

    public static CreateMemoryNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryNodeResponse self = new CreateMemoryNodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateMemoryNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMemoryNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMemoryNodeResponse setBody(CreateMemoryNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMemoryNodeResponseBody getBody() {
        return this.body;
    }

}
