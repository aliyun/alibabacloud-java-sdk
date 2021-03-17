// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ColorizeImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ColorizeImageResponse setBody(ColorizeImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ColorizeImageResponseBody getBody() {
        return this.body;
    }

}
