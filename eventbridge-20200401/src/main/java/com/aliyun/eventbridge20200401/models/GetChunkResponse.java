// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetChunkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChunkResponseBody body;

    public static GetChunkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChunkResponse self = new GetChunkResponse();
        return TeaModel.build(map, self);
    }

    public GetChunkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChunkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChunkResponse setBody(GetChunkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChunkResponseBody getBody() {
        return this.body;
    }

}
