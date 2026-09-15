// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetLumaChunkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLumaChunkResponseBody body;

    public static GetLumaChunkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLumaChunkResponse self = new GetLumaChunkResponse();
        return TeaModel.build(map, self);
    }

    public GetLumaChunkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLumaChunkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLumaChunkResponse setBody(GetLumaChunkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLumaChunkResponseBody getBody() {
        return this.body;
    }

}
