// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityUnregisterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceIdentityUnregisterResponseBody body;

    public static VoiceIdentityUnregisterResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityUnregisterResponse self = new VoiceIdentityUnregisterResponse();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityUnregisterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceIdentityUnregisterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceIdentityUnregisterResponse setBody(VoiceIdentityUnregisterResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceIdentityUnregisterResponseBody getBody() {
        return this.body;
    }

}
