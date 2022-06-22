// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFavoriteListFavoriteAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelFavoriteListFavoriteAppsResponseBody body;

    public static SentinelFavoriteListFavoriteAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelFavoriteListFavoriteAppsResponse self = new SentinelFavoriteListFavoriteAppsResponse();
        return TeaModel.build(map, self);
    }

    public SentinelFavoriteListFavoriteAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelFavoriteListFavoriteAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelFavoriteListFavoriteAppsResponse setBody(SentinelFavoriteListFavoriteAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelFavoriteListFavoriteAppsResponseBody getBody() {
        return this.body;
    }

}
