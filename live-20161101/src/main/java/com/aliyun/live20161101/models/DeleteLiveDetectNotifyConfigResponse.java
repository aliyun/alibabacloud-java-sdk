// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDetectNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveDetectNotifyConfigResponseBody body;

    public static DeleteLiveDetectNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDetectNotifyConfigResponse self = new DeleteLiveDetectNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDetectNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveDetectNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveDetectNotifyConfigResponse setBody(DeleteLiveDetectNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveDetectNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
