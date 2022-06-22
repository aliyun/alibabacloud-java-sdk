// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFavoriteAddFavoriteResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelFavoriteAddFavoriteResourceResponseBody body;

    public static SentinelFavoriteAddFavoriteResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelFavoriteAddFavoriteResourceResponse self = new SentinelFavoriteAddFavoriteResourceResponse();
        return TeaModel.build(map, self);
    }

    public SentinelFavoriteAddFavoriteResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelFavoriteAddFavoriteResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelFavoriteAddFavoriteResourceResponse setBody(SentinelFavoriteAddFavoriteResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelFavoriteAddFavoriteResourceResponseBody getBody() {
        return this.body;
    }

}
