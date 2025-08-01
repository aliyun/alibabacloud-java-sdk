// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveSnapshotDetectPornConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveSnapshotDetectPornConfigResponseBody body;

    public static UpdateLiveSnapshotDetectPornConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveSnapshotDetectPornConfigResponse self = new UpdateLiveSnapshotDetectPornConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveSnapshotDetectPornConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveSnapshotDetectPornConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveSnapshotDetectPornConfigResponse setBody(UpdateLiveSnapshotDetectPornConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveSnapshotDetectPornConfigResponseBody getBody() {
        return this.body;
    }

}
