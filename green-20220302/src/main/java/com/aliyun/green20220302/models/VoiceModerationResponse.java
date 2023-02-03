// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VoiceModerationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VoiceModerationResponseBody body;

    public static VoiceModerationResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceModerationResponse self = new VoiceModerationResponse();
        return TeaModel.build(map, self);
    }

    public VoiceModerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceModerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceModerationResponse setBody(VoiceModerationResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceModerationResponseBody getBody() {
        return this.body;
    }

}
