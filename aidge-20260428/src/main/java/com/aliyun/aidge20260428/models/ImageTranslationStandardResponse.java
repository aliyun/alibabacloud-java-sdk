// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationStandardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageTranslationStandardResponseBody body;

    public static ImageTranslationStandardResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationStandardResponse self = new ImageTranslationStandardResponse();
        return TeaModel.build(map, self);
    }

    public ImageTranslationStandardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageTranslationStandardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageTranslationStandardResponse setBody(ImageTranslationStandardResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageTranslationStandardResponseBody getBody() {
        return this.body;
    }

}
