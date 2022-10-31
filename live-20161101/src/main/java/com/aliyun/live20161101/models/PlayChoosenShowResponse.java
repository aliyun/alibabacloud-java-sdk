// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class PlayChoosenShowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PlayChoosenShowResponseBody body;

    public static PlayChoosenShowResponse build(java.util.Map<String, ?> map) throws Exception {
        PlayChoosenShowResponse self = new PlayChoosenShowResponse();
        return TeaModel.build(map, self);
    }

    public PlayChoosenShowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PlayChoosenShowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PlayChoosenShowResponse setBody(PlayChoosenShowResponseBody body) {
        this.body = body;
        return this;
    }
    public PlayChoosenShowResponseBody getBody() {
        return this.body;
    }

}
