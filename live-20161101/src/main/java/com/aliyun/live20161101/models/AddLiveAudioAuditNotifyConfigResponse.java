// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAudioAuditNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLiveAudioAuditNotifyConfigResponseBody body;

    public static AddLiveAudioAuditNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAudioAuditNotifyConfigResponse self = new AddLiveAudioAuditNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveAudioAuditNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveAudioAuditNotifyConfigResponse setBody(AddLiveAudioAuditNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveAudioAuditNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
