// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CancelFavoritePublicMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelFavoritePublicMediaResponseBody body;

    public static CancelFavoritePublicMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelFavoritePublicMediaResponse self = new CancelFavoritePublicMediaResponse();
        return TeaModel.build(map, self);
    }

    public CancelFavoritePublicMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelFavoritePublicMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelFavoritePublicMediaResponse setBody(CancelFavoritePublicMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelFavoritePublicMediaResponseBody getBody() {
        return this.body;
    }

}
