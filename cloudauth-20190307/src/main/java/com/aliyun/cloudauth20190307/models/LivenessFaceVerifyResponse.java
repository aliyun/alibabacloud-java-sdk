// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class LivenessFaceVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public LivenessFaceVerifyResponse setBody(LivenessFaceVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public LivenessFaceVerifyResponseBody getBody() {
        return this.body;
    }

}
