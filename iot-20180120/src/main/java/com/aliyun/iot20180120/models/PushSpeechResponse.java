// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PushSpeechResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushSpeechResponseBody body;

    public static PushSpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        PushSpeechResponse self = new PushSpeechResponse();
        return TeaModel.build(map, self);
    }

    public PushSpeechResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushSpeechResponse setBody(PushSpeechResponseBody body) {
        this.body = body;
        return this;
    }
    public PushSpeechResponseBody getBody() {
        return this.body;
    }

}
