// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAppSnapshotConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveAppSnapshotConfigResponseBody body;

    public static DeleteLiveAppSnapshotConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAppSnapshotConfigResponse self = new DeleteLiveAppSnapshotConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAppSnapshotConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveAppSnapshotConfigResponse setBody(DeleteLiveAppSnapshotConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveAppSnapshotConfigResponseBody getBody() {
        return this.body;
    }

}
