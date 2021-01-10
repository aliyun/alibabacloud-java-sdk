// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotDetectPornConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveSnapshotDetectPornConfigResponseBody body;

    public static DeleteLiveSnapshotDetectPornConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSnapshotDetectPornConfigResponse self = new DeleteLiveSnapshotDetectPornConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSnapshotDetectPornConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveSnapshotDetectPornConfigResponse setBody(DeleteLiveSnapshotDetectPornConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveSnapshotDetectPornConfigResponseBody getBody() {
        return this.body;
    }

}
