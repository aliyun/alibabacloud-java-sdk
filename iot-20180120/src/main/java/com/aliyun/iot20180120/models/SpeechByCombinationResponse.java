// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SpeechByCombinationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SpeechByCombinationResponseBody body;

    public static SpeechByCombinationResponse build(java.util.Map<String, ?> map) throws Exception {
        SpeechByCombinationResponse self = new SpeechByCombinationResponse();
        return TeaModel.build(map, self);
    }

    public SpeechByCombinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SpeechByCombinationResponse setBody(SpeechByCombinationResponseBody body) {
        this.body = body;
        return this;
    }
    public SpeechByCombinationResponseBody getBody() {
        return this.body;
    }

}
