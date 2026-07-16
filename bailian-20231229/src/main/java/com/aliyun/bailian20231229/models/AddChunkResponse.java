// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddChunkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddChunkResponseBody body;

    public static AddChunkResponse build(java.util.Map<String, ?> map) throws Exception {
        AddChunkResponse self = new AddChunkResponse();
        return TeaModel.build(map, self);
    }

    public AddChunkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddChunkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddChunkResponse setBody(AddChunkResponseBody body) {
        this.body = body;
        return this;
    }
    public AddChunkResponseBody getBody() {
        return this.body;
    }

}
