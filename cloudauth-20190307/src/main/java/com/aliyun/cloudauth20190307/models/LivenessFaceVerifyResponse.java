// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class LivenessFaceVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LivenessFaceVerifyResponseBody body;

    public static LivenessFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        LivenessFaceVerifyResponse self = new LivenessFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public LivenessFaceVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LivenessFaceVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LivenessFaceVerifyResponse setBody(LivenessFaceVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public LivenessFaceVerifyResponseBody getBody() {
        return this.body;
    }

}
