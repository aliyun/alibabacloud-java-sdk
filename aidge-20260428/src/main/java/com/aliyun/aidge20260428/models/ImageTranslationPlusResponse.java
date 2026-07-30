// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationPlusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageTranslationPlusResponseBody body;

    public static ImageTranslationPlusResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationPlusResponse self = new ImageTranslationPlusResponse();
        return TeaModel.build(map, self);
    }

    public ImageTranslationPlusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageTranslationPlusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageTranslationPlusResponse setBody(ImageTranslationPlusResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageTranslationPlusResponseBody getBody() {
        return this.body;
    }

}
