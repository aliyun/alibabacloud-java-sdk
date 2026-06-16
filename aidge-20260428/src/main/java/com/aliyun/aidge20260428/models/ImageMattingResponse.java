// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageMattingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageMattingResponseBody body;

    public static ImageMattingResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageMattingResponse self = new ImageMattingResponse();
        return TeaModel.build(map, self);
    }

    public ImageMattingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageMattingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageMattingResponse setBody(ImageMattingResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageMattingResponseBody getBody() {
        return this.body;
    }

}
