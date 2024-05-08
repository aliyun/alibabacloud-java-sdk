// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class FaceRecognizeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FaceRecognizeResponseBody body;

    public static FaceRecognizeResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceRecognizeResponse self = new FaceRecognizeResponse();
        return TeaModel.build(map, self);
    }

    public FaceRecognizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceRecognizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FaceRecognizeResponse setBody(FaceRecognizeResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceRecognizeResponseBody getBody() {
        return this.body;
    }

}
