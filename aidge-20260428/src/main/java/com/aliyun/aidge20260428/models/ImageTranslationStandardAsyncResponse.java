// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationStandardAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageTranslationStandardAsyncResponseBody body;

    public static ImageTranslationStandardAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationStandardAsyncResponse self = new ImageTranslationStandardAsyncResponse();
        return TeaModel.build(map, self);
    }

    public ImageTranslationStandardAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageTranslationStandardAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageTranslationStandardAsyncResponse setBody(ImageTranslationStandardAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageTranslationStandardAsyncResponseBody getBody() {
        return this.body;
    }

}
