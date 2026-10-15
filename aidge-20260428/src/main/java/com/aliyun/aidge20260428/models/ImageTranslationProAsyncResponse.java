// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationProAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageTranslationProAsyncResponseBody body;

    public static ImageTranslationProAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationProAsyncResponse self = new ImageTranslationProAsyncResponse();
        return TeaModel.build(map, self);
    }

    public ImageTranslationProAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageTranslationProAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageTranslationProAsyncResponse setBody(ImageTranslationProAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageTranslationProAsyncResponseBody getBody() {
        return this.body;
    }

}
