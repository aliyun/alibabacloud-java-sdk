// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetConsistencySnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConsistencySnapshotResponseBody body;

    public static GetConsistencySnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsistencySnapshotResponse self = new GetConsistencySnapshotResponse();
        return TeaModel.build(map, self);
    }

    public GetConsistencySnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsistencySnapshotResponse setBody(GetConsistencySnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsistencySnapshotResponseBody getBody() {
        return this.body;
    }

}
