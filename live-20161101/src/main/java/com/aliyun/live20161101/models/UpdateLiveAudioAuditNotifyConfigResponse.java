// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAudioAuditNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLiveAudioAuditNotifyConfigResponseBody body;

    public static UpdateLiveAudioAuditNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAudioAuditNotifyConfigResponse self = new UpdateLiveAudioAuditNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAudioAuditNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveAudioAuditNotifyConfigResponse setBody(UpdateLiveAudioAuditNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveAudioAuditNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
