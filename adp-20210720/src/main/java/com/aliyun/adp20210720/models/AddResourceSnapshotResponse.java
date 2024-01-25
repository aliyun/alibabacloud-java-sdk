// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddResourceSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddResourceSnapshotResponseBody body;

    public static AddResourceSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        AddResourceSnapshotResponse self = new AddResourceSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public AddResourceSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddResourceSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddResourceSnapshotResponse setBody(AddResourceSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public AddResourceSnapshotResponseBody getBody() {
        return this.body;
    }

}
