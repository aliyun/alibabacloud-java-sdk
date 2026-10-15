// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageMattingAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageMattingAsyncResponseBody body;

    public static ImageMattingAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageMattingAsyncResponse self = new ImageMattingAsyncResponse();
        return TeaModel.build(map, self);
    }

    public ImageMattingAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageMattingAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageMattingAsyncResponse setBody(ImageMattingAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageMattingAsyncResponseBody getBody() {
        return this.body;
    }

}
