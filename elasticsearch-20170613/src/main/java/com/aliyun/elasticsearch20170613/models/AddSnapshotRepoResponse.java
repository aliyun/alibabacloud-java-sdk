// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class AddSnapshotRepoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddSnapshotRepoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSnapshotRepoResponse setBody(AddSnapshotRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSnapshotRepoResponseBody getBody() {
        return this.body;
    }

}
