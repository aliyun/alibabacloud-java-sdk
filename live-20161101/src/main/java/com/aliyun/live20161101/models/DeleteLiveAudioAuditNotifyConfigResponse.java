// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAudioAuditNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveAudioAuditNotifyConfigResponseBody body;

    public static DeleteLiveAudioAuditNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAudioAuditNotifyConfigResponse self = new DeleteLiveAudioAuditNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAudioAuditNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveAudioAuditNotifyConfigResponse setBody(DeleteLiveAudioAuditNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveAudioAuditNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
