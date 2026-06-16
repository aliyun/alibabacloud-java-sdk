// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRecognitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageRecognitionResponseBody body;

    public static ImageRecognitionResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageRecognitionResponse self = new ImageRecognitionResponse();
        return TeaModel.build(map, self);
    }

    public ImageRecognitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageRecognitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageRecognitionResponse setBody(ImageRecognitionResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageRecognitionResponseBody getBody() {
        return this.body;
    }

}
