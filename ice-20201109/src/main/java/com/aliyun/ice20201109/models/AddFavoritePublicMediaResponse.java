// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddFavoritePublicMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFavoritePublicMediaResponseBody body;

    public static AddFavoritePublicMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFavoritePublicMediaResponse self = new AddFavoritePublicMediaResponse();
        return TeaModel.build(map, self);
    }

    public AddFavoritePublicMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFavoritePublicMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFavoritePublicMediaResponse setBody(AddFavoritePublicMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFavoritePublicMediaResponseBody getBody() {
        return this.body;
    }

}
