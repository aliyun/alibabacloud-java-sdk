// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402.models;

import com.aliyun.tea.*;

public class GetImageCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageCacheResponseBody body;

    public static GetImageCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageCacheResponse self = new GetImageCacheResponse();
        return TeaModel.build(map, self);
    }

    public GetImageCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageCacheResponse setBody(GetImageCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageCacheResponseBody getBody() {
        return this.body;
    }

}
