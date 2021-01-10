// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAppSnapshotConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLiveAppSnapshotConfigResponseBody body;

    public static UpdateLiveAppSnapshotConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAppSnapshotConfigResponse self = new UpdateLiveAppSnapshotConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAppSnapshotConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveAppSnapshotConfigResponse setBody(UpdateLiveAppSnapshotConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveAppSnapshotConfigResponseBody getBody() {
        return this.body;
    }

}
