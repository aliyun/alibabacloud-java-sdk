// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRecognitionAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageRecognitionAsyncResponseBody body;

    public static ImageRecognitionAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageRecognitionAsyncResponse self = new ImageRecognitionAsyncResponse();
        return TeaModel.build(map, self);
    }

    public ImageRecognitionAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageRecognitionAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageRecognitionAsyncResponse setBody(ImageRecognitionAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageRecognitionAsyncResponseBody getBody() {
        return this.body;
    }

}
