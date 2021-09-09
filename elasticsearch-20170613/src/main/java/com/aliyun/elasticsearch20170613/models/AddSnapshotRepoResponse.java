// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class AddSnapshotRepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSnapshotRepoResponseBody body;

    public static AddSnapshotRepoResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSnapshotRepoResponse self = new AddSnapshotRepoResponse();
        return TeaModel.build(map, self);
    }

    public AddSnapshotRepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSnapshotRepoResponse setBody(AddSnapshotRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSnapshotRepoResponseBody getBody() {
        return this.body;
    }

}
