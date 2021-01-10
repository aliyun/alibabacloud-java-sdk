// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAppSnapshotConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLiveAppSnapshotConfigResponseBody body;

    public static AddLiveAppSnapshotConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAppSnapshotConfigResponse self = new AddLiveAppSnapshotConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveAppSnapshotConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveAppSnapshotConfigResponse setBody(AddLiveAppSnapshotConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveAppSnapshotConfigResponseBody getBody() {
        return this.body;
    }

}
