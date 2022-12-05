// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveSnapshotNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddLiveSnapshotNotifyConfigResponseBody body;

    public static AddLiveSnapshotNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveSnapshotNotifyConfigResponse self = new AddLiveSnapshotNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveSnapshotNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveSnapshotNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLiveSnapshotNotifyConfigResponse setBody(AddLiveSnapshotNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveSnapshotNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
