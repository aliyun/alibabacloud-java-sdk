// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateEnvironmentSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEnvironmentSnapshotResponseBody body;

    public static CreateEnvironmentSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentSnapshotResponse self = new CreateEnvironmentSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnvironmentSnapshotResponse setBody(CreateEnvironmentSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnvironmentSnapshotResponseBody getBody() {
        return this.body;
    }

}
