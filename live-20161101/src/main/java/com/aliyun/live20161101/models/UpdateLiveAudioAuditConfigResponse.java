// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAudioAuditConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLiveAudioAuditConfigResponseBody body;

    public static UpdateLiveAudioAuditConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAudioAuditConfigResponse self = new UpdateLiveAudioAuditConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAudioAuditConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveAudioAuditConfigResponse setBody(UpdateLiveAudioAuditConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveAudioAuditConfigResponseBody getBody() {
        return this.body;
    }

}
