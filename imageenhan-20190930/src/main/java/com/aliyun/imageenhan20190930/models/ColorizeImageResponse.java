// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ColorizeImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ColorizeImageResponseBody body;

    public static ColorizeImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ColorizeImageResponse self = new ColorizeImageResponse();
        return TeaModel.build(map, self);
    }

    public ColorizeImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ColorizeImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ColorizeImageResponse setBody(ColorizeImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ColorizeImageResponseBody getBody() {
        return this.body;
    }

}
