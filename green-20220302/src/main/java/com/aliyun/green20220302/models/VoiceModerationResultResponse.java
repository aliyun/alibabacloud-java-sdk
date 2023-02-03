// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VoiceModerationResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VoiceModerationResultResponseBody body;

    public static VoiceModerationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceModerationResultResponse self = new VoiceModerationResultResponse();
        return TeaModel.build(map, self);
    }

    public VoiceModerationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceModerationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceModerationResultResponse setBody(VoiceModerationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceModerationResultResponseBody getBody() {
        return this.body;
    }

}
