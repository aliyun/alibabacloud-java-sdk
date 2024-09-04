// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityStartRegisterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceIdentityStartRegisterResponseBody body;

    public static VoiceIdentityStartRegisterResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityStartRegisterResponse self = new VoiceIdentityStartRegisterResponse();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityStartRegisterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceIdentityStartRegisterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceIdentityStartRegisterResponse setBody(VoiceIdentityStartRegisterResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceIdentityStartRegisterResponseBody getBody() {
        return this.body;
    }

}
