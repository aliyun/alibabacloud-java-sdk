// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveSnapshotDetectPornConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateLiveSnapshotDetectPornConfigResponse setBody(UpdateLiveSnapshotDetectPornConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveSnapshotDetectPornConfigResponseBody getBody() {
        return this.body;
    }

}
