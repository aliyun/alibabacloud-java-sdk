// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAudioAuditConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLiveAudioAuditConfigResponseBody body;

    public static AddLiveAudioAuditConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAudioAuditConfigResponse self = new AddLiveAudioAuditConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveAudioAuditConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveAudioAuditConfigResponse setBody(AddLiveAudioAuditConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveAudioAuditConfigResponseBody getBody() {
        return this.body;
    }

}
