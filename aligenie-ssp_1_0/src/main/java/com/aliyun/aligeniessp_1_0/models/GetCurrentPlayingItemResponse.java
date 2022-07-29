// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetCurrentPlayingItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCurrentPlayingItemResponseBody body;

    public static GetCurrentPlayingItemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentPlayingItemResponse self = new GetCurrentPlayingItemResponse();
        return TeaModel.build(map, self);
    }

    public GetCurrentPlayingItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCurrentPlayingItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCurrentPlayingItemResponse setBody(GetCurrentPlayingItemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCurrentPlayingItemResponseBody getBody() {
        return this.body;
    }

}
