// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCacheTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCacheTagResponseBody body;

    public static GetCacheTagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCacheTagResponse self = new GetCacheTagResponse();
        return TeaModel.build(map, self);
    }

    public GetCacheTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCacheTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCacheTagResponse setBody(GetCacheTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCacheTagResponseBody getBody() {
        return this.body;
    }

}
