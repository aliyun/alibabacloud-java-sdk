// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationProResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageTranslationProResponseBody body;

    public static ImageTranslationProResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationProResponse self = new ImageTranslationProResponse();
        return TeaModel.build(map, self);
    }

    public ImageTranslationProResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageTranslationProResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageTranslationProResponse setBody(ImageTranslationProResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageTranslationProResponseBody getBody() {
        return this.body;
    }

}
