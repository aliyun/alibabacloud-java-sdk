// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteSnapshotCallbackAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSnapshotCallbackAuthResponseBody body;

    public static DeleteSnapshotCallbackAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotCallbackAuthResponse self = new DeleteSnapshotCallbackAuthResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotCallbackAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSnapshotCallbackAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSnapshotCallbackAuthResponse setBody(DeleteSnapshotCallbackAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSnapshotCallbackAuthResponseBody getBody() {
        return this.body;
    }

}
