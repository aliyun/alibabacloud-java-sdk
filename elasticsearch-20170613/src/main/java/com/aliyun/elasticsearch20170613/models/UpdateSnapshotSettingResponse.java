// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateSnapshotSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSnapshotSettingResponseBody body;

    public static UpdateSnapshotSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotSettingResponse self = new UpdateSnapshotSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSnapshotSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSnapshotSettingResponse setBody(UpdateSnapshotSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSnapshotSettingResponseBody getBody() {
        return this.body;
    }

}
