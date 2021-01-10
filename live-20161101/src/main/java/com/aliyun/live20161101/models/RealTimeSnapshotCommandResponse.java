// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RealTimeSnapshotCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RealTimeSnapshotCommandResponseBody body;

    public static RealTimeSnapshotCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        RealTimeSnapshotCommandResponse self = new RealTimeSnapshotCommandResponse();
        return TeaModel.build(map, self);
    }

    public RealTimeSnapshotCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RealTimeSnapshotCommandResponse setBody(RealTimeSnapshotCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public RealTimeSnapshotCommandResponseBody getBody() {
        return this.body;
    }

}
