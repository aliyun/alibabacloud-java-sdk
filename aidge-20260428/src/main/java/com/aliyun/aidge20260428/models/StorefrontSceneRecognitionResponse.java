// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class StorefrontSceneRecognitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StorefrontSceneRecognitionResponseBody body;

    public static StorefrontSceneRecognitionResponse build(java.util.Map<String, ?> map) throws Exception {
        StorefrontSceneRecognitionResponse self = new StorefrontSceneRecognitionResponse();
        return TeaModel.build(map, self);
    }

    public StorefrontSceneRecognitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StorefrontSceneRecognitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StorefrontSceneRecognitionResponse setBody(StorefrontSceneRecognitionResponseBody body) {
        this.body = body;
        return this;
    }
    public StorefrontSceneRecognitionResponseBody getBody() {
        return this.body;
    }

}
