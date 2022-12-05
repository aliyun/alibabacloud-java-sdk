// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveSnapshotNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLiveSnapshotNotifyConfigResponseBody body;

    public static UpdateLiveSnapshotNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveSnapshotNotifyConfigResponse self = new UpdateLiveSnapshotNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveSnapshotNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveSnapshotNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveSnapshotNotifyConfigResponse setBody(UpdateLiveSnapshotNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveSnapshotNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
