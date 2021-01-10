// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveDetectNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLiveDetectNotifyConfigResponseBody body;

    public static UpdateLiveDetectNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveDetectNotifyConfigResponse self = new UpdateLiveDetectNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveDetectNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveDetectNotifyConfigResponse setBody(UpdateLiveDetectNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveDetectNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
