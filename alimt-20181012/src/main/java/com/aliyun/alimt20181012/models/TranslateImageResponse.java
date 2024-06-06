// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TranslateImageResponseBody body;

    public static TranslateImageResponse build(java.util.Map<String, ?> map) throws Exception {
        TranslateImageResponse self = new TranslateImageResponse();
        return TeaModel.build(map, self);
    }

    public TranslateImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TranslateImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TranslateImageResponse setBody(TranslateImageResponseBody body) {
        this.body = body;
        return this;
    }
    public TranslateImageResponseBody getBody() {
        return this.body;
    }

}
