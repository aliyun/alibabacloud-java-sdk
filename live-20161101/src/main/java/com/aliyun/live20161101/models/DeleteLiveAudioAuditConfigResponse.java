// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAudioAuditConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveAudioAuditConfigResponseBody body;

    public static DeleteLiveAudioAuditConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAudioAuditConfigResponse self = new DeleteLiveAudioAuditConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAudioAuditConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveAudioAuditConfigResponse setBody(DeleteLiveAudioAuditConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveAudioAuditConfigResponseBody getBody() {
        return this.body;
    }

}
