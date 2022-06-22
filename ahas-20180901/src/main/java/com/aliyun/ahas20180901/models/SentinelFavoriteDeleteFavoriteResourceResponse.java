// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFavoriteDeleteFavoriteResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelFavoriteDeleteFavoriteResourceResponseBody body;

    public static SentinelFavoriteDeleteFavoriteResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelFavoriteDeleteFavoriteResourceResponse self = new SentinelFavoriteDeleteFavoriteResourceResponse();
        return TeaModel.build(map, self);
    }

    public SentinelFavoriteDeleteFavoriteResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelFavoriteDeleteFavoriteResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelFavoriteDeleteFavoriteResourceResponse setBody(SentinelFavoriteDeleteFavoriteResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelFavoriteDeleteFavoriteResourceResponseBody getBody() {
        return this.body;
    }

}
