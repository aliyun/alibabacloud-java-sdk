// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VoiceModerationCancelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceModerationCancelResponseBody body;

    public static VoiceModerationCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceModerationCancelResponse self = new VoiceModerationCancelResponse();
        return TeaModel.build(map, self);
    }

    public VoiceModerationCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceModerationCancelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceModerationCancelResponse setBody(VoiceModerationCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceModerationCancelResponseBody getBody() {
        return this.body;
    }

}
