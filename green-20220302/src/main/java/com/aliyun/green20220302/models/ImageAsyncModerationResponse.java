// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageAsyncModerationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImageAsyncModerationResponseBody body;

    public static ImageAsyncModerationResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncModerationResponse self = new ImageAsyncModerationResponse();
        return TeaModel.build(map, self);
    }

    public ImageAsyncModerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageAsyncModerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageAsyncModerationResponse setBody(ImageAsyncModerationResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageAsyncModerationResponseBody getBody() {
        return this.body;
    }

}
