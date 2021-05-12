// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class InitSnapshotInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitSnapshotInstanceResponseBody body;

    public static InitSnapshotInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        InitSnapshotInstanceResponse self = new InitSnapshotInstanceResponse();
        return TeaModel.build(map, self);
    }

    public InitSnapshotInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitSnapshotInstanceResponse setBody(InitSnapshotInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public InitSnapshotInstanceResponseBody getBody() {
        return this.body;
    }

}
