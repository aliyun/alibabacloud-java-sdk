// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ShareSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ShareSnapshotResponseBody body;

    public static ShareSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        ShareSnapshotResponse self = new ShareSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public ShareSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ShareSnapshotResponse setBody(ShareSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public ShareSnapshotResponseBody getBody() {
        return this.body;
    }

}
