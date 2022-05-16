// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class AdaptGameVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AdaptGameVersionResponseBody body;

    public static AdaptGameVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        AdaptGameVersionResponse self = new AdaptGameVersionResponse();
        return TeaModel.build(map, self);
    }

    public AdaptGameVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AdaptGameVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AdaptGameVersionResponse setBody(AdaptGameVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public AdaptGameVersionResponseBody getBody() {
        return this.body;
    }

}
