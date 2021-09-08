// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SyncSpeechByCombinationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncSpeechByCombinationResponseBody body;

    public static SyncSpeechByCombinationResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncSpeechByCombinationResponse self = new SyncSpeechByCombinationResponse();
        return TeaModel.build(map, self);
    }

    public SyncSpeechByCombinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncSpeechByCombinationResponse setBody(SyncSpeechByCombinationResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncSpeechByCombinationResponseBody getBody() {
        return this.body;
    }

}
