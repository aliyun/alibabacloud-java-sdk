// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveDetectNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateLiveDetectNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveDetectNotifyConfigResponse setBody(UpdateLiveDetectNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveDetectNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
