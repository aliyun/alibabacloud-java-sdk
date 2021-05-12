// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateEnvironmentWithSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEnvironmentWithSnapshotResponseBody body;

    public static CreateEnvironmentWithSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentWithSnapshotResponse self = new CreateEnvironmentWithSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentWithSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnvironmentWithSnapshotResponse setBody(CreateEnvironmentWithSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnvironmentWithSnapshotResponseBody getBody() {
        return this.body;
    }

}
