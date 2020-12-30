// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class InitFaceVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public InitFaceVerifyResponse setBody(InitFaceVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public InitFaceVerifyResponseBody getBody() {
        return this.body;
    }

}
