// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveSnapshotNotifyConfigResponseBody body;

    public static DeleteLiveSnapshotNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSnapshotNotifyConfigResponse self = new DeleteLiveSnapshotNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSnapshotNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveSnapshotNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveSnapshotNotifyConfigResponse setBody(DeleteLiveSnapshotNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveSnapshotNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
