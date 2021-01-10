// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveSnapshotDetectPornConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLiveSnapshotDetectPornConfigResponseBody body;

    public static AddLiveSnapshotDetectPornConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveSnapshotDetectPornConfigResponse self = new AddLiveSnapshotDetectPornConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveSnapshotDetectPornConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveSnapshotDetectPornConfigResponse setBody(AddLiveSnapshotDetectPornConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveSnapshotDetectPornConfigResponseBody getBody() {
        return this.body;
    }

}
