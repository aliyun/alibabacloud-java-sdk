// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CancelFavoritePublicMediaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CancelFavoritePublicMediaResponse setBody(CancelFavoritePublicMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelFavoritePublicMediaResponseBody getBody() {
        return this.body;
    }

}
