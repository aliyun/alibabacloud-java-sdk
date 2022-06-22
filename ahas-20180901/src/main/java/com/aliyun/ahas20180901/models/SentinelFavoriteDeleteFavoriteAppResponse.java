// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFavoriteDeleteFavoriteAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelFavoriteDeleteFavoriteAppResponseBody body;

    public static SentinelFavoriteDeleteFavoriteAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelFavoriteDeleteFavoriteAppResponse self = new SentinelFavoriteDeleteFavoriteAppResponse();
        return TeaModel.build(map, self);
    }

    public SentinelFavoriteDeleteFavoriteAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelFavoriteDeleteFavoriteAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelFavoriteDeleteFavoriteAppResponse setBody(SentinelFavoriteDeleteFavoriteAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelFavoriteDeleteFavoriteAppResponseBody getBody() {
        return this.body;
    }

}
