// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityStartCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceIdentityStartCheckResponseBody body;

    public static VoiceIdentityStartCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityStartCheckResponse self = new VoiceIdentityStartCheckResponse();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityStartCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceIdentityStartCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceIdentityStartCheckResponse setBody(VoiceIdentityStartCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceIdentityStartCheckResponseBody getBody() {
        return this.body;
    }

}
