// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationPlusAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageTranslationPlusAsyncResponseBody body;

    public static ImageTranslationPlusAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationPlusAsyncResponse self = new ImageTranslationPlusAsyncResponse();
        return TeaModel.build(map, self);
    }

    public ImageTranslationPlusAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageTranslationPlusAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageTranslationPlusAsyncResponse setBody(ImageTranslationPlusAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageTranslationPlusAsyncResponseBody getBody() {
        return this.body;
    }

}
