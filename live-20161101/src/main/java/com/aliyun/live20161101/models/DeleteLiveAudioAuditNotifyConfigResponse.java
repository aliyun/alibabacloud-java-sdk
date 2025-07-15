// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAudioAuditNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteLiveAudioAuditNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveAudioAuditNotifyConfigResponse setBody(DeleteLiveAudioAuditNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveAudioAuditNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
