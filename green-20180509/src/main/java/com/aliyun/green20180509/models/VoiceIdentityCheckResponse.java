// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceIdentityCheckResponseBody body;

    public static VoiceIdentityCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityCheckResponse self = new VoiceIdentityCheckResponse();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceIdentityCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceIdentityCheckResponse setBody(VoiceIdentityCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceIdentityCheckResponseBody getBody() {
        return this.body;
    }

}
