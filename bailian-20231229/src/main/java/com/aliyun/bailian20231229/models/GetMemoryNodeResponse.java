// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetMemoryNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMemoryNodeResponseBody body;

    public static GetMemoryNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryNodeResponse self = new GetMemoryNodeResponse();
        return TeaModel.build(map, self);
    }

    public GetMemoryNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemoryNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemoryNodeResponse setBody(GetMemoryNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemoryNodeResponseBody getBody() {
        return this.body;
    }

}
