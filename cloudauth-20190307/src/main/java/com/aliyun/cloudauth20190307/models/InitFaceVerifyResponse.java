// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitFaceVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitFaceVerifyResponseBody body;

    public static InitFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        InitFaceVerifyResponse self = new InitFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public InitFaceVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitFaceVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitFaceVerifyResponse setBody(InitFaceVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public InitFaceVerifyResponseBody getBody() {
        return this.body;
    }

}
