// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageModerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageModerationResponseBody body;

    public static ImageModerationResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageModerationResponse self = new ImageModerationResponse();
        return TeaModel.build(map, self);
    }

    public ImageModerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageModerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageModerationResponse setBody(ImageModerationResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageModerationResponseBody getBody() {
        return this.body;
    }

}
