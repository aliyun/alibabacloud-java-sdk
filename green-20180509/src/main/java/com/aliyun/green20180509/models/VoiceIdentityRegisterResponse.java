// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityRegisterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceIdentityRegisterResponseBody body;

    public static VoiceIdentityRegisterResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityRegisterResponse self = new VoiceIdentityRegisterResponse();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityRegisterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceIdentityRegisterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceIdentityRegisterResponse setBody(VoiceIdentityRegisterResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceIdentityRegisterResponseBody getBody() {
        return this.body;
    }

}
