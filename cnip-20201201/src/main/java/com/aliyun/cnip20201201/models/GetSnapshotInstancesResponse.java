// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetSnapshotInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSnapshotInstancesResponseBody body;

    public static GetSnapshotInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotInstancesResponse self = new GetSnapshotInstancesResponse();
        return TeaModel.build(map, self);
    }

    public GetSnapshotInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSnapshotInstancesResponse setBody(GetSnapshotInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSnapshotInstancesResponseBody getBody() {
        return this.body;
    }

}
