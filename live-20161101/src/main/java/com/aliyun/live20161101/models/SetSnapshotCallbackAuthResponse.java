// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetSnapshotCallbackAuthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetSnapshotCallbackAuthResponseBody body;

    public static SetSnapshotCallbackAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSnapshotCallbackAuthResponse self = new SetSnapshotCallbackAuthResponse();
        return TeaModel.build(map, self);
    }

    public SetSnapshotCallbackAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSnapshotCallbackAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSnapshotCallbackAuthResponse setBody(SetSnapshotCallbackAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSnapshotCallbackAuthResponseBody getBody() {
        return this.body;
    }

}
